package ibdb.service.interfaces;

import ibdb.model.dao.MarkDao;
import ibdb.model.dao.UserDao;

import java.util.List;

public interface UserService {

    UserDao getUserById(long id);

    List<UserDao> getAllUsers();

    List<MarkDao> getAllMarks(long user);

    UserDao save(UserDao userDao);
}
