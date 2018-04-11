package ibdb.model.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(
        name = "cathegory",
        schema = "public"
)
public class CategoryDao {

    @Id
    private Short id;
    private String name;

}
