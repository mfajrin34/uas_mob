// src/main/java/com.example.yourpackage/SplashActivity.kt
package com.example.uasdiky

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    // Waktu tunda splash screen dalam milidetik
    private val splashTimeOut: Long = 300

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Pengaturan tunda untuk splash screen
        Handler().postDelayed({
            // Navigasi ke activity berikutnya setelah splash screen
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            // Tutup activity splash agar tidak dapat kembali
            finish()
        }, splashTimeOut)
    }
}
