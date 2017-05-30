package com.halphdem.kotlinsandbox.data

import com.halphdem.kotlinsandbox.repository.DataBase
import com.halphdem.kotlinsandbox.repository.Repository
import org.omg.CORBA.RepositoryIdHelper

/**
 * Created by swift on 23/05/17.
 */


class UserRepository: Repository<User, String> {

    val dataBase = DataBase()

    override fun findAll(): ArrayList<User> {
        return  dataBase.users;
    }

    override fun findById(id: String): User? {
        for (user in dataBase.users) {
            if (user.id == id) {
                return user
            }
        }
        return null
    }

    override fun add(user: User) {
        dataBase.users.add(user)
    }

    override fun remove(user: User) {
        dataBase.users.remove(user)
    }

    override fun update(user: User) {
        for (userBase in dataBase.users) {
            if (userBase.id == user.id) {
                remove(userBase);
                add(user)
            }
        }
    }
}
