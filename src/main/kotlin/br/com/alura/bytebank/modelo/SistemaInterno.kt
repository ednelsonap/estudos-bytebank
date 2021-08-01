package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticaval

class SistemaInterno {
    fun entra(admin: Autenticaval, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao ByteBank")
            println()
        } else {
            println("Falha na autenticação")
        }
    }
}