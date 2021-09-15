package com.example.exercicoskotlin.greeter

// declaro o atributo enquanto crio construtor nos parênteses
class GreeterTipo1(val cumprimento: String) {

    // método greet que estará presente em todos os greeters
    // lembre do carro: o acelerador é igual para todos os carros, mas o motor e todo o resto não
    //
    // o conteúdo de "cumprimento" varia entre os diferentes greeters, mas a lógica de juntar
    // cumprimento + nome não
    fun greet(nome: String): String {
        val cumprimentoCompleto = "${cumprimento} $nome"
        return cumprimentoCompleto
    }
}