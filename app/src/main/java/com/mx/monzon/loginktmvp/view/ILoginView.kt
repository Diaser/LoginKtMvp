package com.mx.monzon.loginktmvp.view

interface ILoginView {
    fun onLoginResultOk()
    fun onLoginError(message: String)
}