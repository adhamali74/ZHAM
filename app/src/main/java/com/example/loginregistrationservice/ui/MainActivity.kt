package com.example.loginregistrationservice.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregistrationservice.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)


    }

    fun login(view: View) {}
    fun register(view: View) {
        Intent(this, RegisterActivity::class.java).apply {
            startActivity(this)
        }
    }

    fun forgetPassword(view: View) {
        Intent(this, ForgetPasswordActivity::class.java).apply {
            startActivity(this)
        }
    }

}