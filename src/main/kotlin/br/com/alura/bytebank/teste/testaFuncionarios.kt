import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraDeBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111.11",
        salario = 2000.0
    )

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222.22",
        salario = 5000.0,
        senha = 1234
    )

    val ed = Diretor(
        nome = "Ed",
        cpf = "333.333.333.33",
        salario = 30000.0,
        senha = 1234,
        plr = 5000.0
    )

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao}")

    println()

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao}")

    if (fran.autentica(senha = 1234)) {
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autenticacao")
    }

    println()

    println("Nome: ${ed.nome}")
    println("CPF: ${ed.cpf}")
    println("Salário: ${ed.salario}")
    println("Bonificação: ${ed.bonificacao}")
    println("PLR: ${ed.plr}")

    var calculadora = CalculadoraDeBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(ed)
    println("TOTAL DE BONIFICAÇÕES DOS FUNCIONÁRIOS: ${calculadora.total}")
}