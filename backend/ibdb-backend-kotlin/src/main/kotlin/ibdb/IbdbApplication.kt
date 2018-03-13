package ibdb

import ibdb.model.dao.UserDao
import ibdb.repo.UserRepo
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import java.time.LocalDateTime

@EnableJpaRepositories
class IbdbApplication

lateinit var userRepo: UserRepo

fun main(args : Array<String>) {
    println("Hello world!")
    println(LocalDateTime.now())
    var list: List<UserDao> = userRepo.findAll()
}


