package result156059WithFields;

import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


public class AppMain1 {
    private static final String HQL = "SELECT b FROM Buss b WHERE b.driverById.id = :drId";
    private static final String HQL1 = "SELECT d FROM Buss d WHERE driverById.id = :drId";

    public static void main(String[] argv) {
        Session session = new HibernateUtil().getSession();

        Query query1 = session.createQuery(HQL).setParameter("drId", 1);
        Query query = session.createQuery(HQL1).setParameter("drId", 1);

        List<Buss> results = (List<Buss>)query.list();
        System.out.println(results);

        if (results.size() == 0) {
            System.out.println("Нет данных:  " + HQL);
        } else  {
            System.out.println("Количество найденных: " + results.size());
            for (Buss name : results) {
                System.out.println("Name: " + name.bussname + ", bussdriver=" + name.driverid );
            }
        }

    }

    public static Buss getBuss(EntityManager em, String testParam) {
        TypedQuery<Buss> query = em.createQuery( HQL, Buss.class);
        return query.setParameter("drId", testParam).getSingleResult();
    }





}