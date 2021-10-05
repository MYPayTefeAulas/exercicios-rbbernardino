package com.example.exercicoskotlin.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicoskotlin.R
import com.example.exercicoskotlin.databinding.ActivityLinearAulaBinding

class LinearAulaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLinearAulaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_aula)
    }
}