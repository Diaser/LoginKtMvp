package com.mx.monzon.loginktmvp.model

import android.text.TextUtils
import android.util.Patterns

class User(override val email:String, override val password:String ):IUser {
    override fun isDataValid(): Int {
        if(TextUtils.isEmpty(email))
            return 1
        else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
            return 2
        else if(password.length <=6 )
            return 3
        else
            return 0
    }
}