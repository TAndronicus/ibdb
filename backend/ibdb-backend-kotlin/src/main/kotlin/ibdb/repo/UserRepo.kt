package ibdb.repo

import ibdb.model.dao.UserDao
import org.springframework.data.repository.Repository

interface UserRepo: Repository<UserDao, Long> {

    fun findAll(): List<UserDao>

}