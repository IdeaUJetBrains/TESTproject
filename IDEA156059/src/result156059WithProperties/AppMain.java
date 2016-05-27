package result156059WithProperties;

import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


public class AppMain {
    private static final String HQL = "SELECT b FROM Buss b WHERE b.driverById.id = :drId";

    public static void main(String[] argv) {
        Session session = new HibernateUtil().getSession();

        Query query = session.createQuery(HQL).setParameter("drId", 1);
        List<Buss> results = (List<Buss>)query.list();
        System.out.println(results);

        if (results.size() == 0) {
            System.out.println("Нет данных:  " + HQL);
        } else  {
            System.out.println("Количество найденных: " + results.size());
            for (Buss name : results) {
                System.out.println("Name: " + name.getBussname() + ", bussdriver=" + name.getDriverid());
            }
        }

    }

    public static Buss getBuss(EntityManager em, String testParam) {
        TypedQuery<Buss> query = em.createQuery( HQL, Buss.class);
        return query.setParameter("drId", testParam).getSingleResult();
    }





}