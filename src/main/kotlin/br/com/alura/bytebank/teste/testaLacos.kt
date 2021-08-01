fun testaLacos() {
    //    var i = 0
//    while (i < 5){
//        println(i)
//        i++
//    }

    //for(i in 5 downTo 1) consegue fazer a contagem do i de maneira decrescente
    for (i in 1..5) {
        if (i == 4) {
            continue //pula a 4ª iteração e break para na 4ª iteração, criando somente 3 contas
        }
        val titular: String = "Ednelson $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Número da modelo.Conta: $numeroConta")
        println("Saldo da modelo.Conta: $saldo")
        testaCondicoes(saldo)
        println()
    }
}
