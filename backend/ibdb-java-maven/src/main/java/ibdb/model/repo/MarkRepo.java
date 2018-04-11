package ibdb.model.repo;

import ibdb.model.dao.MarkDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MarkRepo extends JpaRepository<MarkDao, Long> {

    MarkDao findById(long id);

    List<MarkDao> findByUser(long user);

    List<MarkDao> findByBook(long book);

    @Query(value = "SELECT m.id, m.\"user\", m.book, m.mark FROM public.mark m INNER JOIN public.book b ON m.book = b.id WHERE ?1 = ANY(b.author)", nativeQuery = true)
    List<MarkDao> findByAuthor(long author);

    MarkDao save(MarkDao markDao);

}
