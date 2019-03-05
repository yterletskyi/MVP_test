package com.example.yura_style.mvp_test.login_MVP

import com.example.yura_style.mvp_test.R

class LoginPresenter(private val view: LoginView, private val service: LoginService) {

    fun onLoginClicked() {
        var username = view.name
        if (username.isEmpty()) {
            view.showNameError(R.string.username_error)
            return
        }
        var password = view.password
        if (password.isEmpty()) {
            view.showPasswordError(R.string.password_error)
            return
        }
        var loginSucceeded = service.login(username, password)
        if (loginSucceeded) {
            view.startMainActivity()
            return
        }
        view.startMainActivity()
        //view.showLoginIncorrectError(R.string.login_failed)
    }
}
