//
//  C0026_RESLEAK.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation
class C0026_RESLEAK{
    
    func bad(){
        let inputFile = "path/inputFile"
        let outputFile = "path/outputFile"
        let inStream = FileHandle(forReadingAtPath: inputFile)
        let outStream = FileHandle(forWritingAtPath: outputFile)
        // 자원 활용
        inStream?.closeFile()
        outStream?.closeFile()
    }
    
    func good(){
        let inputFile = "path/inputFile"
        let outputFile = "path/outputFile"
        let inStream = FileHandle(forReadingAtPath: inputFile)
        let outStream = FileHandle(forWritingAtPath: outputFile)
        // 자원 활용
        defer{
            inStream?.closeFile()
            outStream?.closeFile()
        }
    }
}
