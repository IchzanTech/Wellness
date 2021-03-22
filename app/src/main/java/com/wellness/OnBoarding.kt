package com.wellness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.viewpager.widget.ViewPager

class OnBoarding : AppCompatActivity() {

    private var mSlideViewPager: ViewPager? = null
    private var mDotLayout: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding);

        mSlideViewPager = findViewById<View>(R.id.slideViewPager) as ViewPager
        mDotLayout = findViewById<View>(R.id.dotsLayout) as LinearLayout
    }
}