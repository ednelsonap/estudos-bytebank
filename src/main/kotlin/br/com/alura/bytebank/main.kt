package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaExcecoes
import testaContasDiferentes
import testaCriacaoDeContas
import java.lang.IllegalStateException
import java.lang.NumberFormatException

fun main (){
    //testando referência nula
//    var enderecoNulo: Endereco? = null
//    val enderecoNaoNulo: Endereco = enderecoNulo!!
//    enderecoNaoNulo.logradouro
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro")
    println(enderecoNulo?.logradouro?.length) // chamada encadeada de safe call
    //OU para não colocar ponto de interrogação
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int = it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser nulo")
        println(tamanhoComplemento)
    }
    teste("")
    teste(1)
}
fun teste(valor: Any){
    val numero: Int? = valor as? Int
}
