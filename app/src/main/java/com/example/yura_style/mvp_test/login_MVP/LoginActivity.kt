package com.example.yura_style.mvp_test.login_MVP

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.yura_style.mvp_test.MainActivity
import com.example.yura_style.mvp_test.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        presenter = LoginPresenter(this, LoginService())
    }

    private var presenter: LoginPresenter? = null

    override val name: String
        get() = username_et.text.toString()

    override val password: String
        get() = password_et.text.toString()

    fun onLoginClicked(view: View) {
        presenter!!.onLoginClicked()
    }

    override fun showNameError(resId: Int) {
        username_et.error = getString(resId)
    }

    override fun showPasswordError(resId: Int) {
        password_et.error = getString(resId)
    }

    override fun startMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun showLoginIncorrectError(resId: Int) {
        Toast.makeText(this, getString(resId), Toast.LENGTH_SHORT).show()
    }
}
