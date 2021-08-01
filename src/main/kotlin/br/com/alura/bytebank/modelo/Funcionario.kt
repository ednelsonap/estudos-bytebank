package br.com.alura.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
    //maneira comun de fazer a mesma coisa que o código abaixo deste
    abstract val bonificacao: Double

//    open val bonificacao: Double
//        get() {
//            return salario * 0.1
//        }

}