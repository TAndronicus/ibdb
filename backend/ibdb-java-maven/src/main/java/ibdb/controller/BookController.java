package ibdb.controller;

import ibdb.model.dao.BookDao;
import ibdb.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/{id}")
    public String getUserSurnameFromId(@PathVariable long id) {
        return bookService.getBookById(id).toString();
    }

    @RequestMapping("/all")
    public List<BookDao> getAllBooks() {
        return bookService.getAllBooks();
    }

}
