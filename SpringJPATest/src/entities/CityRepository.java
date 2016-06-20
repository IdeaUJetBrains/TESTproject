package entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//import entities.City;
//import org.springframework.data.repository.CrudRepository;

@Repository
public interface CityRepository extends CrudRepository<City, Integer>
{

    List<City> findByName(String test);



}