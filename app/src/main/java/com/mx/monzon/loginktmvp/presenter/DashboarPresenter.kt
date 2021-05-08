package com.mx.monzon.loginktmvp.presenter

import com.mx.monzon.loginktmvp.view.IDashboardView

class DashboarPresenter(internal var view:IDashboardView) : IDashboardPresenter{


    override fun showuser(user: String) {
        if(user!=null && !user.equals(""))
            view.showUser(user)
    }
}