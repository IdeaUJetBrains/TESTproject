package IDEA200652.simple_as_in_issue;

import org.hibernate.Session;
import util.HibernateUtil;


public class AppMain {
    public static void main(String[] argv) {
        Session session = new HibernateUtil().getSession();
        session.createQuery("SELECT e.first_val, " +
                "e.second_val " +
                "FROM ExtendingEntity e" );

    }





}