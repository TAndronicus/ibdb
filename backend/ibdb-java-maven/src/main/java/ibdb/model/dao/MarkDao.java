package ibdb.model.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "mark", schema = "public")
public class MarkDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen_mark")
    @SequenceGenerator(name = "auto_gen_mark", sequenceName = "mark_id_seq", allocationSize = 1)
    private Long id;
    private Long user;
    private Long book;
    private short mark;

}
