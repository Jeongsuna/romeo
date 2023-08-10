package com.example.kotlin.C00C_TYPEOVER.s01

class C000C_TYPEOVER_negativeNum {
    fun bad() {
        val idx = -200

        var intArray = Array(10) { i -> i * 5 }
        var negativeNum = intArray[-1]

        var negativeNumArray = Array(-200) { i -> i + 5 }

        var intArrayNegativeNum = Array(idx) { i -> i * 12 }

    }

    fun good() {
        val idx = 200

        var intArray = Array(10) { i -> i * 5 }
        var negativeNum = intArray[1]

        var negativeNumArray = Array(200) { i -> i + 5 }

        var intArrayNegativeNum = Array(idx) { i -> i * 12 }

    }
}