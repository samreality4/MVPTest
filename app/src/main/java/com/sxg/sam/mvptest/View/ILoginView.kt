package com.sxg.sam.mvptest.View

interface ILoginView {

    fun onLoginSuccess(message:String)
    fun onLoginError(message:String)
}