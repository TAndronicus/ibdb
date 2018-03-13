package ibdb.service.implementations;

import ibdb.model.dao.UserDao;
import ibdb.model.repo.UserRepo;
import ibdb.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDao getUserById(long id) {
        return userRepo.findById(id);
    }

    @Override
    public List<UserDao> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public UserDao save(UserDao userDao) {
        return userRepo.save(userDao);
    }

}
