package ibdb.service.interfaces;

import ibdb.model.dao.MarkDao;
import ibdb.model.dao.UserDao;

import java.util.List;

public interface UserService extends RatedEntity{

    UserDao getUserById(long id);

    List<UserDao> getAllUsers();

    UserDao save(UserDao userDao);
}
