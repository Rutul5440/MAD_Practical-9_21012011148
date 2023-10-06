package com.example.mad_practical_9_21012011148

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {

    lateinit var imageAnimation : AnimationDrawable
    lateinit var logoImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val imageUvpce = findViewById<ImageView>(R.id.imageuvpce)
        imageUvpce.setBackgroundResource(R.drawable.logo_animation_list)
        imageAnimation = imageUvpce.background as AnimationDrawable



    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if(hasFocus){
            imageAnimation.start()
            logoImage.startAnimation(logoAnimation)
        }
        else{
            imageAnimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }
}