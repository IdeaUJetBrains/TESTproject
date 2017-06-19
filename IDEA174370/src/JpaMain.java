import IDEA174370.Message;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpaMain {


    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "NewPersistenceUnit" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction().begin();

        Message msg = new Message( );
        msg.setText("text1");
        entitymanager.persist( msg );
        entitymanager.getTransaction( ).commit( );

        Query q1 = entitymanager.createQuery("SELECT count(p) FROM Message p");
                   System.out.println("Total : " + q1.getSingleResult());
        entitymanager.close();
        emfactory.close();
    }

}
