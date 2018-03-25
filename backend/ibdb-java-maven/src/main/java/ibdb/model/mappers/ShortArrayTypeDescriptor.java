package ibdb.model.mappers;

import com.vladmihalcea.hibernate.type.array.internal.AbstractArrayTypeDescriptor;

public class ShortArrayTypeDescriptor extends AbstractArrayTypeDescriptor<short[]> {
    public static final ShortArrayTypeDescriptor INSTANCE = new ShortArrayTypeDescriptor();

    public ShortArrayTypeDescriptor() {
        super(short[].class);
    }

    protected String getSqlArrayType() {
        return "smallint";
    }
}