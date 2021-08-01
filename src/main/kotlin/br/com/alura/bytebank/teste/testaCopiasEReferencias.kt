import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.Endereco

fun testaCopiasEReferencias() {
    //EXEMPLO DE CÓPIA
    var numeroX = 10
    var numeroY = numeroX
    numeroY++
    //o valor de numeroX foi copiado para a variavel numeroY... Então ao incrementar numeroY, nada é alterado na variável
    //numeroX
    println("numeroX: $numeroX")
    println("numeroY: $numeroY")
    println()

    //EXEMPLO DE REFERENCIA

    var contaJoao = ContaCorrente(titular = Cliente(
        nome = "João",
        cpf = "111.111.111.11",
        senha = 1234,
        endereco = Endereco(
            logradouro = "Rua Vergueiro",
            numero = 800,
            bairro = "Liberdade",
            cidade = "São Paulo",
            estado = "SP",
            cep = "01504-000",
            complemento = "apto 11"
        )
    ), numero = 100)

    var contaMaria = contaJoao

    println("titular da conta do joao: ${contaJoao.titular}")
    println("titular da conta da maria: ${contaMaria.titular}")

    //contaMaria é apenas uma referência para a contaJoao... ambas apontam para o mesmo objeto na memória
    println(contaJoao)
    println(contaMaria)

    println("Endereço do João:")
    println(contaJoao.titular.endereco.logradouro)
    println(contaJoao.titular.endereco.numero)
    println(contaJoao.titular.endereco.complemento)
    println(contaJoao.titular.endereco.bairro)
    println(contaJoao.titular.endereco.cidade)
    println(contaJoao.titular.endereco.estado)
    println(contaJoao.titular.endereco.cep)

}
