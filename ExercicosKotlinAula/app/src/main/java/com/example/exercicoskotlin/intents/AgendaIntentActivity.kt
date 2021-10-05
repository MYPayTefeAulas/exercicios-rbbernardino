package com.example.exercicoskotlin.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicoskotlin.databinding.ActivityAgendaIntentBinding

class AgendaIntentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda_intent)
    }
}