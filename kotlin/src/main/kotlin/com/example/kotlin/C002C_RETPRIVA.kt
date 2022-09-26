package romeo

class C002C_RETPRIVA {
    private val foo: ByteArray = byteArrayOf(1,2,3)
    private val bar: ByteArray = byteArrayOf(1,2,3)
    fun bad(): ByteArray {
        /* FLAW */
        return foo
    }

    fun good(): ByteArray {
        /* FLAW */
        val bar = byteArrayOf(4,5,6)
        return bar
    }
}