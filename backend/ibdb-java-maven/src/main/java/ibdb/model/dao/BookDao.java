package ibdb.model.dao;

import ibdb.conf.DaoConfig;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    private LocalDateTime year;
    private String publisher;
    @Type(
            type = "long-array"
    )
    @Column(
            columnDefinition = "bigint[]"
    )
    private long[] author;
    @Type(
            type = "short-array"
    )
    @Column(
            columnDefinition = "smallint[]"
    )
    private short[] cathegory;

    public BookDao(String title, long[] author, short[] cathegory) {
        this.title = title;
        this.author = author;
        this.cathegory = cathegory;
    }
}
