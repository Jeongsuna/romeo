package romeo

class C0021_NONTERM {
    fun bad(i: Int): Int {
        return i * bad(i-1)
    }

    fun good(i: Int): Int {
        if(i <= 1) {
            return 1
        }
        return i * good(i-1)
    }
}