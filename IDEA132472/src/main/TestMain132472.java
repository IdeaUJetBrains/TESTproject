package main;

import entities.Idea1;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by Olga Pavlova on 7/7/2016.
 */
public class TestMain132472 {
    public static void main(String[] argv) {
        Session session = new HibernateUtil().getSession();

        Query query = session.createQuery("SELECT b FROM entities.Idea1 b");
        List<Idea1> list = query.list();
        for(Idea1 hhh: list)
            System.out.println("hhh");
        int size = list.size();

        if (size  == 0) System.out.println("Нет данных  ");
        else  System.out.println("Найдено: " + size );

    }
}
