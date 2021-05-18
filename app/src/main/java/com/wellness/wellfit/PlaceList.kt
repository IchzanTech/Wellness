package com.wellness.wellfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.wellness.R
import com.wellness.databinding.ActivityPlaceListBinding
import com.wellness.databinding.ActivityWellfitBinding

class PlaceList : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityPlaceListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlaceListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.silverGym.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v == binding.silverGym) {
            val mIntent = Intent(this@PlaceList, PlaceDetail::class.java)
            startActivity(mIntent)
        }
    }
}