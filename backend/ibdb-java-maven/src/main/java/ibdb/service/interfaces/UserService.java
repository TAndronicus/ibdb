package ibdb.service.interfaces;

import ibdb.model.dao.UserDao;

import java.util.List;

public interface UserService {

    UserDao getUserById(long id);

    List<UserDao> getAllUsers();

    UserDao save(UserDao userDao);
}
