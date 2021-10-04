package com.example.exercicoskotlin.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicoskotlin.databinding.ActivityLayoutsBinding

class LayoutsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLayoutsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLayoutsBinding.inflate(layoutInflater)

        binding.layoutsBtLinearLayout.setOnClickListener {
            val intent = Intent(this, LinearLayoutActivity::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
}