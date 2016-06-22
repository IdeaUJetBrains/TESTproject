package IDEA71029;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
// import org.intellij.lang.annotations.Language;
import util.HibernateUtil;

import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: ihannur
 * Date: 12/9/10
 * Time: 10:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestMain {

    public static void main(String[] args) {
        Session session = null;
        try{
            session = new HibernateUtil().getSession();

            //Enum String values are not identified
            Query query1 = session.createQuery("select cs.serviceName, cs.StatusCd from IDEA71029.com.domain.CompanyService cs where cs.StatusCd = 'Active'");
            //Dates are not identified properly
            Query query2 = session.createQuery("select cs.serviceName, cs.StatusCd from IDEA71029.com.domain.CompanyService cs where cs.StartDate >= :fromdate - 2");
            //User type for Number in SUM is not identified
            Query query3 = session.createQuery("select sum(cs.Amount) from IDEA71029.com.domain.CompanyService cs ");
            //Inner Queries are not parsed correctly
            Query query4 = session.createQuery("select cs from IDEA71029.com.domain.CompanyService as cs, IDEA71029.com.domain.Service as s where cs.Service.id = s.id and exists ( from cs.Service as ser where ser.ServiceStartDate > cs.StartDate)");


            Iterator ite = query1.list().iterator();
            System.out.println("Size="+ query1.list().size() );
            while ( ite.hasNext() ) {
                Object[] objects = (Object[])ite.next();
                System.out.println("Service Name:"+ objects[0]);
                System.out.println("Status code:"+ objects[1]);
            }

          /*  Iterator ite2 = query2.setParameter("fromdate", "2016-06-22 14:37:35.981000").list().iterator();
            System.out.println("Size="+ query2.list().size() );
            while ( ite2.hasNext() ) {
                Object[] objects = (Object[])ite2.next();
                System.out.println("cs.serviceName:"+ objects[0]);
                System.out.println("Status code:"+ objects[1]);
            }*/


            Iterator ite3 = query3.list().iterator();
            System.out.println("Size="+ query3.list().size() );
            while ( ite3.hasNext() ) {
                Object[] objects = (Object[])ite3.next();
                System.out.println("sum(cs.Amount):"+ objects[0]);
            }

            session.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
