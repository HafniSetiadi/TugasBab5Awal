package com.setiadi.myapplicationbab5

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.setiadi.myapplicationbab5.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {
    private var layout: ActivitySplashScreenBinding? = null
    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val layout = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(layout.root)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 4000)
    }
}