import org.hibernate.Session;
import util.HibernateUtil;


/**
 * Created by Olga Pavlova on 6/2/2016.
 */
public class TestMain {

    public static void main(String[] argv) {

        Session session = new HibernateUtil().getSession();

        //TODO inspection bug: after empty_blob() shows the error <expression> expected, got ')'
        int queryInt = session.createQuery("update PrintTransaction pt set pt.dataFile = empty_blob() " +
                "where pt.id = :pt ").setParameter("pt", 1).executeUpdate();

        System.out.println("queryInt: " + queryInt);

    }


}




