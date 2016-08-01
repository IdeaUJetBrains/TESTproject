package util;

import org.hibernate.Session;

public class HibernateUtil {
    private static Session session;

    public HibernateUtil(){
        this.session = HibernateSessionFactory.getSessionFactory().openSession();
    }

    public Session getSession(){return session;   }

    public static void shutdown() {
        session.close();
    }

}
