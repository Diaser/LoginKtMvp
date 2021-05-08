package com.mx.monzon.loginktmvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.mx.monzon.loginktmvp.presenter.ILoginPresenter
import com.mx.monzon.loginktmvp.presenter.LoginPresenter
import com.mx.monzon.loginktmvp.view.ILoginView
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), ILoginView {

    internal lateinit var loginPresenter: ILoginPresenter
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        try{
            /*var btn_login =  findViewById(R.id.btn_login) as Button
            var editUser = findViewById(R.id.edit_user) as EditText
            var editPassword = findViewById(R.id.edit_password) as EditText*/
            loginPresenter = LoginPresenter(this)

            btnLogin.setOnClickListener{
                loginPresenter.onLogin(edtUser.text.toString(), edtPassword.text.toString())
            }
        }catch (e: Exception){
            e.printStackTrace()
        }


    }

    override fun onLoginResult(message: String) {
        if(message.equals("Login Success")){
            val intent = Intent(this,Dashboard::class.java)
            intent.putExtra("USER", edtUser.text.toString())
            startActivity(intent)
        }else
            Toasty.info(this, message, Toast.LENGTH_SHORT).show()
    }
}