package com.mx.monzon.loginktmvp.model

interface IUser {
    val email:String
    val password:String
    val isDataValid:Boolean
}