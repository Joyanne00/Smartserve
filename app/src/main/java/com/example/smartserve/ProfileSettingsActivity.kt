package com.example.smartserve

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileSettingsActivity : AppCompatActivity() {

    private lateinit var changePasswordButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_settings)

        changePasswordButton = findViewById(R.id.changePasswordButton)
        changePasswordButton.setOnClickListener {
            // Handle password change logic
        }
    }
}
}