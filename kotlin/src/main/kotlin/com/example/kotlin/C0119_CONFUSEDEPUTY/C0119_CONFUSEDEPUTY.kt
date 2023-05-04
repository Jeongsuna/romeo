package com.example.kotlin.C0119_CONFUSEDEPUTY

import android.content.Context
import android.content.pm.PackageManager

class C0119_CONFUSEDEPUTY(context: Context) {
    private val context : Context// Context 객체를 저장하기 위한 멤버 변수

    init {
        this.context = context // 생성자에서 Context 객체를 받아 멤버 변수에 저장
    }

    fun bad() {
        var flag = false
        if (context.checkCallingOrSelfPermission("com.test.testpermission") ==
                PackageManager.PERMISSION_GRANTED) {
            flag = true
        }

    }
}