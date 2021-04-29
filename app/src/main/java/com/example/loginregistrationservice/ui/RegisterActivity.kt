package com.example.loginregistrationservice.ui

import android.app.Activity
import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.example.loginregistrationservice.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        Save_on_registration.setOnClickListener {
            validateRegistrationDetails()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    private fun validateRegistrationDetails():Boolean {
        return when {
            TextUtils.isEmpty(Fullname.text.toString().trim { it<= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_first_name),true)
                false
            }
                TextUtils.isEmpty(Username.text.toString().trim { it<= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_user_name),true)
                false
        }
            TextUtils.isEmpty(Emailaddress.text.toString().trim { it<= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_EmailID),true)
                false
            }
            TextUtils.isEmpty(password.text.toString().trim { it<= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_Password),true)
                false
            }
            TextUtils.isEmpty(Confirmpassword.text.toString().trim { it<= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_confirm_Password),true)
                false
            }
            password.text.toString().trim { it<=' ' } != Confirmpassword.text.toString()
                .trim { it<= ' ' } -> {showErrorSnackBar(resources.getString(R.string.err_msg_enter_confirm_Password),true)
                false
                }
            TextUtils.isEmpty(Mobilenumber.text.toString().trim { it<= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_Mobile_no),true)
                false
            }
            TextUtils.isEmpty(Cardnumber.text.toString().trim { it<= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_card_no),true)
                false
            }
            TextUtils.isEmpty(Cvv.text.toString().trim { it<= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_cvv_no),true)
                false
            }
            TextUtils.isEmpty(Expirationdate.text.toString().trim { it<= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_expiration_date),true)
                false
            }
            !checkbox1.isChecked -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_checkbox),true)
                false
            }

                else -> { showErrorSnackBar(resources.getString(R.string.suucessful_registration),false)
                    true
                }
            }
        }
    }
