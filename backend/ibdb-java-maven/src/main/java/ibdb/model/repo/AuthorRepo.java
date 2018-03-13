package ibdb.model.repo;

import ibdb.model.dao.AuthorDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepo extends JpaRepository<AuthorDao, Long> {

    AuthorDao findById(long id);

    List<AuthorDao> findAll();

    AuthorDao save(AuthorDao authorDao);
}
