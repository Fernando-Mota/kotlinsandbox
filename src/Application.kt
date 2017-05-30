import com.halphdem.kotlinsandbox.data.*

/**
 * Created by swift on 23/05/17.
 */


fun main(args: Array<String>) {
    val repository = UserRepository()
    val user = repository.findById(id = "1")
    val user2 = repository.findById("1")

    if (user == user2) {
        println("São Iguais")
    } else {
        println("São Diferentes")
    }

    val permissao1 = Permissao(LogicType.USUARIO, "Permissão de inclusão de usuários", AccessType.ADD)
    val permissao2 = Permissao(LogicType.USUARIO, "Permissão de leitura de usuários", AccessType.READ)
    val permissao3 = Permissao(LogicType.USUARIO, "Permissão de atualização de usuários", AccessType.UPDATE)
    val permissao4 = Permissao(LogicType.USUARIO, "Permissão de exclusão de usuários", AccessType.DELETE)

    if (user != null) {
        user.permissoes.addAll(arrayListOf(permissao1, permissao2, permissao3, permissao4))
        user.print()
    }


}
