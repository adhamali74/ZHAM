package com.example.loginregistrationservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.forget_password.*
import kotlinx.android.synthetic.main.user_registration.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showHome()
        registration.setOnClickListener(){
            showRegistration()
        }
        Backbtn.setOnClickListener(){
            backHome()
        }
        Forgotpasswordbtn.setOnClickListener(){
            backfromresetpassword()
        }
        Backtologin.setOnClickListener(){
            showHome()
        }

    }
    private fun  showRegistration(){
        Registrationlayout.visibility=View.VISIBLE
        Home.visibility=View.GONE
        Forgetpassword.visibility=View.GONE
    }
    private fun showHome(){
        Home.visibility=View.VISIBLE
        Registrationlayout.visibility=View.GONE
        Forgetpassword.visibility=View.GONE
    }
    private fun backHome (){
        Home.visibility=View.VISIBLE
        Registrationlayout.visibility=View.GONE
        Forgetpassword.visibility=View.GONE
    }
    private fun backfromresetpassword(){
        Home.visibility=View.GONE
        Registrationlayout.visibility=View.GONE
        Forgetpassword.visibility=View.VISIBLE
    }
}