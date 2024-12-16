package com.ekyc.screenorientaionhandle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.ekyc.screenorientaionhandle.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var main2Binding: ActivityMain2Binding
    private var otp: Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main2Binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(main2Binding.root)
        otp = intent.getIntExtra("OTP", 0)

        main2Binding.btnShowOtp.setOnClickListener {
            main2Binding.txtOtp.text = otp.toString()
        }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("OTP", otp)

    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        main2Binding.txtOtp.text = otp.toString()

    }
}