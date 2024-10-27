package com.example.smartserve

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class SensorManagementActivity : AppCompatActivity() {

    private lateinit var sensorListView: ListView
    private lateinit var sensorList: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensor_management)

        sensorListView = findViewById(R.id.sensorListView)
        sensorList = ArrayList()

        // Sample data
        sensorList.add("Soil Moisture Sensor - Zone A")
        sensorList.add("Temperature Sensor - Zone B")
        sensorList.add("Humidity Sensor - Zone C")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, sensorList)
        sensorListView.adapter = adapter
    }
}