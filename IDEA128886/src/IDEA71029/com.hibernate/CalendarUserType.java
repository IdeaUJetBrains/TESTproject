package IDEA71029.com.hibernate;


import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.sql.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by IntelliJ IDEA.
 * User: ihannur
 * Date: 6/14/11
 * Time: 11:57 AM
 * To change this template use File | Settings | File Templates.
 */
public final class CalendarUserType implements UserType
{

    private static final Logger sHibernateLogger = LoggerFactory.getLogger("org.hibernate.type");

    private static final int[] sSqlTypes = new int[] { Types.TIMESTAMP };

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




    public final boolean isMutable()
    {
        return true;
    }

    @SuppressWarnings("unchecked")
    public final Class returnedClass()
    {
       return java.util.Calendar.class;
    }

    public final Object deepCopy(Object value)
    {

    	if (value == null)
        {
            return null;
        }
        else if (value instanceof Timestamp)
        {
            return value == null ? null : new CalendarImpl(((Timestamp) value).getTime());
        }
        else if (value instanceof Date)
        {
            return new Timestamp(((Date)value).getTime());
        }
        else if (value instanceof CalendarImpl)
        {
            return value;
        }
        else
        {
            throw new HibernateException("Unsupported value type: " + value.getClass());
        }

    }

    @Override
    public final Object nullSafeGet(ResultSet rs, String[] names, SessionImplementor sessionImplementor, Object owner) throws SQLException
    {
        Timestamp ts = rs.getTimestamp(names[0], java.util.Calendar.getInstance(TimeZone.getTimeZone("UTC")));

        if (sHibernateLogger.isDebugEnabled())
        {
            sHibernateLogger.debug(this.getClass().getSimpleName() + " - returning '"
                    + ts + " as column: " + names[0]);
        }

        return ts == null ? null : new CalendarImpl(ts.getTime());

    }
    @Override
    public final void nullSafeSet(PreparedStatement st, Object value, int index, SessionImplementor sessionImplementor) throws SQLException
    {
        Object localValue = value;
        java.util.Calendar utcCalendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("UTC"));

        if (localValue != null && ! (localValue instanceof Timestamp))
        {
            localValue = localValue == null ? null : new Timestamp(((CalendarImpl)localValue).mTime);
        }

        if (sHibernateLogger.isDebugEnabled())
        {
            sHibernateLogger.debug(this.getClass().getSimpleName() + " - binding '"
                    + value + ", " + utcCalendar + "' to parameter: " + index);
        }

        st.setTimestamp(index, (Timestamp)localValue, utcCalendar);

    }

    public final Object assemble(Serializable cached, Object owner) throws HibernateException
    {
        if (cached == null) return null;
        GregorianCalendar calendar = (GregorianCalendar) cached;
        return new CalendarImpl(calendar);
    }

    public final Serializable disassemble(Object value) throws HibernateException
    {
        if (value == null) return null;
        CalendarImpl valueAsSpcfCalendar = (CalendarImpl) value;
        return valueAsSpcfCalendar.toSpecific();
    }

    public final Object replace(Object original, Object target, Object owner) throws HibernateException
    {
       return deepCopy(original);
    }
}
