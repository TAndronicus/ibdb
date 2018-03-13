package ibdb.model.dao;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "user", schema = "public")
public class UserDao {

    @Id
    @GeneratedValue
    private Long id;
    private String surname;
    private String name;
    private LocalDateTime dateOfBirth;
    private String placeOfBirth;

}
