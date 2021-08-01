import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import java.lang.Exception

fun testaCriacaoDeContas() {
    var alex = Cliente(nome = "Alex", cpf = "111.111.111.11", senha = 1234)
    var contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)

    var fran = Cliente(nome = "Fran", cpf = "222.222.222.22", senha = 4321)
    var contaFran = ContaPoupanca(titular = fran, numero = 1001)
    contaFran.deposita(300.0)

    println("Titular: ${contaAlex.titular.nome}")
    println("Número: ${contaAlex.numero}")
    println("Saldo: ${contaAlex.saldo}")
    println()
    println("Titular: ${contaFran.titular.nome}")
    println("Número: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")
    println()

    println("Depositando na conta do Alex")
    contaAlex.deposita(100.0)
    println("Saldo após o depósito: ${contaAlex.saldo}")
    println()

    println("Depositando na conta da Fran")
    contaFran.deposita(100.0)
    println("Saldo após o depósito: ${contaFran.saldo}")
    println()

    println("Sacando da conta da Alex")
    contaAlex.saca(100.0)
    println("Saldo após o saque: ${contaAlex.saldo}")
    println()

    println("Sacando da conta da Fran")
    contaFran.saca(100.0)
    println("Saldo após o saque: ${contaFran.saldo}")
    println()

    println("Transferindo da conta da Fran para a conta do Alex")
    try {
        contaFran.transfere(100.0, contaAlex, senha = 4321)
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException){
        println("Falha na transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferência")
        println("Falha na autenticação")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println("Saldos após a tranferência:")
    println("Fran: ${contaFran.saldo} | Alex: ${contaAlex.saldo}")
    println()
}
