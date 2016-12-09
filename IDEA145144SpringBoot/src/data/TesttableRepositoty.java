package data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TesttableRepositoty  extends CrudRepository<Testtable, Long> {

    List<Testtable> findByFirstname(String lastName);

    List<Testtable> findByOrganizerIsIn(String lastName);

    List<Testtable> findByOrOrganizerAfter(String lastName);

    List<Testtable> findByOrOrganizerIs(String lastName);

}
