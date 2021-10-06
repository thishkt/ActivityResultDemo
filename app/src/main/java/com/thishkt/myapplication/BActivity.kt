package com.thishkt.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thishkt.myapplication.databinding.ActivityBactivityBinding
import com.thishkt.myapplication.databinding.ActivityMainBinding

class BActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            val intent = Intent()
            intent.putExtra(MY_DATA,"HKT線上教室")
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}