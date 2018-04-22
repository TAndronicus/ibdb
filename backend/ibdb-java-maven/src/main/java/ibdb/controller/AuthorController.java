package ibdb.controller;


import ibdb.model.dao.AuthorDao;
import ibdb.model.dao.BookDao;
import ibdb.model.dao.MarkDao;
import ibdb.service.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    @RequestMapping("/marks/{id}")
    public List<MarkDao> getAllMarks(@PathVariable long id) {
        return authorService.getAllMarks(id);
    }

    @RequestMapping("/mean_mark/{id}")
    public Optional<Double> getMeanMark(@PathVariable long id) {
        return authorService.getMeanMark(id);
    }

    @RequestMapping("/books/{id}")
    public List<BookDao> findAllBooks(@PathVariable long id) {
        return authorService.findAllBooks(id);
    }

    @RequestMapping("/save/{surname}")
    public AuthorDao saveAuthorBySurname(@PathVariable String surname) {
        AuthorDao authorDao = new AuthorDao(surname);
        return authorService.save(authorDao);
    }

    @RequestMapping("/save/{surname}/{name}/{pseudonym}/{dateOfBirth}/{placeOfBirth}/{dateOfDeath}/{placeOfDeath}")
    public AuthorDao saveAuthor(@PathVariable String surname, @PathVariable String name, @PathVariable String pseudonym,
                                @PathVariable String dateOfBirth, @PathVariable String placeOfBirth, @PathVariable String dateOfDeath,
                                @PathVariable String placeOfDeath) {
        AuthorDao authorDao = new AuthorDao();
        authorDao.setSurname(surname);
        authorDao.setName(name);
        List<String> pseudonyms = Stream.of(pseudonym.split(";")).map(item -> item.replaceAll(",", " ")).collect(Collectors.toList());
        authorDao.setPseudonym(pseudonyms.toArray(new String[pseudonyms.size()]));
        authorDao.setDateOfBirth(LocalDate.parse(dateOfBirth));
        authorDao.setPlaceOfBirth(placeOfBirth);
        authorDao.setDateOfDeath(LocalDate.parse(dateOfDeath));
        authorDao.setPlaceOfDeath(placeOfDeath);
        return authorService.save(authorDao);
    }
}
