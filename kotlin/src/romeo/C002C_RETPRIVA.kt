package romeo

class C002C_RETPRIVA {
    private val foo: ByteArray = byteArrayOf(1,2,3)
    fun getFoo(): ByteArray {
        /* FLAW */
        return foo
    }

    fun bad() {
        /* FLAW */
        val tmp_data = getFoo()
    }
}