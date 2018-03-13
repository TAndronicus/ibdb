package ibdb.model.dao;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "author", schema = "public")
public class AuthorDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen_author")
    @SequenceGenerator(name = "auto_gen_author", sequenceName = "author_id_seq", allocationSize = 1)
    private Long id;
    private String surname;
    private String name;
    private String pseudonym;
    private LocalDateTime dateOfBirth;
    private String placeOfBirth;
    private LocalDateTime dateOfDeath;
    private String placeOfDeath;

    public AuthorDao(String surname) {
        this.surname = surname;
    }
}
