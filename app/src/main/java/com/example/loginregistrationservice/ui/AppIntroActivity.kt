package com.example.loginregistrationservice.ui

import android.Manifest
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.example.loginregistrationservice.R
import com.example.loginregistrationservice.setFirstOpen
import com.github.appintro.AppIntro2
import com.github.appintro.AppIntroFragment
import com.github.appintro.AppIntroPageTransformerType
import com.github.appintro.model.SliderPage

class AppIntroActivity : AppIntro2() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            window!!.navigationBarColor = Color.TRANSPARENT
        }
        addSlide(
            AppIntroFragment.newInstance(
                    "Move With Safety",
                "Get Started",
                    titleColor=Color.WHITE,
                    descriptionColor = Color.WHITE,
                    imageDrawable = R.drawable.zham_logo,
                    backgroundColor = resources.getColor(R.color.background)
                )
            )

        addSlide(
            AppIntroFragment.newInstance(
                "BOOK",
                "Locate A car around the city.see car availability on the map and book it through the app",
                imageDrawable = R.drawable.book,
                titleColor=Color.WHITE,
                descriptionColor = Color.WHITE,
                backgroundColor = resources.getColor(R.color.background)
            )
        )

        addSlide(
            AppIntroFragment.newInstance(
                SliderPage(
                    "UNLOCK",
                    "Use QR Code that Sent to your Mobile Via the App,unlock the Car,Billing start when the car is unlocked ",
                    imageDrawable = R.drawable.unlock,
                    titleColor=Color.WHITE,
                    descriptionColor = Color.WHITE,
                    backgroundColor = resources.getColor(R.color.purple_700)
                )
            )
        )

        addSlide(
            AppIntroFragment.newInstance(
                "RIDE",
                "Enjoy your Ride,When you finished your ride just park the car in any nearby garage and lock the car to stop the billing from App ",
                imageDrawable = R.drawable.ride,
                titleColor=Color.WHITE,
                descriptionColor = Color.WHITE,
                backgroundColor = resources.getColor(R.color.teal_200)
            )
        )

        isColorTransitionsEnabled = true
        setProgressIndicator()
        setIndicatorColor(
            selectedIndicatorColor = resources.getColor(R.color.white),
            unselectedIndicatorColor = resources.getColor(R.color.purple_700)
        )
        setImmersiveMode()
        setTransformer(AppIntroPageTransformerType.Parallax())

     /*   askForPermissions(
            permissions = arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_MEDIA_LOCATION,
                Manifest.permission.CAMERA
            ),
            slideNumber = 4,
            required = false
        )

      */
    }

    public override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
    }

    public override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        setFirstOpen()
        Intent(this, MainActivity::class.java).apply {
            startActivity(this)
        }
    }

    override fun onUserDeniedPermission(permissionName: String) {}

    override fun onUserDisabledPermission(permissionName: String) {}
}