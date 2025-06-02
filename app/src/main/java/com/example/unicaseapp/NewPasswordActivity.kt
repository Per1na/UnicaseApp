package com.example.unicaseapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NewPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_password)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "New Password"

        val buttonCreateNewPassword: Button = findViewById(R.id.buttonCreateNewPassword)
        // val editTextNewPassword: EditText = findViewById(R.id.editTextNewPassword)
        // val editTextConfirmNewPassword: EditText = findViewById(R.id.editTextConfirmNewPassword)

        buttonCreateNewPassword.setOnClickListener {
            // Logika validasi dan simpan password baru
            Toast.makeText(this, "Password Changed Successfully (Placeholder)", Toast.LENGTH_SHORT).show()
            // Arahkan ke halaman konfirmasi
            startActivity(Intent(this, PasswordResetSuccessActivity::class.java))
            finishAffinity() // Tutup semua activity terkait password reset
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}