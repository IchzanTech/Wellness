package com.wellness.wellfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.wellness.R
import com.wellness.databinding.ActivityPlaceDetailBinding
import com.wellness.databinding.ActivityPlaceListBinding

class PlaceDetail : AppCompatActivity() {

    private lateinit var binding: ActivityPlaceDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlaceDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_place_detail)
    }
}