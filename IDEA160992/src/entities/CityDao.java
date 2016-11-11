package entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class CityDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public void saveCity(City p) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(p);
        tx.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    public List<City> getCities() {
        Session session = this.sessionFactory.openSession();
        List<City> cityList = session.createQuery("from City").list();
        session.close();
        return cityList;
    }

   /* HibernateTemplate template;
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
    //method to save City
    public void saveCity(City e){
        template.save(e);
    }
    //method to update City
    public void updateCity(City e){
        template.update(e);
    }
    //method to delete City
    public void deleteCity(City e){
        template.delete(e);
    }
    //method to return one City of given id
    public City getById(int id){
        City e=(City)template.get(City.class,id);
        return e;
    }
    //method to return all Cities
    public List<City> getCities(){
        List<City> list=new ArrayList<City>();
        list=template.loadAll(City.class);
        return list;
    }*/
}