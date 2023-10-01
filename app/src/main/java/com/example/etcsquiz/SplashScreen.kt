package com.example.etcsquiz

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.core.os.HandlerCompat
import com.example.etcsquiz.databinding.ActivityMainBinding
import com.example.etcsquiz.databinding.ActivitySplashScreenBinding
import kotlinx.coroutines.*
import kotlinx.coroutines.delay as delay1

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SplashScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        HandlerCompat.postDelayed(HandlerCompat.createAsync(mainLooper), {
            // Code that will run after a 2-second delay
            // Here you can perform any desired actions

            // For example, start a new activity after the delay
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },null,2000)
//        val intent = Intent(this,MainActivity::class.java)
//        startActivity(intent)

    }

}