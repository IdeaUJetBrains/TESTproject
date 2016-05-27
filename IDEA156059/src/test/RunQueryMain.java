package test;

import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by Olga Pavlova on 5/27/2016.
 */
public class RunQueryMain {
    private static final String HQL = "SELECT b FROM Buss b WHERE b.driverById.id = :drId";

    public static void main(String[] argv) {
        Session session = new HibernateUtil().getSession();
        Query query = session.createQuery(HQL).setParameter("drId", 1);
        int listSize = query.list().size();
        if (listSize== 0) System.out.println("Нет данных:  " + HQL);
        else System.out.println("Количество найденных: " + listSize);

    }


}
