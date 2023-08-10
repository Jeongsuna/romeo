package com.example.kotlin.C00C_TYPEOVER.s01

class C000C_TYPEOVER_accessArrayOver {
    fun bad() {
        val idx = 250
        var intArray = Array(10) { i -> i * 5 }
        var intArrayVar = Array(idx) { i -> i}

        var intAover = intArray[411]    // FLAW : 선언된 사이즈보다 큰 수에 접근합니다.
        var intAvar = intArrayVar[300]  // FLAW : 선언된 사이즈보다 큰 수에 접근합니다.

        var intArrayOf = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        var intaf = intArrayOf[20]  // FLAW : 선언된 사이즈보다 큰 수에 접근합니다.

        val stringArrayOfNull = arrayOfNulls<String>(10)
        val stringArrayOfNullVar = arrayOfNulls<String>(idx)

        var stringAof = stringArrayOfNull[15]   // FLAW : 선언된 사이즈보다 큰 수에 접근합니다.
        var stringAVarof = stringArrayOfNullVar[500]    // FLAW : 선언된 사이즈보다 큰 수에 접근합니다.
    }
    fun good() {
        val idx = 250
        var intArray = Array(10) { i -> i * 5 }
        var intArrayVar = Array(idx) { i -> i}

        var intAin = intArray[5]    // FIX : 선언된 사이즈보다 큰 작은 수로 접근합니다.
        var intAvar = intArrayVar[200]  // FIX : 선언된 사이즈보다 큰 작은 수로 접근합니다.

        var intArrayOf = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        var intaf = intArrayOf[3]   // FIX : 선언된 사이즈보다 큰 작은 수로 접근합니다.

        val stringArrayOfNull = arrayOfNulls<String>(10)
        val stringArrayOfNullVar = arrayOfNulls<String>(idx)

        var stringAof = stringArrayOfNull[7]    // FIX : 선언된 사이즈보다 큰 작은 수로 접근합니다.
        var stringAVarof = stringArrayOfNullVar[2]  // FIX : 선언된 사이즈보다 큰 작은 수로 접근합니다.

    }
}