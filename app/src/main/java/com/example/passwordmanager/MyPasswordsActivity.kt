package com.example.passwordmanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.passwordmanager.databinding.ActivityMyPasswordsBinding

class MyPasswordsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMyPasswordsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyPasswordsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBack.setOnClickListener {
            finish()
        }
    }
}