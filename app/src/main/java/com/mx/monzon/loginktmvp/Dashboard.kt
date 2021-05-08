package com.mx.monzon.loginktmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.mx.monzon.loginktmvp.presenter.DashboarPresenter
import com.mx.monzon.loginktmvp.presenter.IDashboardPresenter
import com.mx.monzon.loginktmvp.view.IDashboardView
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_login.*

class Dashboard : AppCompatActivity(), IDashboardView {

    lateinit var profileName : String
    internal lateinit var presenter: IDashboardPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        try{
            presenter = DashboarPresenter(this)
            profileName= intent.getStringExtra("USER").toString()
            presenter.showuser(profileName)
        }catch (e: Exception){
            e.printStackTrace()
        }

    }

    override fun showUser(user: String) {
        tv_user.setText(profileName);
    }
}