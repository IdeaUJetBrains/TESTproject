package IDEA71029;

import entities.Test;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import java.text.ParseException;
import java.util.List;

/**
 * Created by Olga Pavlova on 6/21/2016.
 */
public class IDEA71029Main {
    public static void main(String[] argv) throws ParseException {
        Session session = new HibernateUtil().getSession();

        Query query = session.createQuery("SELECT b FROM Test b where b.test=:dt");
        List<Test> list = query.setParameter("dt", 2 ).list();
        printlnQuerydata(query);


    }


    private static void printlnQuerydata(Query query) {
        List<Test> list = query.list();
        for(Test test: list)
            System.out.println( "Query result: id = " + test.getId() + ", test = " + test.getTest());

        int size = list.size();
        if (size  == 0) System.out.println("Нет данных  ");
        else  System.out.println("Найдено: " + size );
        System.out.println( );
    }
}
