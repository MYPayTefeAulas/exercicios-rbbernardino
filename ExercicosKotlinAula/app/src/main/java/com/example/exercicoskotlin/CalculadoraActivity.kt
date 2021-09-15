package com.example.exercicoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicoskotlin.databinding.ActivityCalculadoraBinding

class CalculadoraActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculadoraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCalculadoraBinding.inflate(layoutInflater)

        binding.btTrocar.setOnClickListener {
//            binding.txtHello.text = novoTexto()
//            binding.txtHello.text = textoDaEntrada()
//            binding.txtHello.text = calcularDobro()
//            binding.txtHello.text = multiplicar()
//            binding.txtHello.text = calcular()
            binding.txtHello.text = calcularComWhen()
        }

        setContentView(binding.root)
        val l = listOf(1, 2, 3)
    }

    fun novoTexto(): String {
        return "Novo texto de função"
    }

    fun textoDaEntrada(): String {
        return binding.txtNumero2.text.toString()
    }

    fun calcularDobro(): String {
        val numeroStr = binding.txtNumero2.text.toString()
        val numero = numeroStr.toInt()
        val numeroDobro = numero * 2
        return  numeroDobro.toString()
    }

    fun multiplicar(): String {
        val numero1 = binding.txtNumero1.text.toString().toInt()
        val numero2 = binding.txtNumero2.text.toString().toInt()
        val resultado = numero1 * numero2
        return resultado.toString()
    }

    fun calcular(): String {
        val operacao = binding.txtOperacao.text.toString()
        val numero1 = binding.txtNumero1.text.toString().toInt()
        val numero2 = binding.txtNumero2.text.toString().toInt()
        var resultadoStr = ""
        if(operacao == "+") {
            resultadoStr = (numero1 + numero2).toString()
        } else if(operacao == "-") {
            resultadoStr = (numero1 - numero2).toString()
        } else {
            resultadoStr = "Operação não suportada!"
        }
        return resultadoStr.toString()
    }

    fun calcularComWhen(): String {
        val operacao = binding.txtOperacao.text.toString()
        val numero1 = binding.txtNumero1.text.toString().toInt()
        val numero2 = binding.txtNumero2.text.toString().toInt()
        var resultadoStr = ""
        when(operacao) {
            "+" -> resultadoStr = (numero1 + numero2).toString()
            "-" -> resultadoStr = (numero1 - numero2).toString()
            "/" -> resultadoStr = (numero1 / numero2).toString()
            "*" -> resultadoStr = (numero1 * numero2).toString()
            else -> resultadoStr = "Operação não suportada!"
        }
        binding.txtNumero1.text.clear()
        binding.txtOperacao.text.clear()
        binding.txtNumero2.text.clear()
        return resultadoStr.toString()
    }
}