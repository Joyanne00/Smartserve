package com.example.smartserve

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HelpSupportActivity : AppCompatActivity() {

    private lateinit var faqLink: TextView
    private lateinit var contactSupportLink: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help_support)

        faqLink = findViewById(R.id.faqLink)
        contactSupportLink = findViewById(R.id.contactSupportLink)

        faqLink.setOnClickListener {
            // Open FAQ section
        }

        contactSupportLink.setOnClickListener {
            // Open contact support functionality
        }
    }
}