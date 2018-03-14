package ibdb.model.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "book", schema = "public")
public class BookDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen_book")
    @SequenceGenerator(name = "auto_gen_book", sequenceName = "book_id_seq", allocationSize = 1)
    private Long id;
    private String title;
    private Long[] author;
    private LocalDateTime year;
    private String publisher;
    private short cathegory;

    public BookDao(String title, Long[] author, short cathegory) {
        this.title = title;
        this.author = author;
        this.cathegory = cathegory;
    }
}
