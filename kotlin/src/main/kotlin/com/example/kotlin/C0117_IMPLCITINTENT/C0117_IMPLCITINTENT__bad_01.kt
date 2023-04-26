package com.example.kotlin.C0117_IMPLCITINTENT

import android.content.Intent

object C0117_IMPLCITINTENT__bad_01 {
    const val ACTION_CREATE_USER = "com.example.CreateUser"
    @JvmStatic
    fun main(args: Array<String>) {
        val un = "username"
        val pw = "password"

        // 인텐트 생성
        val intent = Intent()
        intent.action = ACTION_CREATE_USER
        intent.putExtra("Username", un)
        intent.putExtra("Password", pw)
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)

        // 브로드캐스트 전송
        sendBroadcast(intent)
    }

    fun sendBroadcast(intent: Intent) {
        println("Extra - Password: " + intent.getStringExtra("Password"))
    }
}