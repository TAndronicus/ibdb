package ibdb.model.mappers;

import com.vladmihalcea.hibernate.type.array.internal.AbstractArrayTypeDescriptor;

public class LongArrayTypeDescriptor extends AbstractArrayTypeDescriptor<long[]> {
    public static final LongArrayTypeDescriptor INSTANCE = new LongArrayTypeDescriptor();

    public LongArrayTypeDescriptor() {
        super(long[].class);
    }

    protected String getSqlArrayType() {
        return "bigint";
    }
}