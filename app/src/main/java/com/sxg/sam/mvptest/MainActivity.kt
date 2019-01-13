package com.sxg.sam.mvptest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sxg.sam.mvptest.Presenter.ILoginPresenter
import com.sxg.sam.mvptest.Presenter.LoginPresenter
import com.sxg.sam.mvptest.View.ILoginView
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ILoginView {
    override fun onLoginError(message: String) {
        Toasty.error(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onLoginSuccess(message: String) {
        Toasty.success(this, message, Toast.LENGTH_SHORT).show()
    }


    internal lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init

        loginPresenter = LoginPresenter(this)

        //button event
        btn_login.setOnClickListener{
            loginPresenter.onLogin(edt_email.text.toString(), edt_password.text.toString())
        }

    }
}
