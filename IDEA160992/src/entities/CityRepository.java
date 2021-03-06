package entities;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//import entities.City;
//import org.springframework.data.repository.CrudRepository;

@Repository
public interface CityRepository extends CrudRepository<City, Integer>
{

    List<City> findByName(String test);


    @Query(value = "select t.id from City t where t.type = :type", nativeQuery = true)
    List<Long> findBytype(@Param("type") EnumType type);

}