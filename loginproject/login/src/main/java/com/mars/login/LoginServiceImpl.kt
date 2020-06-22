package com.mars.login

import android.util.Log
import androidx.annotation.Keep
import com.mars.loginapi.ILoginService


class LoginServiceImpl : ILoginService {
    override fun login() {
        Log.e("gy", "login模块---LoginServiceImpl---login")
    }

    override fun isLogin() {
        Log.e("gy", "login模块---LoginServiceImpl---isLogin")
    }

}