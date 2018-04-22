package ibdb.model.dao;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "author", schema = "public")
public class AuthorDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen_author")
    @SequenceGenerator(name = "auto_gen_author", sequenceName = "author_id_seq", allocationSize = 1)
    private Long id;
    private String surname;
    private String name;
    @Type(
            type = "string-array"
    )
    @Column(
            columnDefinition = "character varying[]"
    )
    private String[] pseudonym;
    private LocalDate dateOfBirth;
    private String placeOfBirth;
    private LocalDate dateOfDeath;
    private String placeOfDeath;

    public AuthorDao(String surname) {
        this.surname = surname;
    }

}
