package main;

import entities.Idea1;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by Olga Pavlova on 6/23/2016.
 */
public class IDEA132472Main {
    public static void main(String[] argv) {

        Session session = new HibernateUtil().getSession();


        List<Idea1> queryInt = session.createQuery("from Idea1").list();

        System.out.println("queryInt: " + queryInt);


        System.out.println("Size="+ queryInt.size() );
        for ( Idea1 res: queryInt ) {
            System.out.println("res: "+ res);
        }

    }


}
