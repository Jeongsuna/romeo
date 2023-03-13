package swift.C0015_SENDCLEAR

import Foundation

func bad() {
    let LOCAL_USER_URL = "http://localhost:8080/bar/user"
    let req : NSMutableURLRequest = NSMutableURLRequest(URL:NSURL(string:LOCAL_USER_URL))
    let conn : NSURLConnection = NSURLConnection(req:req, delegate:self)
}

func good() {
    let LOCAL_USER_URL = "https://localhost:8080/bar/user"
    let req : NSMutableURLRequest = NSMutableURLRequest(URL:NSURL(string:LOCAL_USER_URL))
    let conn : NSURLConnection = NSURLConnection(req:req, delegate:self)
}