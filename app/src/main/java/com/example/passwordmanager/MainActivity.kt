package com.example.passwordmanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.passwordmanager.databinding.ActivityMainBinding
import com.example.passwordmanager.services.Services

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val Services = Services()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGenerate.setOnClickListener {
            binding.textViewGeneratedPassword.setText(Services.generatePassoword())
        }
    }
}