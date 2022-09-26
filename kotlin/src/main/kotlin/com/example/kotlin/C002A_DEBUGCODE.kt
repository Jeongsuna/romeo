package romeo

class C002A_DEBUGCODE {

    val debug:Boolean = true

    fun bad() {
        if(debug){
            val a = byteArrayOf(0xfc.toByte(), 0x0f.toByte(), 0xc0.toByte())
            val b = byteArrayOf(0x03.toByte(), 0xf0.toByte(), 0x3f.toByte())
        }
    }

    fun good() {
        // debug X
    }
}