//
//  C0022_LEAKMSG.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation

class C0022_LEAKMSG{
    func bad(){
        let filename = "example.txt"
        do {
            let rd = try String(contentsOfFile: filename)
            print(rd)
        } catch {
            print("Error: \(error.localizedDescription)")
        }
    }
    
    func good(){
        let filename = "example.txt"
        do {
            let rd = try String(contentsOfFile: filename)
            print(rd)
        } catch {
            // 에러 코드와 정보를 별도로 정의하고 최소 정보만 로깅
            let errorCode = "ERROR-01"
            let errorMessage = "파일 열기 에러"
            print("\(errorCode): \(errorMessage)")
        }
    }
}
