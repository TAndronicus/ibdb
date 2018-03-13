package ibdb.model.repo;

import ibdb.model.dao.BookDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<BookDao, Long> {

    BookDao findById(long id);

    List<BookDao> findAll();

    BookDao save(BookDao bookDao);
}
