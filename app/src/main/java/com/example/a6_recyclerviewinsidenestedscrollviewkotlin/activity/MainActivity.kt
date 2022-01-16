package com.example.a6_recyclerviewinsidenestedscrollviewkotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.a6_recyclerviewinsidenestedscrollviewkotlin.R
import com.example.a6_recyclerviewinsidenestedscrollviewkotlin.adapter.CustomAdapter
import com.example.a6_recyclerviewinsidenestedscrollviewkotlin.model.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        val members = prepareMemberList()
        refreshAdapter(members)
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomAdapter(members)
        recylerView.adapter = adapter
    }

    private fun prepareMemberList(): List<Member> {
        val members = ArrayList<Member>()
        for (i in 0..30 step 1){
            members.add(Member("Odilbek"))
        }
        return members
    }

    fun initViews(){
        recylerView.layoutManager = GridLayoutManager(this, 1)
        recylerView.isNestedScrollingEnabled = false
    }
}