package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

//construtor primário (o mais comum para inicialização dos atributos)
abstract class Conta(
    val titular: Cliente,
    val numero: Int
) : Autenticaval {
    var saldo = 0.0
        protected set //somente pode ser alterado por modelo.Conta e filhos

//  Construtor secundário
//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }
    companion object{
        var total = 0
            private set
    }

    init {
        println("Criando uma conta...")
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    open fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun saca(valor: Double)

//    open fun saca(valor: Double) {
//        if (valor <= this.saldo) {
//            this.saldo -= valor
//        } else {
//            println("Saldo insuficiente")
//        }
//    }

    open fun transfere(valor: Double, contaDestino: Conta, senha: Int) {
        if (this.saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído: $valor"
            )
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
        this.saca(valor)
        contaDestino.deposita(valor)
    }
}