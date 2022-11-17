package com.example.csi_dmce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private  lateinit var newRecyclerView: RecyclerView
private  lateinit var newArrayList: ArrayList<ProfileEvents>
lateinit var title_Heading : ArrayList<String>
lateinit var Description : ArrayList<String>

class Profile: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        title_Heading = arrayListOf(







        )

        Description = arrayListOf(








        )

        newRecyclerView = findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<ProfileEvents>()

        getUserdata()

    }
    private fun getUserdata(){

        for (i in title_Heading.indices){

            val Profile_Events = ProfileEvents(title_Heading[i], Description[i])
            newArrayList.add(Profile_Events)


        }
        newRecyclerView.adapter = ProfileEventsAdapter(newArrayList)

    }
}