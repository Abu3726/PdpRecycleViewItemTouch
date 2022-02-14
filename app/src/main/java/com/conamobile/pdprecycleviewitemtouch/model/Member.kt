package com.conamobile.pdprecycleviewitemtouch.model

import android.widget.LinearLayout

class Member(var profile:Int, var fullname:String, var linear_member: Int) {

    override fun toString(): String {
        return "$profile : $fullname"
    }
}