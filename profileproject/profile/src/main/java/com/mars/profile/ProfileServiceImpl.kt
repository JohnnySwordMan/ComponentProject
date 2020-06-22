package com.mars.profile

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.mars.profileapi.IProfileService


class ProfileServiceImpl : IProfileService {

    override fun gotoProfilePage(activity: Activity, bundle: Bundle?) {
        val intent = Intent(activity, ProfileActivity::class.java)
        intent.putExtra("key", bundle)
        activity.startActivity(intent)
    }

}