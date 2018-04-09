package ibdb.model.repo;

import ibdb.model.dao.MarkDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarkRepo extends JpaRepository<MarkDao, Long> {

    MarkDao findById(long id);

    List<MarkDao> findByUser(long user);

    List<MarkDao> findByBook(long book);

    MarkDao save(MarkDao markDao);

}
