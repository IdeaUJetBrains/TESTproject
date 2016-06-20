package entities;

//import entities.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

        import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;


@SpringBootApplication
public class Application_NotWorking //implements CommandLineRunner
{

    private static final Logger log = LoggerFactory.getLogger(Application_NotWorking.class);

    public static void main(String args[]) {

        SpringApplication.run(Application_NotWorking.class, args);
    }

    @Bean
    public CommandLineRunner demo(CityRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new City("name1", "country1"));
            repository.save(new City("name2", "country2"));
            repository.save(new City("name3", "country3"));
            repository.save(new City("name4", "country4"));
            repository.save(new City("name5", "country5"));

            // fetch all customers
            log.info("City found with findAll():");
            log.info("-------------------------------");
            for (City customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            City city = repository.findOne(1);
            log.info("City found with findOne(1L):");
            log.info("--------------------------------");
            log.info(city.toString());
            log.info("");

            // fetch customers by last name
            log.info("city found with findByName('name1'):");
            log.info("--------------------------------------------");
            for (City bauer : repository.findByName("name1")) {
                log.info(bauer.toString());
            }
            log.info("");
        };
    }
    /*@Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... strings) throws Exception {

        log.info("Creating tables");

        jdbcTemplate.execute("DROP TABLE city IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE city(" +
                "id SERIAL, name VARCHAR(255), country VARCHAR(255))");

        // Split up the array of whole names into an array of first/last names
        List<Object[]> splitUpNames = Arrays.asList("name1 country1", "name2 country2", "name3 country3", "Josh Long").stream()
                .map(name -> name.split(" "))
                .collect(Collectors.toList());

        // Use a Java 8 stream to print out each tuple of the list
        splitUpNames.forEach(name -> log.info(String.format("Inserting customer record for %s %s", name[0], name[1])));

        // Uses JdbcTemplate's batchUpdate operation to bulk load data
        jdbcTemplate.batchUpdate("INSERT INTO city(name, country) VALUES (?,?)", splitUpNames);

        log.info("Querying for customer records where country = 'country1':");
        jdbcTemplate.query(
                "SELECT id, name, country FROM City WHERE country = ?", new Object[] { "country1" },
                (rs, rowNum) -> new City( rs.getString("name"), rs.getString("country"))
        ).forEach(customer -> log.info(customer.toString()));
    }*/
}

