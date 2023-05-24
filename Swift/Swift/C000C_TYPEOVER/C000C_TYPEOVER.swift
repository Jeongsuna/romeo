//
//  C000C_TYPEOVER.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/17.
//

import Foundation
import UIKitPlus
class C000C_TYPEOVER{
    func bad() {
        let stringValue = "123"
        let intValue = Int(stringValue)
        
        do {
            // FLAW:
            var strArray = [String](repeating: "0", count: intValue!)
        } catch {
            print("error occurred")
        }
    }
    
    func good() {
        let stringValue = "123"
        let intValue = Int(stringValue)
        
        do {
            // FIX: intValue 값 check
            if(intValue! < 0) {
                try errorThrow()
            }
            var strArray = [String](repeating: "0", count: intValue!)
        } catch {
            print("error occurred")
        }
    }
    
    func errorThrow() throws {
        throw MyError.errorOccurred
    }
}

enum MyError: Error {
    case errorOccurred
}
