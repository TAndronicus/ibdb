package ibdb.service.implementations;

import ibdb.model.dao.BookDao;
import ibdb.model.dao.CategoryDao;
import ibdb.model.dao.MarkDao;
import ibdb.model.repo.BookRepo;
import ibdb.model.repo.CategoryRepo;
import ibdb.model.repo.MarkRepo;
import ibdb.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    MarkRepo markRepo;

    @Autowired
    CategoryRepo categoryRepo;

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
    public Optional<Double> getMeanMark(long id) {
        return Optional.empty();
    }

    @Override
    public List<CategoryDao> getAllCategories(BookDao bookDao) {
        Short[] categoryIds = bookDao.getCathegory();
        List<CategoryDao> categories = new ArrayList<>();
        for(Short categoryId : categoryIds) {
            Optional<CategoryDao> categoryDao = categoryRepo.findById(categoryId);
            categoryDao.ifPresent(categories::add);
        }
        return categories;
    }

    @Override
    public BookDao save(BookDao bookDao) {
        return bookRepo.save(bookDao);
    }
}
