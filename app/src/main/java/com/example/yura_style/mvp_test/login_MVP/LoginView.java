package com.example.yura_style.mvp_test.login_MVP;

public interface LoginView {
    String getName();

    String getPassword();

    void showNameError(int resId);

    void showPasswordError(int resId);

    void startMainActivity();

    void showLoginIncorrectError(int resId);
}
