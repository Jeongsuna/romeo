package romeo

class C002D_ASSTOPRIVA {
    private var foo = byteArrayOf()
    fun setFoo(msg: ByteArray) {
        /* FLAW */
        foo = msg
    }

    fun bad() {
        val data: String = "str"

        val strBytes = data.toByteArray()
        /* FLAW */
        setFoo(strBytes)
    }

}