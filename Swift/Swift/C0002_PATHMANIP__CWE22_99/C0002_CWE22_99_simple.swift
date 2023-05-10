//
//  C0002_CWE22_99_simple.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/09.
//

import Foundation

class C0002_CWE22_99_simple{
    func bad(request: URLRequest, response: URLResponse) {
        var fileName = request.url?.query?.replacingOccurrences(of: "P=", with: "") ?? "dummy.txt"
        var buffer = [UInt8](repeating: 0, count: 1024)
        var inputStream: InputStream? = nil
        var outputStream: OutputStream? = nil
        var fileHandle: FileHandle? = nil
    
        do {
            let replacen = try NSRegularExpression(pattern: "\n")
            let replacer = try NSRegularExpression(pattern: "\r")
            fileName = replacen.stringByReplacingMatches(in: fileName, options: [], range: NSRange(location: 0, length: fileName.utf16.count), withTemplate: "")
            fileName = replacer.stringByReplacingMatches(in: fileName, options: [], range: NSRange(location: 0, length: fileName.utf16.count), withTemplate: "")
    
            let httpResponse = HTTPURLResponse(url: URL(string: "http://example.com")!, statusCode: 200, httpVersion: "HTTP/1.1", headerFields: nil)!
            var headers = httpResponse.allHeaderFields as? [String: String] ?? [:]
            headers["Content-Disposition"] = "attachment;filename=\(fileName);"
    
            let fileUrl = URL(fileURLWithPath: "/datas/\(fileName)")
            fileHandle = try FileHandle(forReadingFrom: fileUrl)
            inputStream = InputStream(url: fileUrl)
            outputStream = OutputStream(toFileAtPath: NSTemporaryDirectory().appending(fileName), append: false)

            inputStream?.open()
            outputStream?.open()
    
            // FLAW : CWE-99, CWE-22
            var read: Int = inputStream?.read(&buffer, maxLength: 1024) ?? 0
            while read > 0 {
                outputStream?.write(buffer, maxLength: read)
                read = inputStream?.read(&buffer, maxLength: 1024) ?? 0
            }
        } catch let e as NSError {
            print(e)
        }
        defer {
            inputStream?.close()
            outputStream?.close()
            fileHandle?.closeFile()
        }
    }

    func good(request: URLRequest, response: URLResponse) {
        var fileName = request.url?.query?.replacingOccurrences(of: "P=", with: "") ?? "dummy.txt"
        var buffer = [UInt8](repeating: 0, count: 1024)
        var inputStream: InputStream? = nil
        var outputStream: OutputStream? = nil
        var fileHandle: FileHandle? = nil
    
        do {
            let replacen = try NSRegularExpression(pattern: "\n")
            let replacer = try NSRegularExpression(pattern: "\r")
            fileName = replacen.stringByReplacingMatches(in: fileName, options: [], range: NSRange(location: 0, length: fileName.utf16.count), withTemplate: "")
            fileName = replacer.stringByReplacingMatches(in: fileName, options: [], range: NSRange(location: 0, length: fileName.utf16.count), withTemplate: "")
    
            let httpResponse = HTTPURLResponse(url: URL(string: "http://example.com")!, statusCode: 200, httpVersion: "HTTP/1.1", headerFields: nil)!
            var headers = httpResponse.allHeaderFields as? [String: String] ?? [:]
            headers["Content-Disposition"] = "attachment;filename=\(fileName);"
    
            // 외부입력값에서 경로순회(directory traversal) 문자열을 제거하고 사용
            let replaceName1: NSRegularExpression = try NSRegularExpression(pattern: "\\.\\.")
            let replaceName2: NSRegularExpression = try NSRegularExpression(pattern: "/")
            let replaceName3: NSRegularExpression = try NSRegularExpression(pattern: "\\\\")
            fileName = replaceName1.stringByReplacingMatches(in: fileName, options: [], range: NSRange(location: 0, length: fileName.utf16.count), withTemplate: "")
            fileName = replaceName2.stringByReplacingMatches(in: fileName, options: [], range: NSRange(location: 0, length: fileName.utf16.count), withTemplate: "")
            fileName = replaceName2.stringByReplacingMatches(in: fileName, options: [], range: NSRange(location: 0, length: fileName.utf16.count), withTemplate: "")
    
            let fileUrl = URL(fileURLWithPath: "/datas/\(fileName)")
            fileHandle = try FileHandle(forReadingFrom: fileUrl)
            inputStream = InputStream(url: fileUrl)
            outputStream = OutputStream(toFileAtPath: NSTemporaryDirectory().appending(fileName), append: false)
    
            inputStream?.open()
            outputStream?.open()
    
            var read: Int = inputStream?.read(&buffer, maxLength: 1024) ?? 0
            while read > 0 {
                outputStream?.write(buffer, maxLength: read)
                read = inputStream?.read(&buffer, maxLength: 1024) ?? 0
            }
        } catch let e as NSError {
            print(e)
        }
        defer {
            inputStream?.close()
            outputStream?.close()
            fileHandle?.closeFile()
        }
    }
}
