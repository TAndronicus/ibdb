package ibdb.service.interfaces;

import ibdb.model.dao.MarkDao;

import java.util.List;

public interface RatedEntity {

    List<MarkDao> getAllMarks(long id);

}
