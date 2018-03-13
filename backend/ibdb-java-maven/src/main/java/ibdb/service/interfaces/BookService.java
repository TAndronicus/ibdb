package ibdb.service.interfaces;

import ibdb.model.dao.BookDao;

import java.util.List;

public interface BookService {

    BookDao getBookById(long id);

    <T extends BookDao> List<T> getAllBooks();
}
