package test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga Pavlova on 4/12/2016.
 */
public class IssueIDEA108719 {
    private static final SessionFactory ourSessionFactory;
    private static final ServiceRegistry serviceRegistry;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public void foo() throws Exception {
        final Session session = getSession();

        String sql = "UPDATE MessageEntry me, \n "
                + "(SELECT if(me.from_id=@prev,@row \\:=@row+1, @row\\:=0) AS posterId,\n"
                + "  me.id AS id, me.from_id, @prev \\:=me.from_id,me.date \n"
                + "FROM MessageEntry me,(SELECT @row\\:=0,@prev\\:=0) z \n"
                + "WHERE me.from_id IS NOT null ORDER BY me.from_id,me.date) ordered \n"
                + "SET me.postOrder =ordered.posterId WHERE\n" + "  me.id =ordered.id;";

        session.createSQLQuery(sql).executeUpdate();


    }

}
