package com.example.yura_style.mvp_test.login_MVP

class LoginService {
    fun login(username: String, password: String): Boolean {
        return "james" == username && "bond" == password
    }
}
