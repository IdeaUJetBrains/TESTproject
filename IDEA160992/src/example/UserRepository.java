package example;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByLastname(String lastname);

    @Query("select u from User u where u.emailAddress = ?1")
    User findByEmailAddress(String emailAddress);

    @Query("select u from User u where u.firstName like %?1")
    List<User> findByFirstnameEndsWith(String firstname);

    @Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1", nativeQuery = true)
    User findByEmailAddress1(String emailAddress);

    @Query(value = "SELECT * FROM USERS WHERE LASTNAME = ?1",
            countQuery = "SELECT count(*) FROM USERS WHERE LASTNAME = ?1",
            nativeQuery = true)
    Page<User> findByLastname(String lastname, Pageable pageable);
}