package withoutInheritance;

import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


public class AppMain {
    private static final String HQL = "SELECT b FROM Buss b WHERE b.id = :id";

    public static void main(String[] argv) {
        Session session = new HibernateUtil().getSession();
        //String id = argv[0];
        //session.beginTransaction();

        Query query = session.createQuery(HQL).setParameter("id", 1);
        List results = query.list();
        System.out.println(results);

        if (results.size() == 0) {
            System.out.println("Нет данных:  " + HQL);
        } else  System.out.println("Найден: " + results.get(0));

    }

    public static Buss getBuss(EntityManager em, String testParam) {
        TypedQuery<Buss> query = em.createQuery( HQL, Buss.class);
        return query.setParameter("id", testParam).getSingleResult();
    }





}