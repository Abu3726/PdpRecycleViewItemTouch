package com.conamobile.pdprecycleviewitemtouch.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.conamobile.pdprecycleviewitemtouch.MainActivity
import com.conamobile.pdprecycleviewitemtouch.R
import com.conamobile.pdprecycleviewitemtouch.model.Member
import java.util.ArrayList

class MemberAdapter(val activity: MainActivity, var members: ArrayList<Member>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_member_list, parent, false)
        return EssentialViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var item = members[position]

        if (holder is EssentialViewHolder){
            var tv_title = holder.tv_title
            var iv_image = holder.iv_image
            var linear_member = holder.linear_member

            iv_image.setImageResource(item.profile)
            tv_title.text = item.fullname

            holder.linear_member.setOnClickListener {
                activity.openItemDetails(item)
            }
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }


}

class EssentialViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var iv_image: ImageView
    var tv_title: TextView
    var linear_member: LinearLayout

    init {
        iv_image = view.findViewById(R.id.iv_profile)
        tv_title = view.findViewById(R.id.tv_fullname)
        linear_member = view.findViewById(R.id.linear_member)
    }
}