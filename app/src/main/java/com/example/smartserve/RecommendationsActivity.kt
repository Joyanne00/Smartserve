package com.example.smartserve

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class RecommendationsActivity : AppCompatActivity() {

    private lateinit var recommendationsListView: ListView
    private lateinit var recommendationsList: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommendations)

        recommendationsListView = findViewById(R.id.recommendationsListView)
        recommendationsList = ArrayList()

        // Sample recommendations
        recommendationsList.add("Increase irrigation in Zone A")
        recommendationsList.add("Apply fertilizer in Zone B")
        recommendationsList.add("Inspect for pests in Zone C")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, recommendationsList)
        recommendationsListView.adapter = adapter
    }
}