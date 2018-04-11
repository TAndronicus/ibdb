package ibdb.controller;

import ibdb.model.dao.BookDao;
import ibdb.model.dao.CategoryDao;
import ibdb.model.dao.MarkDao;
import ibdb.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.ArrayList;
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

    @RequestMapping("/marks/{id}")
    public List<MarkDao> getAllMarks(@PathVariable long id) {
        return bookService.getAllMarks(id);
    }

    @RequestMapping("/categories/{id}")
    public List<CategoryDao> getAllCategories(@PathVariable long id) {
        BookDao bookDao = bookService.getBookById(id);
        return bookService.getAllCategories(bookDao);
    }

    @RequestMapping("/save/{title}/{author}/{category}")
    public BookDao saveByTitleAuthorCategory(@PathVariable String title, @PathVariable Long author, @PathVariable Short category) {
        Long[] authors = {author};
        Short[] categories = {category};
        BookDao bookDao = new BookDao(title, authors, categories);
        return bookService.save(bookDao);
    }

}
