package ibdb.service.interfaces;

import ibdb.model.dao.BookDao;
import ibdb.model.dao.CategoryDao;
import ibdb.model.dao.MarkDao;

import java.util.List;

public interface BookService extends RatedEntity{

    BookDao getBookById(long id);

    List<BookDao> getAllBooks();

    List<CategoryDao> getAllCategories(BookDao bookDao);

    BookDao save(BookDao bookDao);
}
