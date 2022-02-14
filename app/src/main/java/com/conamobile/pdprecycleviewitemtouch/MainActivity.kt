package com.conamobile.pdprecycleviewitemtouch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.conamobile.pdprecycleviewitemtouch.adapter.MemberAdapter
import com.conamobile.pdprecycleviewitemtouch.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recycleView)

        val members: ArrayList<Member> = ArrayList<Member>()
        for (i in 0..30){
            members.add(Member(R.drawable.image1, "Nurmuhammad", 1))
            members.add(Member(R.drawable.image2, "Muhammadziyo", 2))
            members.add(Member(R.drawable.image3, "Abdulbori", 3))
            members.add(Member(R.drawable.image4, "Qudratillo", 4))
            members.add(Member(R.drawable.image5, "Oyatillo", 5))
        }
        refreshAdapter(members)
    }

    private fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = MemberAdapter(this, members)
        recyclerView!!.adapter = adapter
    }

    fun openItemDetails(member: Member){
        val intent = Intent(this, ProfileActivity::class.java)
        intent.putExtra("image", member.profile)
        intent.putExtra("text", "${member.fullname}")
        startActivity(intent)
        Log.d("000","000"+ member.fullname)
    }
}