package com.example.uasdiky

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.uasdiky.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            if (isValidLogin(username, password)) {
                showToast("Login successful")

                // Redirect ke MainActivity setelah login sukses
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Menutup activity login agar tidak bisa kembali ke halaman login
            } else {
                showToast("Invalid username or password")
            }
        }
    }

    private fun isValidLogin(username: String, password: String): Boolean {
        // Implementasikan logika validasi login sesuai kebutuhan Anda
        return username == "fajrin" && password == "fjisfajrin"
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
