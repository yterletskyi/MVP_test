package com.example.yura_style.mvp_test.login_MVP;

class LoginService {
    public boolean login(String username, String password) {
        return "james".equals(username) && "bond".equals(password);
    }
}
