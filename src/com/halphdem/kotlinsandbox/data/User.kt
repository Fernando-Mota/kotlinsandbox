package com.halphdem.kotlinsandbox.data

/**
 * Created by swift on 23/05/17.
 */


data class User (val id: String, val login: String, val senha: String, var permissoes: ArrayList<Permissao> = ArrayList<Permissao>())

fun User.print() {

    println("********* Usuário: ${this.id} *********")
    println("Login: ${this.login}")
    println("Senha: ${this.senha}")
    println("********* Permissões *********")
    for (permissao in this.permissoes) {
        permissao.print()
    }
    println("**************************************")
}