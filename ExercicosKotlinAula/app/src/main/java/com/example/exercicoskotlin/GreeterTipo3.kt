package com.example.exercicoskotlin

class GreeterTipo3(cumprimento: String) {
    val cumprimento = cumprimento

    fun greet(nome: String): String {
        val cumprimentoCompleto = "$cumprimento $nome"
        return cumprimentoCompleto
    }
}