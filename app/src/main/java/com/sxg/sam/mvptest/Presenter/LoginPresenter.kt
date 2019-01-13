package com.sxg.sam.mvptest.Presenter

import com.sxg.sam.mvptest.Model.User
import com.sxg.sam.mvptest.View.ILoginView

class LoginPresenter (internal var iLoginView: ILoginView):ILoginPresenter{
    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        val isLoginSuccess = user.isDataValid
        if(isLoginSuccess)
            iLoginView.onLoginResult("Login success")
        else
            iLoginView.onLoginResult("Login error")
    }
}