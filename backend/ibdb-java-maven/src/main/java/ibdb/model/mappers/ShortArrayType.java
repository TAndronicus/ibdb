package ibdb.model.mappers;

import com.vladmihalcea.hibernate.type.array.internal.ArraySqlTypeDescriptor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.usertype.DynamicParameterizedType;

import java.util.Properties;

public class ShortArrayType extends AbstractSingleColumnStandardBasicType<short[]> implements DynamicParameterizedType {

    public static final ShortArrayType INSTANCE = new ShortArrayType();

    public ShortArrayType() {
        super(ArraySqlTypeDescriptor.INSTANCE, ShortArrayTypeDescriptor.INSTANCE);
    }

    public String getName() {
        return "short-array";
    }

    @Override
    protected boolean registerUnderJavaType() {
        return true;
    }

    @Override
    public void setParameterValues(Properties parameters) {
        ((ShortArrayType) getJavaTypeDescriptor()).setParameterValues(parameters);
    }
}