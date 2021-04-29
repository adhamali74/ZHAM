package com.example.loginregistrationservice.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import androidx.core.content.ContextCompat
import com.example.loginregistrationservice.R
import com.google.android.material.snackbar.Snackbar

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    fun showErrorSnackBar(message: String, errorMessage: Boolean){
        val SnackBar =
            Snackbar.make(findViewById(android.R.id.content),message, Snackbar.LENGTH_LONG)
        val snackBarview = SnackBar.view

        if (errorMessage) {
            snackBarview.setBackgroundColor(
                ContextCompat.getColor(
                    this@BaseActivity,
                    R.color.colorSnackBarError
                )
            )
        }else {
            snackBarview.setBackgroundColor(
                ContextCompat.getColor(
                    this@BaseActivity,
                    R.color.colorSnackBarSuccess
                )
            )
        }
        SnackBar.show()
    }
}