package ibdb.model.repo;

import ibdb.model.dao.BookDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepo extends JpaRepository<BookDao, Long> {

    BookDao findById(long id);

    List<BookDao> findAll();

    @Query(value = "SELECT b.id, b.title, b.year, b.publisher, b.author, b.cathegory FROM public.book b WHERE 1 = ANY(b.author)", nativeQuery = true)
    List<BookDao> findByAuthor(long author);

    BookDao save(BookDao bookDao);
}
