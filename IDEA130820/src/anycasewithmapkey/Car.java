package anycasewithmapkey;



import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "IDEA130820CAR")
public class Car implements Serializable {
    private static final long serialVersionUID = -5041816842632017838L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @OneToMany(mappedBy="car")
    @MapKey(name = "languageId")
    private Map<Long, CarDescription> carDescription = new HashMap<>(0);
}