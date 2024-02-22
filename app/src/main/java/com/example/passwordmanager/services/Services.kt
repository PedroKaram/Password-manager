package com.example.passwordmanager.services

class Services {
    fun generatePassword(): String {
        val maxChars = 12
        val chars = arrayOf(
            "0", "1", "b", "2", "4", "5", "6", "7", "8",
            "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
            "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
            "x", "y", "z", "+", "-", "/", "*", "_", "!", "@", "$", "%", "&"
        )
        val password = StringBuilder()
        for (i in 0 until maxChars) {
            val position = (Math.random() * chars.size).toInt()
            password.append(chars[position])
        }
        return password.toString()
    }
}