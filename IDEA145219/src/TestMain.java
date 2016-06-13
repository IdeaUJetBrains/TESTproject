import oracleDB.Idea146324;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by Olga Pavlova on 6/13/2016.
 */
public class TestMain {


    public static void main(String[] argv) {
        Session session = new HibernateUtil().getSession();

        Query query = session.createQuery("SELECT b FROM Idea146324 b where b.col1>2");
        List<Idea146324> list = query.list();
        for(Idea146324 idea146324: list)
            System.out.println("idea146324: " + idea146324.getCol1() );
        int size = list.size();

        if (size  == 0) System.out.println("Нет данных  ");
        else  System.out.println("Найдено: " + size );

    }
}

