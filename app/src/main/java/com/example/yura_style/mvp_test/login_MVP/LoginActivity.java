package com.example.yura_style.mvp_test.login_MVP;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yura_style.mvp_test.MainActivity1;
import com.example.yura_style.mvp_test.R;

public class LoginActivity extends AppCompatActivity implements LoginView{

    private EditText usernameView;
    private EditText passwordView;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_login);
        usernameView = findViewById(R.id.username);
        passwordView = findViewById(R.id.password);
        presenter = new LoginPresenter(this, new LoginService());
    }

    public void onLoginClicked(View view) {
        presenter.onLoginClicked();
    }

    @Override
    public String getName() {
        return usernameView.getText().toString();
    }

    @Override
    public String getPassword() {
        return passwordView.getText().toString();
    }

    @Override
    public void showNameError(int resId) {
        usernameView.setError(getString(resId));
    }

    @Override
    public void showPasswordError(int resId) {
        passwordView.setError(getString(resId));
    }

        @Override
    public void startMainActivity() {
        new MainActivity1(this).startMainActivity();
    }

    @Override
    public void showLoginIncorrectError(int resId) {
        Toast.makeText(this, getString(resId), Toast.LENGTH_SHORT).show();
    }
}
