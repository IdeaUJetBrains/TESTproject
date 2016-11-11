package entities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        /*Resource r=new ClassPathResource("applicationContext.xml");
        BeanFactory factory= new XmlBeanFactory(r);*/
        ApplicationContext context= new ClassPathXmlApplicationContext("config/applicationContext.xml");

        CityDao dao=(CityDao)context.getBean("cityDao");

        City e=new City();
        e.setId(114);
        e.setName("setName");
        e.setState(true);
        e.setCountry("setCountry");
        e.setMap("setMap");

        dao.saveCity(e);

        System.out.println("City::" + e);

        List<City> list = dao.getCities();

        for(City p : list){
            System.out.println("City List::"
                    + p.getId() + ", "
                    + p.getCountry() + ", "
                    + p.getMap() + ", "
                    + p.getName() + ", "
                    + p.isState()

            );

        }

        //close resources
        //context.close();
    }

}
