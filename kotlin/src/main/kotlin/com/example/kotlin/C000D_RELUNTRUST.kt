package romeo

import javax.servlet.http.HttpServletRequest

class C000D_RELUNTRUST {
    fun bad(req: HttpServletRequest) {
        try {
            // 서버가 보유하고 있는 가격(단가) 정보를 사용자 화면에서 받아서 처리
            val price = req.getParameter("price")
            val quantity = req.getParameter("quantity")
            val total = quantity.toInt() * price.toFloat()
        } catch (e: Exception) {
            // ...
        }
    }
    
    fun good(req: HttpServletRequest){
        try {
            val item = req.getParameter("item")
            // 가격이 아니라 item 항목을 가져와서 서버가 보유하고 있는 가격정보를 이용하여 전체 가격을 계산
            val price = getPrice(item)
            val quantity = req.getParameter("quantity")
            val total = quantity.toInt() * price
        } catch (e: Exception) {
            // ...
        }
    }

    fun getPrice(item: String): Float {
        return item.toFloat()
    }

}
