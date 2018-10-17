package IDEA200652.user_from_pictures;

import org.hibernate.Session;
import util.HibernateUtil;


public class AppMain {
    public static void main(String[] argv) {
        Session session = new HibernateUtil().getSession();
        session.createQuery("SELECT e.add_user_id, " +
                "e.student_need_id " +
                "FROM Need e" );


        session.createQuery("SELECT CONCAT(e.add_user_id, " +
                "e.student_need_id ) " +
                "FROM Need e" );

    }
}