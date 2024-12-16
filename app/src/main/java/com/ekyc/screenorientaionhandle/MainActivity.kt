package com.ekyc.screenorientaionhandle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ekyc.screenorientaionhandle.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        mainBinding.btnLogin.setOnClickListener {
            val otp = Random.nextInt(1000000)
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("OTP", otp)
            Log.d("OTP", "onCreate: " + otp)
            startActivity(intent)
        }
    }
}