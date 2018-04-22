package ibdb.service.interfaces;

import ibdb.model.dao.MarkDao;

import java.util.List;
import java.util.Optional;

public interface RatedEntity {

    List<MarkDao> getAllMarks(long id);

    Optional<Double> getMeanMark(long id);

}
