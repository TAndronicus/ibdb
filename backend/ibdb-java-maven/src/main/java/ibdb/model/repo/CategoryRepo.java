package ibdb.model.repo;

import ibdb.model.dao.CategoryDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepo extends JpaRepository<CategoryDao, Short> {

    CategoryDao findById(long id);

    List<CategoryDao> findAll();

}
