package com.example.a6_recyclerviewinsidenestedscrollviewkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a6_recyclerviewinsidenestedscrollviewkotlin.R
import com.example.a6_recyclerviewinsidenestedscrollviewkotlin.model.Member

class CustomAdapter(val members: List<Member>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_view, parent, false)
        return CustomViewHolder(view)
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name:TextView

        init {
            name = view.findViewById(R.id.tv_name)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members.get(position)

        if (holder is CustomViewHolder){
            holder.name.setText(member.name)
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

}
