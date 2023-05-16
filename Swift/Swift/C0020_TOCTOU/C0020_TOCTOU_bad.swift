//
//  C0020_TOCTOU_bad.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation

class C0020_TOCTOU_bad: Thread {
    private var manageType: String
    init(type: String) {
        manageType = type
    }
    override func main() {
        do {
            if manageType == "READ" {
                let fileURL = URL(fileURLWithPath: "Test_367.txt")
                if FileManager.default.fileExists(atPath: fileURL.path) {
                    let content = try String(contentsOf: fileURL, encoding: .utf8)
                    // 파일 내용을 사용하여 필요한 작업을 수행합니다.
                }
            } else if manageType == "DELETE" {
                let fileURL = URL(fileURLWithPath: "Test_367.txt")
                if FileManager.default.fileExists(atPath: fileURL.path) {
                    try FileManager.default.removeItem(at: fileURL)
                } else {
                    // ...
                }
            }
        } catch {
            // ...
        }
    }
}
