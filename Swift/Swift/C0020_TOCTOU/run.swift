//
//  C0020_TOCTOU.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/16.
//

import Foundation

class C0020_TOCTOU: Thread {
    let fileAccessThread_bad = C0020_TOCTOU_bad(type: "READ")
    let fileDeleteThread_bad = C0020_TOCTOU_bad(type: "DELETE")
    func bad(){
        fileAccessThread_bad.start()
        fileDeleteThread_bad.start()
    }
    
    let fileAccessThread_good = C0020_TOCTOU_good(type: "READ")
    let fileDeleteThread_good = C0020_TOCTOU_good(type: "DELETE")
    func good(){
        fileAccessThread_good.start()
        fileDeleteThread_good.start()
    }
    
}
