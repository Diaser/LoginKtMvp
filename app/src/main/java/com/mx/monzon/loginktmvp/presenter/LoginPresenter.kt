package com.mx.monzon.loginktmvp.presenter

import com.mx.monzon.loginktmvp.model.User
import com.mx.monzon.loginktmvp.view.ILoginView

class LoginPresenter(internal var iLoginView: ILoginView):ILoginPresenter {
    override fun onLogin(email: String, password: String) {
        var user = User(email,password)
        val isLoginSuccess = user.isDataValid
        if(isLoginSuccess)
            iLoginView.onLoginResult("Login Success")
        else
            iLoginView.onLoginResult("Hace falta un dato")
    }
}