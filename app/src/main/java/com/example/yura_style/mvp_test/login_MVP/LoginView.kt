package com.example.yura_style.mvp_test.login_MVP

interface LoginView {
    val name: String

    val password: String

    fun showNameError(resId: Int)

    fun showPasswordError(resId: Int)

    fun startMainActivity()

    fun showLoginIncorrectError(resId: Int)
}
