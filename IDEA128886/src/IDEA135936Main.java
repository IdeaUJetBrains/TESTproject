import entities.Idea135936;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import java.text.ParseException;
import java.util.List;


/**
 * Created by Olga Pavlova on 6/16/2016.
 */
public class IDEA135936Main {
    public static void main(String[] argv) throws ParseException {
        Session session = new HibernateUtil().getSession();
        //TODO: all works OK, but Inspection gives an error on ":" and on "dt" in setParameter
        Query query = session.createQuery("SELECT b FROM Idea135936 b where b.boolcolumn is :dt");
        List<Idea135936> list = query.setParameter("dt", false ).list();
        printlnQuerydata(query);
        //TODO: all works OK, but inspection gives an error on "true" in a query string
        Query query1 = session.createQuery("SELECT b FROM Idea135936 b where b.boolcolumn is true");
        printlnQuerydata(query1);
    }


    private static void printlnQuerydata(Query query) {
        List<Idea135936> list = query.list();
        for(Idea135936 test: list)
            System.out.println( "Query result: id = " + test.getId() + ", test = " + test.getBoolcolumn());

        int size = list.size();
        if (size  == 0) System.out.println("Нет данных  ");
        else  System.out.println("Найдено: " + size );
        System.out.println( );
    }
}


