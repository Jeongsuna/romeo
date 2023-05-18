//
//  C0020_TOCTOU.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/18.
//

import Foundation
class C0020_TOCTOU {
    private let fileManager: FileManager
    private let filePath: String
    private let queue: DispatchQueue
    private let lock = NSLock()
    
    init(filePath: String) {
        self.fileManager = FileManager()
        self.filePath = filePath
        self.queue = DispatchQueue(label: "com.example.fileQueue")
    }

    func bad() {
        queue.async {
            if self.fileManager.fileExists(atPath: self.filePath) {
                // TOCTOU vulnerability here
                try? self.fileManager.removeItem(atPath: self.filePath)
            }
        }
        queue.async {
            // Race condition vulnerability here
            self.fileManager.createFile(atPath: self.filePath, contents: nil, attributes: nil)
        }
    }

    func good() {
        queue.async {
            self.lock.lock()
            defer {
                self.lock.unlock()
            }
            if self.fileManager.fileExists(atPath: self.filePath) {
                do {
                    try self.fileManager.removeItem(atPath: self.filePath)
                } catch {
                    print("오류: 파일을 삭제할 수 없습니다 - \(error)")
                }
            }
            do {
                 self.fileManager.createFile(atPath: self.filePath, contents: nil, attributes: nil)
            } catch {
                print("오류: 파일을 생성할 수 없습니다 - \(error)")
            }
        }
    }
}
