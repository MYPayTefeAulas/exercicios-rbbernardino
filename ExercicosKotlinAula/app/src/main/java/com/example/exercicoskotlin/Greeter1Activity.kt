package com.example.exercicoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercicoskotlin.databinding.ActivityGreeter1Binding

class Greeter1Activity : AppCompatActivity() {
    // binding que permite manipular elementos da tela
    private lateinit var binding: ActivityGreeter1Binding

    // lista de String "mutável", inicializada vazia
    private val listaNomes = mutableListOf<String>()

    // índice inicia em zero, a cada impressão aumenta
    // chegou no tamanho da lista reinicia
    private var indiceAtual: Int = 0

    // mantém objeto GreeterTipo1
    // botão "trocar" alterna entre as várias possibilidades
    // lateinit permite que eu inicialize o objeto depois, observe que "indiceAtual", acima, já
    // recebe um valor inicial (zero), veja o igual (=), símbolo de atribuição
    private lateinit var greeterAtual: GreeterTipo1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGreeter1Binding.inflate(layoutInflater)

        // --------------------------------------------------
        // configuração de variáveis "globais" da tela
        val greeter1 = GreeterTipo1("Olá,")
        val greeter2 = GreeterTipo1("Bem Vindo,")

        // inicialização do greeterAtual
        // lateinit confia que farei isso antes de usar a primeira vez
        greeterAtual = greeter1

        // preenche lista com nomes de pessoas
        listaNomes.add("Rodrigo")
        listaNomes.add("Alex")
        listaNomes.add("Robert")

        // --------------------------------------------------
        // configuração dos botões

        // BOTÃO IMPRIMIR PRÓXIMO
        binding.btImprimir.setOnClickListener {
            // preenche TextView com a string na posição da lista "indiceAtual"
            val nomeAtual = listaNomes[indiceAtual]
            binding.txtSaida.text = greeterAtual.greet(nomeAtual)

            // lógica para fazer nomes circularem, reiniciando contador de "indiceAtual"
            if(indiceAtual == listaNomes.size - 1) {
                indiceAtual = 0
            } else {
                indiceAtual++
            }
        }

        // BOTÃO TROCAR GREETER
        binding.btTrocar.setOnClickListener {
            // usei apenas dois greeters, mas poderia usar vários, com uma lista, por exemplo
            if(greeterAtual == greeter1) {
                greeterAtual = greeter2
                binding.txtNumGreeter.text = "2"
            } else {
                greeterAtual = greeter1
                binding.txtNumGreeter.text = "1"
            }
        }
        setContentView(binding.root)
    }
}