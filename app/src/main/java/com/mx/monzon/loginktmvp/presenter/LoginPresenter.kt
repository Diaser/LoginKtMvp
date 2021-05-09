package com.mx.monzon.loginktmvp.presenter

import com.mx.monzon.loginktmvp.model.User
import com.mx.monzon.loginktmvp.view.ILoginView

class LoginPresenter(internal var iLoginView: ILoginView):ILoginPresenter {
    override fun onLogin(email: String, password: String) {
        val user = User(email,password)
        val loginCode = user.isDataValid()
        if(loginCode == 0)
            iLoginView.onLoginResultOk()
        else if( loginCode == 1)
            iLoginView.onLoginError("Ingrese un correo")
        else if( loginCode == 2)
            iLoginView.onLoginError("El email es incorrecto")
        else if( loginCode == 3)
            iLoginView.onLoginError("La contraseña debe ser de mínimo 6 carácteres")

    }
}