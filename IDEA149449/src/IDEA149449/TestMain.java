package IDEA149449;

import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by Olga Pavlova on 5/31/2016.
 */
public class TestMain {


    public static void main(String[] argv) {
        Session session = new HibernateUtil().getSession();

        Query query = session.createQuery("SELECT b FROM RectangleEntity b");
        List<RectangleEntity> list = query.list();
        for(RectangleEntity rectangleEntity: list)
            System.out.println("rectangleEntity.Color: " + rectangleEntity.Color);
        int size = list.size();

        if (size  == 0) System.out.println("Нет данных  ");
        else  System.out.println("Найдено: " + size );

    }
}
