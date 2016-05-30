package test;

import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by Olga Pavlova on 5/27/2016.
 */
public class CreditCardMain {
    private static final String HQL = "SELECT p FROM CreditCardPayment p";

    public static void main(String[] argv) {
        //Session session = new HibernateUtil().getSession();
        //session.beginTransaction();
        //CreditCardPayment credit = new CreditCardPayment("C",1.0);
        //session.save(credit);
        //session.getTransaction().commit();
        //session.close();

        Session session1 = new HibernateUtil().getSession();
        Query query = session1.createQuery(HQL); //.setParameter("drId", 1);
        List<CreditCardPayment> list = query.list();
        int listSize = list.size();
        if (listSize== 0) System.out.println("Нет данных:  " + HQL);
        else {
            System.out.println("Количество найденных: " + listSize);
            for (CreditCardPayment listI:list ) {
                System.out.println("getCreditCardType: " + listI.getCreditCardType());
                System.out.println("getAmount: " + listI.getAmount() );
                System.out.println("getId: " + listI.getId() );
            }
        }

    }
}
