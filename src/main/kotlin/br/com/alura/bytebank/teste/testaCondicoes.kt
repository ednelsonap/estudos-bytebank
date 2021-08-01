fun testaCondicoes(saldo: Double) {

    //estrutura equivalente ao if, else if, else do Java
    when {
        saldo > 0 -> println("modelo.Conta é positiva")
        saldo == 0.0 -> println("modelo.Conta é neutra")
        else -> println("modelo.Conta é negativa")
    }

}
