package ibdb.conf;

import com.vladmihalcea.hibernate.type.array.StringArrayType;
import ibdb.model.mappers.LongArrayType;
import ibdb.model.mappers.ShortArrayType;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.MappedSuperclass;

@TypeDefs({
        @TypeDef(
                name = "long-array",
                typeClass = LongArrayType.class
        ),
        @TypeDef(
                name = "short-array",
                typeClass = ShortArrayType.class
        ),
        @TypeDef(
                name = "string-array",
                typeClass = StringArrayType.class
        )
})
@MappedSuperclass
public class DaoConfig {
}
