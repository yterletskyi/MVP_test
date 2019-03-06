package com.example.yura_style.mvp_test.login_MVP

import android.util.Log
import com.example.yura_style.mvp_test.R

class LoginPresenter(private val view: LoginView, private val service: LoginService) {

    private val LOG_TAG = LoginPresenter::class.java.simpleName

    fun onLoginClicked() {
        val username = view.name
        if (username.isEmpty()) {
            view.showNameError(R.string.username_error)
            return
        }
        val password = view.password
        if (password.isEmpty()) {
            view.showPasswordError(R.string.password_error)
            return
        }
        val loginSucceeded = service.login(username, password)
        if (loginSucceeded) {
            view.startMainActivity()
            return
        }
        view.showLoginIncorrectError(R.string.login_failed)
    }
}
