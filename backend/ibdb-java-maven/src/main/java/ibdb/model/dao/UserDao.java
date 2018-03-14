package ibdb.model.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user", schema = "public")
public class UserDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen_user")
    @SequenceGenerator(name = "auto_gen_user", sequenceName = "user_id_seq", allocationSize = 1)
    private Long id;
    private String surname;
    private String name;
    private LocalDateTime dateOfBirth;
    private String placeOfBirth;

    public UserDao(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
}
