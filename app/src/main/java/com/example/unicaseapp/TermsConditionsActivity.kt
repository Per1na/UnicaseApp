package com.example.unicaseapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
// import android.widget.TextView // Jika perlu mengambil textview secara spesifik

class TermsConditionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_conditions)

        // Jika ingin menambahkan tombol back di ActionBar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Terms & Conditions"
    }

    // Untuk handle tombol back di ActionBar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}