package ibdb.model.dao;

import ibdb.conf.DaoConfig;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(
        name = "book",
        schema = "public"
)
public class BookDao extends DaoConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen_book")
    @SequenceGenerator(name = "auto_gen_book", sequenceName = "book_id_seq", allocationSize = 1)
    private Long id;
    private String title;
    private LocalDate year;
    private String publisher;
    @Type(
            type = "long-array"
    )
    @Column(
            columnDefinition = "bigint[]"
    )
    private Long[] author;
    @Type(
            type = "short-array"
    )
    @Column(
            columnDefinition = "smallint[]"
    )
    private Short[] cathegory;

    public BookDao(String title, Long[] author, Short[] cathegory) {
        this.title = title;
        this.author = author;
        this.cathegory = cathegory;
    }
}
