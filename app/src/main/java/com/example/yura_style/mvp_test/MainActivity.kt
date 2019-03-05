package com.example.yura_style.mvp_test

import android.content.Context
import android.content.Intent

class MainActivity(var context: Context) {

    fun startMainActivity() {
        context.startActivity(Intent(context, MainActivity::class.java))
    }
}