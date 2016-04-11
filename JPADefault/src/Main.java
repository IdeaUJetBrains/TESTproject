import java.util.Collection;
import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
    public static void main(String[] a) throws Exception {
        JPAUtil util = new JPAUtil();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProfessorService");
        EntityManager em = emf.createEntityManager();
        ProfessorService service = new ProfessorService(em);

        em.getTransaction().begin();

        Professor emp = service.createProfessor(1,"name", 100);
        emp = service.createProfessor(2,"name 2", 100);

        Collection emps = em.createQuery("SELECT e FROM Professor e").getResultList();
        final Query query1 = em.createQuery("update  Professor  set name=DEFAULT where id=:id");

        for (Iterator i = emps.iterator(); i.hasNext();) {
            Professor e = (Professor) i.next();
            System.out.println("Professor " + e.getId() + ", " + e.getName());
        }
        util.checkData("select * from Professor");

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
