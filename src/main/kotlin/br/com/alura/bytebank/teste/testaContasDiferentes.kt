import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {

    var alex = Cliente(nome = "Alex", cpf = "111.111.111.11", senha = 1234)
    var fran = Cliente(nome = "Fran", cpf = "222.222.222.22", senha = 4321)

    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(valor = 100.0, contaPoupanca, senha = 1234)

    println("saldo corrente após transferir para a poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber da transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(valor = 100.0, contaCorrente, senha = 4321)

    println("saldo poupança após transferir para a corrente: ${contaCorrente.saldo}")
    println("saldo corrente após receber da transferência: ${contaPoupanca.saldo}")
}