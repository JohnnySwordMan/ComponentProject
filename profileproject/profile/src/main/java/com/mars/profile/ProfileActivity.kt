package com.mars.profile

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.mars.loginapi.ILoginService
import java.util.*


class ProfileActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Log.e("gy", "profile模块---ProfileActivity---onCreate")
        val btnLogin = findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener {
            login()
        }
    }

    /**
     * 每次拿到的对象都不同
     */
    private fun login() {
        val loader = ServiceLoader.load(ILoginService::class.java)
        val iterator = loader.iterator() as Iterator<ILoginService>
        var service: ILoginService? = null
        if (iterator.hasNext()) {
            service = iterator.next()
            Log.e("gy", "profile模块---ProfileActivity---login---service = $service")
            service.login()
        }
    }
}