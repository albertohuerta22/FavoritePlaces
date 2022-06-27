package com.example.happyplaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_happy_place.*

class AddHappyPlace : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_happy_place)

        //add back button
        setSupportActionBar(toolbar_add_place)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)  // <-- this line adds back button
        toolbar_add_place.setNavigationOnClickListener{
            onBackPressed()
        }
    }
}