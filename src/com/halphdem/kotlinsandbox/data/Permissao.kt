package com.halphdem.kotlinsandbox.data

/**
 * Created by swift on 24/05/17.
 */


data class Permissao(val logic: LogicType, val description: String, val access: AccessType)

fun Permissao.print() {
    println("Descrição: ${this.description}")
    println("Logic: ${this.logic.text}" )
    println("Ação: ${this.access.text}")
    println("")
}
