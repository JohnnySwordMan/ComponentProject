package com.mars.main

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.mars.profileapi.IProfileService
import java.util.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("gy", "main模块-MainActivity---onCreate")
        findViewById<Button>(R.id.btn_go_profile).setOnClickListener {
//            startActivity(Intent(this, ProfileActivity::class.java))
            gotoProfile()
        }
    }

    private fun gotoProfile() {
        val loader = ServiceLoader.load(IProfileService::class.java)
        val iterator = loader.iterator() as Iterator<IProfileService>
        if (iterator.hasNext()) {
            val service = iterator.next()
            Log.e("gy", "main模块-MainActivity---gotoProfile---service = $service")
            service.gotoProfilePage(this, null)
        }
    }
}