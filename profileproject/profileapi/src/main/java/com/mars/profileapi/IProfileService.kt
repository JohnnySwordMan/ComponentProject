package com.mars.profileapi

import android.app.Activity
import android.os.Bundle


interface IProfileService {

    fun gotoProfilePage(activity: Activity, bundle: Bundle?)
}