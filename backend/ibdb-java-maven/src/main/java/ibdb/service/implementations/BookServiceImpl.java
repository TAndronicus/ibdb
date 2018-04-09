package ibdb.service.implementations;

import ibdb.model.dao.BookDao;
import ibdb.model.dao.MarkDao;
import ibdb.model.repo.BookRepo;
import ibdb.model.repo.MarkRepo;
import ibdb.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    MarkRepo markRepo;

    @Override
    public BookDao getBookById(long id) {
        return bookRepo.findById(id);
    }

    @Override
    public List<BookDao> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public List<MarkDao> getAllMarks(long id) {
        return markRepo.findByBook(id);
    }

    @Override
    public BookDao save(BookDao bookDao) {
        return bookRepo.save(bookDao);
    }
}
