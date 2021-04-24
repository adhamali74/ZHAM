package com.example.loginregistrationservice

import android.content.Context
import android.graphics.Color
import android.preference.PreferenceManager.getDefaultSharedPreferences
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

fun Context.setFirstOpen() {
    val prefs = getDefaultSharedPreferences(this)
    prefs.edit().apply {
        putBoolean("FIRST_OPEN", false)
        apply()
    }
}

fun Context.getFirstOpen(): Boolean {
    val prefs = getDefaultSharedPreferences(this)
    return prefs.getBoolean("FIRST_OPEN", true)
}

fun Context.showToast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun View.snackBar(msg: String) {
    Snackbar.make(this, msg, Snackbar.LENGTH_LONG).apply {
        setTextColor(Color.WHITE)
    }
}