package ibdb.controller;


import ibdb.model.dao.AuthorDao;
import ibdb.service.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @RequestMapping("/{id}")
    public AuthorDao findAuthorById(@PathVariable long id){
        return authorService.findById(id);
    }

    @RequestMapping("/all")
    public List<AuthorDao> findAllAuthors() {
        return authorService.findAll();
    }

    @RequestMapping("/save/{surname}")
    public AuthorDao saveAuthorBySurname(@PathVariable String surname) {
        AuthorDao authorDao = new AuthorDao(surname);
        return authorService.save(authorDao);
    }
}
