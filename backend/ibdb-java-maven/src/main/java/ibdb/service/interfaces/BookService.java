package ibdb.service.interfaces;

import ibdb.model.dao.BookDao;

import java.util.List;

public interface BookService {

    BookDao getBookById(long id);

    List<BookDao> getAllBooks();

    BookDao save(BookDao bookDao);
}
