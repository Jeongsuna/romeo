//
//  C0002_PATHMANIP_02.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/12.
//

import Foundation

class C002_PATHMANIP_02{
    func bad() {
        let fName : String = "test.txt"
        let fPath : String = "/bar/\(fName)"
        let fileData = NSData(contentsOfFile: fPath)
    }

    func good() {
        let fileURL = URL(string: "https://example.com/test.txt")!
        let task = URLSession.shared.downloadTask(with: fileURL) { localURL, response, error in
            if let localURL = localURL {
                do {
                    let fileData = try Data(contentsOf: localURL)
                    // 파일 다운로드 및 읽기 성공
                    // fileData를 사용하여 처리합니다.
                } catch {
                    print("Error reading file: \(error.localizedDescription)")
                }
            } else {
                // 파일 다운로드 실패
                print("Error downloading file: \(error?.localizedDescription ?? "Unknown error")")
            }
        }
        task.resume()
    }
}
