//
//  C0020_TOCTOU_bad.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/19.
//
import Foundation
class C0020_TOCTOU_bad {
    func bad(){
        let fileAccessThread = FileAccessThread_bad()
        let fileDeleteThread = FileDeleteThread_bad()
        
        /* FLAW */
        fileAccessThread.start()
        fileDeleteThread.start()
    }
}

class FileAccessThread_bad: Thread {
    override func main() {
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
            print("IOException occured")
        }
    }
}
class FileDeleteThread_bad: Thread {
    override func main() {
        let fileURL = URL(fileURLWithPath: "toctou.txt")
        let fileManager = FileManager()
        if fileManager.fileExists(atPath: fileURL.path) {
            do {
                try fileManager.removeItem(at: fileURL)
            } catch {
                print("Error deleting file")
            }
        }
    }
}
