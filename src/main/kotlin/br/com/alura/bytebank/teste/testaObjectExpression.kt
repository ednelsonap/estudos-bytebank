package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticaval
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaObjectExpression() {
    val fran = object : Autenticaval {
        val nome: String = "Fran"
        val cpf: String = "111.111.111.11"
        val senha: Int = 1234

        override fun autentica(senha: Int) = this.senha == senha

    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1234)
    println("nome do cliente ${fran.nome}")
}