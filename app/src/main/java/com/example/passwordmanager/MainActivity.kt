package com.example.passwordmanager

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
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

        val etTextToCopy:TextView=findViewById(R.id.textView_generatedPassword)

        binding.buttonGenerate.setOnClickListener {
            val generatedPassword = binding.textViewGeneratedPassword.setText(Services.generatePassword())
        }

        binding.buttonCopy.setOnClickListener {
            val textToCopy = etTextToCopy.text
            val clipboardManager=getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clipData= ClipData.newPlainText("text", textToCopy)
            clipboardManager.setPrimaryClip(clipData)

            Toast.makeText(this, "Copied", Toast.LENGTH_SHORT).show()
        }
    }
}