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
        val barGood = bar.clone()
        return barGood
    }
}