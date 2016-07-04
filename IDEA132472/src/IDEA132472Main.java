import entities.IDEA132472;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by Olga Pavlova on 6/23/2016.
 */
public class IDEA132472Main {
    public static void main(String[] argv) {

        Session session = new HibernateUtil().getSession();


        List<IDEA132472> queryInt = session.createQuery("select res from entities.IDEA132472 res").list();

        System.out.println("queryInt: " + queryInt);


        System.out.println("Size="+ queryInt.size() );
        for ( IDEA132472 res: queryInt ) {
            System.out.println("res: "+ res);
        }

    }


}
