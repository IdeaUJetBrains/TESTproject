package IDEA156442;

import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * Created by Olga Pavlova on 6/2/2016.
 */
public class TestMain {

    public static void main(String[] argv) throws ParseException {
        Session session = new HibernateUtil().getSession();

        SimpleDateFormat dformat = new SimpleDateFormat("yyyy.MM.dd");
        //Date testdate = dformat.parse("2016-06-02");
        //String date=dformat.format(testdate );
        //System.out.println(date);

        Query query = session.createQuery("SELECT b FROM Test b where b.someDate=:dt");
        List<Test> list = query.setParameter("dt", dformat.parse("2016.06.02") ).list();
        printlnQuerydata(query);

        Query query2 = session.createQuery("SELECT b FROM Test b where b.someDate=:dt");
        List<Test> list1 = query2.setParameter("dt", new java.sql.Date(2016,06,02) ).list(); //deprecated
        printlnQuerydata(query2); // nothing found

        Query query3 = session.createQuery("SELECT b FROM Test b where b.someDate=\'2016-06-02\'");
        printlnQuerydata(query3);

    }


    private static void printlnQuerydata(Query query) {
        List<Test> list = query.list();
        for(Test test: list)
            System.out.println( "query result: " + test.getSomeText());
        int size = list.size();

        if (size  == 0) System.out.println("Нет данных  ");
        else  System.out.println("Найдено: " + size );
        System.out.println( );
    }
}
