package com.example.smartserve

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    private lateinit var soilHealthCard: TextView
    private lateinit var weatherCard: TextView
    private lateinit var goToSensorsButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        soilHealthCard = findViewById(R.id.soilHealthCard)
        weatherCard = findViewById(R.id.weatherCard)
        goToSensorsButton = findViewById(R.id.goToSensorsButton)

        goToSensorsButton.setOnClickListener {
            val intent = Intent(this, SensorManagementActivity::class.java)
            startActivity(intent)
        }
    }
}