package ibdb.model.repo;

import ibdb.model.dao.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<UserDao, Long> {

    UserDao findById(long id);

    List<UserDao> findAll();

    <T extends UserDao> T save(T bookDao);
}
