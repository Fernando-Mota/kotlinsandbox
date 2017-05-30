package com.halphdem.kotlinsandbox.repository

/**
 * Created by swift on 23/05/17.
 */

interface Repository<T, ID> {

    fun findAll(): List<T>

    fun findById(id: ID): T?

    fun add(t: T)

    fun remove(t: T)

    fun update(t: T)
}
