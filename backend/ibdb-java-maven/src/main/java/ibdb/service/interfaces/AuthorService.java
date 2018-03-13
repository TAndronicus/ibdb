package ibdb.service.interfaces;

import ibdb.model.dao.AuthorDao;

import java.util.List;

public interface AuthorService {

    AuthorDao findById(long id);

    List<AuthorDao> findAll();

    AuthorDao save(AuthorDao authorDao);
}
