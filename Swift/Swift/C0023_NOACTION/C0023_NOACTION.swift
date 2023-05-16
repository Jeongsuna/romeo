//
//  C0023_NOACTION.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation

class C0023_NOACTION{
    func bad() {
        let filePath = "path/to/nonexistent/file.txt"
        do {
            let fileHandle = FileHandle(forReadingAtPath: filePath)
        } catch {
            //적절한 예외 처리를 수행하지 않았습니다.
        }
    }
    
    enum FileError: Error{
        case fileNotFound
        case fileOpenFailed
    }
    
    func good() {
        let filePath = "path/to/nonexistent/file.txt"
        do {
            let fileHandle = try FileHandle(forReadingFrom: URL(fileURLWithPath: filePath))
            if fileHandle != nil{
                fileHandle.closeFile()
            } else{
                throw FileError.fileOpenFailed
            }
            
        } catch FileError.fileNotFound {
            // 파일이 존재하지 않는 경우에 대한 처리
            print("파일을 찾을 수 없습니다.")
            // 추가적인 오류 처리 로직을 구현할 수 있습니다.
        } catch FileError.fileOpenFailed {
            // 파일을 열 수 없는 경우에 대한 처리
            print("파일을 열 수 없습니다.")
            // 추가적인 오류 처리 로직을 구현할 수 있습니다.
        } catch {
            // 기타 오류에 대한 처리
            print("파일을 열 수 없습니다.")
            // 추가적인 오류 처리 로직을 구현할 수 있습니다.
        }
    }
}
