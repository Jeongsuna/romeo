//
//  C0024_NOCHECKER.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation

class C0024_NOCHECKER{
    func bad() {
        do {
            let url = URL(string: "https://example.com")!
            let data = try Data(contentsOf: url)
            if let line = String(data: data, encoding: .utf8)?.components(separatedBy: .newlines).first {
                let format = DateFormatter()
                format.dateFormat = "MM/dd/yy"
                if let date = format.date(from: line) {
                    // 날짜를 사용하는 코드 작성
                } else {
                    print("Date parsing failed")
                }
            } else {
                print("No data received")
            }
        } catch {
            print("Unexpected error: \(error)")
        }
    }
    
    func good() {
        do {
            let url = URL(string: "https://example.com")!
            let data = try Data(contentsOf: url)
            if let line = String(data: data, encoding: .utf8)?.components(separatedBy: .newlines).first {
                let format = DateFormatter()
                format.dateFormat = "MM/dd/yy"
                if let date = format.date(from: line) {
                    // 날짜를 사용하는 코드 작성
                } else {
                    print("Date parsing failed")
                }
            } else {
                print("No data received")
            }
        } catch let error as NSError where error.domain == NSURLErrorDomain && error.code == NSURLErrorBadURL {
            print("MalformedURLException: \(error.localizedDescription)")
        } catch let error as NSError where error.domain == NSURLErrorDomain && error.code == NSURLErrorCannotConnectToHost {
            print("IOException: \(error.localizedDescription)")
        } catch let error as NSError where error.domain == NSCocoaErrorDomain && error.code == 2048 {
            print("ParseException: \(error.localizedDescription)")
        } catch {
            print("Unexpected error: \(error)")
        }
    }
}
