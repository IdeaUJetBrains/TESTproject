package IDEA71029;

import IDEA71029.com.domain.CompanyService;
import IDEA71029.com.hibernate.Money;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
// import org.intellij.lang.annotations.Language;
import org.hibernate.cfg.beanvalidation.IntegrationException;
import util.HibernateUtil;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

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
            //User type for Number in SUM is not identified
            Query query2 = session.createQuery("select sum(cs.Amount) from IDEA71029.com.domain.CompanyService cs ");
            //Dates are not identified properly
            Query query3 = session.createQuery("select cs.serviceName, cs.StatusCd from IDEA71029.com.domain.CompanyService cs where cs.StartDate >= :fromdate  "); //-2
            //Inner Queries are not parsed correctly
            Query query4 = session.createQuery("select cs from IDEA71029.com.domain.CompanyService as cs, IDEA71029.com.domain.Service as s where cs.Service.id = s.id and exists ( from cs.Service as ser where ser.ServiceStartDate > cs.StartDate)");


            System.out.println("1. Query: "+ query1.toString() );
            Iterator ite1 = query1.list().iterator();
            System.out.println("Size="+ query1.list().size() );
            while ( ite1.hasNext() ) {
                Object[] objects = (Object[])ite1.next();
                System.out.println("Service Name:"+ objects[0]);
                System.out.println("Status code:"+ objects[1]);
            }

            System.out.println("2. Query: "+ query2.toString() );
            List<Money> moneyList = query2.list();
            System.out.println("Size="+ query2.list().size() );
            for ( Money c: moneyList ) {
                System.out.println("sum(cs.Amount):"+ c);
            }


            System.out.println("3. Query: "+ query3.toString() );
            Iterator ite3 = query3.setParameter("fromdate",  new Timestamp(1466690498) ).list().iterator();
            System.out.println("Size="+ query3.list().size() );
            while ( ite3.hasNext() ) {
                Object[] objects = (Object[])ite3.next();
                System.out.println("cs.serviceName:"+ objects[0]);
                System.out.println("Status code:"+ objects[1]);
            }



            System.out.println("4. Query: "+ query4.toString() );
            List<CompanyService> companyServiceList = query4.list();
            System.out.println("Size="+ query4.list().size() );
            for ( CompanyService c: companyServiceList ) {
                System.out.println("cs: "+ c);
            }

            session.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
