package com.example.yura_style.mvp_test.login_MVP;

import com.example.yura_style.mvp_test.R;

public class LoginPresenter {
    private LoginView view;
    private LoginService service;

    public LoginPresenter(LoginView view, LoginService service) {
        this.view = view;
        this.service = service;
    }

    public void onLoginClicked() {
        String username = view.getName();
        if (username.isEmpty()) {
            view.showNameError(R.string.username_error);
            return;
        }
        String password = view.getPassword();
        if (password.isEmpty()) {
            view.showPasswordError(R.string.password_error);
            return;
        }
        boolean loginSucceeded = service.login(username, password);
        if (loginSucceeded) {
            view.startMainActivity();
            return;
        }
        view.showLoginIncorrectError(R.string.login_failed);
    }
}
