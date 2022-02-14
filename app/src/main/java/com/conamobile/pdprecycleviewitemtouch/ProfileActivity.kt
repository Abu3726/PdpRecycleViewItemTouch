package com.conamobile.pdprecycleviewitemtouch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ProfileActivity : AppCompatActivity() {

    var getImage: ImageView? = null
    var getText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_profile)
        getImage = findViewById(R.id.get_image)
        getText = findViewById(R.id.get_text)

        val image: Int? = intent.getIntExtra("image",1)
        val age2: String? = intent.getStringExtra("text")

        getImage!!.setImageResource(image!!.toInt())
        getText!!.text =age2.toString()

    }
}