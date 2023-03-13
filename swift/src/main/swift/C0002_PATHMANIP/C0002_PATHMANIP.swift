package swift.C0002_PATHMANIP

import Foundation

func bad_FileManager() -> NSData {
    let fPath : String = "/bar/\(fName.text)"
    let fManager : NSFileManager = NSFileManager.defaultManager()
    return fm.contentsAtPath(filePath)
}

func good_FileManager() -> Data? {
    let fManager = FileManager.default
    guard let docsDir = fManager.urls(for: .documentDirectory, in: .userDomainMask).first,
          let fName = fName.text,
          !fName.contains("/") && !fName.contains("../") else {
        return nil
    }
    let fURL = docsDir.appendingPathComponent("bar").appendingPathComponent(fName)
    return fManager.contents(atPath: fURL.path)
}

