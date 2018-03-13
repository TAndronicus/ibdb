package ibdb.service.interfaces;

import ibdb.model.dao.UserDao;

import java.util.List;

public interface UserService {

    UserDao getUserById(long id);

    List<UserDao> getAllUsers();

    <T extends UserDao> T save(T userDao);
}
