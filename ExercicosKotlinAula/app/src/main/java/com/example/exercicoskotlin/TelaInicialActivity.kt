package com.example.exercicoskotlin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.exercicoskotlin.databinding.ActivityTelaInicialBinding
import com.example.exercicoskotlin.greeter.Greeter1Activity
import com.example.exercicoskotlin.layouts.LayoutsActivity
import com.example.exercicoskotlin.layouts.OutrosComponentesActivity

class TelaInicialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTelaInicialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaInicialBinding.inflate(layoutInflater)

        binding.btAbrirExListas.setOnClickListener {
            val intent = Intent(this@TelaInicialActivity, ListasActivity::class.java)
            startActivity(intent)
        }

        binding.btAbrirExPessoas.setOnClickListener {
            val intent = Intent(this, PessoasActivity::class.java)
            startActivity(intent)
        }

        binding.btAbrirExercicoGreeter.setOnClickListener {
            val intent = Intent(this, Greeter1Activity::class.java)
            startActivity(intent)
        }

        binding.btCicloDeVida.setOnClickListener {
            val intent = Intent(this, CicloDeVidaActivity::class.java)
            startActivity(intent)
        }

        binding.inicialBtLayouts.setOnClickListener {
            val intent = Intent(this, LayoutsActivity::class.java)
            startActivity(intent)
        }

        binding.inicialBtOutrosComponentes.setOnClickListener {
            val intent = Intent(this, OutrosComponentesActivity::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
}