package com.example.passwordmanager.loginServices

class LoginServices {
    fun login(username: String, password: String): Boolean {
        return username.equals("user") && password.equals("pass")
    }
}