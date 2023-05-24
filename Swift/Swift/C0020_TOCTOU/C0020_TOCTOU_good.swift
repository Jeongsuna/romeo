//
//  C0020_TOCTOU_good.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/19.
//

import Foundation
class C0020_TOCTOU_good {
    private let accessLock = NSLock()
    func good() {
        let fileAccessThread = FileAccessThread_good(accessLock: accessLock)
        let fileDeleteThread = FileDeleteThread_good(accessLock: accessLock)
        fileAccessThread.start()
        fileDeleteThread.start()
    }
}
class FileAccessThread_good: Thread {
    private let accessLock: NSLock
    init(accessLock: NSLock) {
        self.accessLock = accessLock
    }
    override func main() {
        accessLock.lock()
        var fileContents: String? = "content"
        do {
            let fileURL = URL(fileURLWithPath: "toctou.txt")
            let fileManager = FileManager()
            if fileManager.fileExists(atPath: fileURL.path) {
                let fileHandle = try FileHandle(forReadingFrom: fileURL)
                fileContents = String(data: fileHandle.readDataToEndOfFile(), encoding: .utf8)
                fileHandle.closeFile()
            }
        } catch {
            print("IOException occurred")
        }
        defer {
            accessLock.unlock()
        }
    }
}
class FileDeleteThread_good: Thread {
    private let accessLock: NSLock
    init(accessLock: NSLock) {
        self.accessLock = accessLock
    }
    override func main() {
        accessLock.lock()
        let fileURL = URL(fileURLWithPath: "toctou.txt")
        let fileManager = FileManager()
        if fileManager.fileExists(atPath: fileURL.path) {
            do {
                try fileManager.removeItem(at: fileURL)
            } catch {
                print("Error deleting file")
            }
        }
        defer {
            accessLock.unlock()
        }
    }
}
