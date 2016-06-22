package IDEA71029.com.hibernate;

import org.hibernate.engine.spi.SessionImplementor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.HibernateException;
import org.hibernate.usertype.UserType;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 * Created by IntelliJ IDEA.
 * User: ihannur
 * Date: 6/14/11
 * Time: 4:52 PM
 * To change this template use File | Settings | File Templates.
 */
public final class MoneyUserType implements UserType
{
    private static final Logger sHibernateLogger = LoggerFactory.getLogger("org.hibernate.type");

    private static final int[] sSqlTypes = new int[] { Types.NUMERIC };

    public final int[] sqlTypes()
    {
        return sSqlTypes;
    }

    public final boolean equals(Object x, Object y)
    {
        return (x == null) ? (y == null) : x.equals(y);
    }

    public final int hashCode(Object obj)
    {
        return obj.hashCode();
    }

    @Override
    public Object nullSafeGet(ResultSet resultSet, String[] strings, SessionImplementor sessionImplementor, Object o) throws HibernateException, SQLException {
        return null;
    }

    @Override
    public void nullSafeSet(PreparedStatement preparedStatement, Object o, int i, SessionImplementor sessionImplementor) throws HibernateException, SQLException {

    }

    public final boolean isMutable()
    {
        return false;
    }

    @SuppressWarnings("unchecked")
    public final Class returnedClass()
    {
       return Money.class;
    }

    public final Object deepCopy(Object value)
    {
        if (value == null)
        {
            return null;
        }
        else if (value instanceof java.math.BigDecimal)
        {
			return new Money(value.toString());
        }
        else if (value instanceof Money)
        {
            return value;
        }
        else
        {
            throw new HibernateException("Unsupported value type: " + value.getClass());
        }
    }

    public final Object nullSafeGet(ResultSet rs, String[] names, Object owner) throws SQLException
    {
    	Money money;

        java.math.BigDecimal bigDecimalDb = rs.getBigDecimal(names[0]);

        if(bigDecimalDb == null)
        {
        	return null;
        }
        else
        {
        	money = new Money(bigDecimalDb.toString());
        }

        if (sHibernateLogger.isDebugEnabled())
        {
            sHibernateLogger.debug(this.getClass().getSimpleName() + " - unbinding '" + bigDecimalDb +
            		"' from parameter: " + names[0]);
        }

		return money;

    }

    public final void nullSafeSet(PreparedStatement st, Object value, int index) throws SQLException
    {
        Object localValue = value;

        if (value instanceof Money)
        {
        	Money mny = (Money)value;
        }
        if (sHibernateLogger.isDebugEnabled())
        {
            sHibernateLogger.debug(this.getClass().getSimpleName() + " - binding '"
                    + value + "' to parameter: " + index);
        }

        st.setBigDecimal(index, (java.math.BigDecimal)localValue);


    }

    public final Object assemble(Serializable cached, Object owner) throws HibernateException
    {
        return null;
    }

    public final Serializable disassemble(Object value) throws HibernateException
    {
        return null;
    }

    public final Object replace(Object original, Object target, Object owner) throws HibernateException
    {
       return deepCopy(original);
    }
}
