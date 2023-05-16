//
//  C0020_TOCTOU_good.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation

class C0020_TOCTOU_good: Thread {
    private var manageType: String
    private let fileAccessSemaphore = DispatchSemaphore(value: 1)  // Semaphore 추가
    init(type: String) {
        manageType = type
    }
    override func main() {
        do {
            if manageType == "READ" {
                let fileURL = URL(fileURLWithPath: "Test_367.txt")
                if FileManager.default.fileExists(atPath: fileURL.path) {
                    fileAccessSemaphore.wait()  // 동기화 시작
                    let content = try String(contentsOf: fileURL, encoding: .utf8)
                    fileAccessSemaphore.signal()  // 동기화 종료
                    // 파일 내용을 사용하여 필요한 작업을 수행합니다.
                }
            } else if manageType == "DELETE" {
                let fileURL = URL(fileURLWithPath: "Test_367.txt")
                if FileManager.default.fileExists(atPath: fileURL.path) {
                    fileAccessSemaphore.wait()  // 동기화 시작
                    try FileManager.default.removeItem(at: fileURL)
                    fileAccessSemaphore.signal()  // 동기화 종료
                } else {
                    // ...
                }
            }
        } catch {
            // ...
        }
    }
}
