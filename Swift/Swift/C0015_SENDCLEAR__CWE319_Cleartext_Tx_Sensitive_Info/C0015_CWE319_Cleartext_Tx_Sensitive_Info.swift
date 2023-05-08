//
//  C0015_CWE319_Cleartext_Tx_Sensitive_Info.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/04.
//

import Foundation

class C0015_CWE319_Cleartext_Tx_Sensitive_Info{
    
    func bad() {
        let LOCAL_USER_URL = "http://localhost:8080/bar/user"
           let req : NSMutableURLRequest = NSMutableURLRequest(url:URL(string:LOCAL_USER_URL)!)
           let conn : NSURLConnection = NSURLConnection(request:req as URLRequest, delegate:self)!
    }

    func good() {
        let LOCAL_USER_URL = "https://localhost:8080/bar/user"
        let req = NSMutableURLRequest(url: URL(string: LOCAL_USER_URL)!)
        let conn = NSURLConnection(request: req as URLRequest, delegate: self)
    }
    

}
