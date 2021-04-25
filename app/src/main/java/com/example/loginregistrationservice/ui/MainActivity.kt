package com.example.loginregistrationservice.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.loginregistrationservice.R
import com.example.loginregistrationservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
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