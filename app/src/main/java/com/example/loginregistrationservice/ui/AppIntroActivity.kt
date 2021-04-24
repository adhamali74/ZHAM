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
                SliderPage(
                    "Locate A car around the city.see car availability on the map and book it through the app",
                    imageDrawable = R.drawable.zham_logo,
                    backgroundColor = resources.getColor(R.color.background)
                )
            )
        )
        addSlide(
            AppIntroFragment.newInstance(
                "Portable drawing board",
                "White and Black Boards",
                imageDrawable = R.drawable.zham_logo,
                backgroundColor = resources.getColor(R.color.background)
            )
        )

        addSlide(
            AppIntroFragment.newInstance(
                SliderPage(
                    "Record and Listen",
                    " ",
                    imageDrawable = R.drawable.zham_logo,
                    backgroundColor = resources.getColor(R.color.purple_700)
                )
            )
        )

        addSlide(
            AppIntroFragment.newInstance(
                "Day and Night Theme",
                " ",
                imageDrawable = R.drawable.zham_logo,
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

    override fun onUserDeniedPermission(permissionName: String) = Unit

    override fun onUserDisabledPermission(permissionName: String) = Unit
}