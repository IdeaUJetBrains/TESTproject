package withoutInheritance;

import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;
import java.util.List;


public class AppMain {
    private static final String HQL = "SELECT b FROM Buss1 b WHERE b.id = :id";

    public static void main(String[] argv) {
        Session session = new HibernateUtil().getSession();

        Query query = session.createQuery(HQL).setParameter("id", 1);
        List results = query.list();
        System.out.println(results);

        if (results.size() == 0) {
            System.out.println("Нет данных:  " + HQL);
        } else  System.out.println("Найден: " + results.get(0));

    }







}