package ibdb.controller;

import ibdb.model.dao.UserDao;
import ibdb.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/{id}")
    public String getUserSurnameFromId(@PathVariable long id) {
        return userService.getUserById(id).toString();
    }

    @RequestMapping("/all")
    public List<UserDao> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/save/{surname}/{name}")
    public UserDao save(@PathVariable String surname, @PathVariable String name) {
        UserDao userDao = new UserDao(surname, name);
        return userService.save(userDao);
    }

}
