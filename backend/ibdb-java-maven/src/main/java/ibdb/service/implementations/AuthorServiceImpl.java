package ibdb.service.implementations;

import ibdb.model.dao.AuthorDao;
import ibdb.model.dao.BookDao;
import ibdb.model.dao.MarkDao;
import ibdb.model.repo.AuthorRepo;
import ibdb.model.repo.BookRepo;
import ibdb.model.repo.MarkRepo;
import ibdb.service.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    AuthorRepo authorRepo;

    @Autowired
    MarkRepo markRepo;

    @Autowired
    BookRepo bookRepo;

    @Override
    public AuthorDao findById(long id) {
        return authorRepo.findById(id);
    }

    @Override
    public List<AuthorDao> findAll() {
        return authorRepo.findAll();
    }

    @Override
    public List<BookDao> findAllBooks(long id) {
        return bookRepo.findByAuthor(id);
    }

    @Override
    public List<MarkDao> getAllMarks(long id) {
        return markRepo.findByAuthor(id);
    }

    @Override
    public Optional<Double> getMeanMark(long id) {
        List<MarkDao> marks = getAllMarks(id);
        int sum = 0;
        int count = 0;
        for(MarkDao mark : marks) {
            sum += mark.getMark();
            count += 1;
        }
        return count == 0 ? Optional.empty() : Optional.of(Double.valueOf(sum / count));
    }

    @Override
    public AuthorDao save(AuthorDao authorDao) {
        return authorRepo.save(authorDao);
    }
}
