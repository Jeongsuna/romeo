//
//  C0025_USENULL.swift
//  Swift
//
//  Created by Seungcheol on 2023/05/17.
//

import Foundation
class C0025_USENULL{
    func bad() {
        // 타입 상관없이 nil 로 선언된 변수
        let nullObject: AnyObject? = nil
        // FLAW: nullObject 가 강제 래핑(!)되어서 할당하는 경우
        let obj = nullObject!
        // FLAW: count 는 예시일 뿐 nullObject 객체의 api 또는 member 를 호출할 경우
        let obj2 = nullObject?.count
    }
    
    func good() {
        let nullObject: AnyObject? = nil
        // FIX: if 로 체크
        if let obj = nullObject {
            nullObject?.count
        }
        // FIX: guard 로 체크
        guard let obj2 = nullObject else {
            return
        }
    }
}
