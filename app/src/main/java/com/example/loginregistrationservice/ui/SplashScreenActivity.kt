package com.example.loginregistrationservice.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.example.loginregistrationservice.R

class SplashScreenActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        actionBar?.hide()
        Handler().postDelayed({
            Intent(this, AppIntroActivity::class.java).apply {
                startActivity(this)
            }

        }, 1000)
    }
}