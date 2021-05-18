package com.wellness.wellfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.wellness.R
import com.wellness.databinding.ActivityWellfitBinding

class WellfitActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityWellfitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWellfitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButton2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v == binding.imageButton2) {
            val mIntent = Intent(this@WellfitActivity, PlaceList::class.java)
            startActivity(mIntent)
        }
    }
}