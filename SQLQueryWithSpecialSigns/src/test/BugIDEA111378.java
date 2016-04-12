package test;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Olga Pavlova on 4/12/2016.
 */
public class BugIDEA111378 {
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

        List<String> postOrders = new ArrayList<String>();
        postOrders.add("test1");
        postOrders.add("test2");

        List l = session.createSQLQuery("SELECT e.* FROM MessageEntry e WHERE e.from_id = :fromId AND e.postOrder IN :postOrders")
                .addEntity(MessageEntry.class)
                .setParameter("fromId", "3")
                .setParameterList("postOrders", postOrders).list();

    }


}
