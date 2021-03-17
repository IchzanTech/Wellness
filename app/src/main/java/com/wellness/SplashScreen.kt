package com.wellness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils.*
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {
    private lateinit var logoAnim : Animation
    private val splashDuration:Long = 3_000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(mainLooper).postDelayed({
            val home = Intent(this@SplashScreen, Home::class.java)
            startActivity(home)
            finish()
        }, splashDuration)

        logoAnim = loadAnimation(this, R.anim.logo_animation)

        val image: ImageView = findViewById(R.id.logo)

        image.animation = logoAnim
    }
}