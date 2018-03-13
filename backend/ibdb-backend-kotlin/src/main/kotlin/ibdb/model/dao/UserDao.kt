package ibdb.model.dao

import java.util.Date

@Entity
data class UserDao(val id: Long, val surname: String, val name: String, val dateOfBirth: Date, val placeOfBirth: String)