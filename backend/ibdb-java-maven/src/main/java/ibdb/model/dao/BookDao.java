package ibdb.model.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "book", schema = "public")
public class BookDao {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Long author;
    private LocalDateTime year;
    private String publisher;
    private short cathegory;

}
