package ibdb.service.implementations;

import ibdb.model.dao.AuthorDao;
import ibdb.model.repo.AuthorRepo;
import ibdb.service.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    AuthorRepo authorRepo;

    @Override
    public AuthorDao findById(long id) {
        return authorRepo.findById(id);
    }

    @Override
    public List<AuthorDao> findAll() {
        return authorRepo.findAll();
    }

    @Override
    public AuthorDao save(AuthorDao authorDao) {
        return authorRepo.save(authorDao);
    }
}
