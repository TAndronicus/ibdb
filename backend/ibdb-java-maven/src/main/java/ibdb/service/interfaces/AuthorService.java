package ibdb.service.interfaces;

import ibdb.model.dao.AuthorDao;
import ibdb.model.dao.MarkDao;

import java.util.List;

public interface AuthorService extends RatedEntity{

    AuthorDao findById(long id);

    List<AuthorDao> findAll();

    AuthorDao save(AuthorDao authorDao);
}
