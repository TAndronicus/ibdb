package ibdb.service.interfaces;

import ibdb.model.dao.BookDao;
import ibdb.model.dao.MarkDao;

import java.util.List;

public interface BookService extends RatedEntity{

    BookDao getBookById(long id);

    List<BookDao> getAllBooks();

    BookDao save(BookDao bookDao);
}
