import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;


public class TestMain {

    public static void main(String[] argv) {
        Session session = new HibernateUtil().getSession();

        //Query query = session.createQuery("SELECT b FROM IDEA79247 b where b.testchar=:testchar");
        //List<IDEA79247> list = query.setParameter("testchar", "J").list();
        Query query = session.createQuery("SELECT b FROM IDEA79247 b");
        List<IDEA79247> list = query.list();
        for(IDEA79247 rectangleEntity: list)
            System.out.println("IDEA79247: " + rectangleEntity.getTestchar() );
        int size = list.size();

        if (size  == 0) System.out.println("Нет данных  ");
        else  System.out.println("Найдено: " + size );

    }
}
