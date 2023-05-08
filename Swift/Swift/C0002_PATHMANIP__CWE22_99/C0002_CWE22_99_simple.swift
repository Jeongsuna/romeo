//
//  C0002_CWE22_99_simple.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/04.
//
import Foundation

class C0002_CWE22_99_simple{
    func bad() -> NSData {
        let fName : String = "test.txt"

        let fPath : String = "/bar/\(fName)"
        let fManager : FileManager = FileManager.default
        return fManager.contents(atPath: fPath)! as NSData
    }

    func good() -> Data? {
        let fName : String = "test.txt"

        let fManager = FileManager.default
        guard let docsDir = fManager.urls(for: .documentDirectory, in: .userDomainMask).first,
              let fname = fName as String?,
              !fname.contains("/") && !fname.contains("../") else {
            return nil
        }
        let fURL = docsDir.appendingPathComponent("bar").appendingPathComponent(fName)
        return fManager.contents(atPath: fURL.path)
    }
}



