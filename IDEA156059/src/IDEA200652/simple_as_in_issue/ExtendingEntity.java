package IDEA200652.simple_as_in_issue;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExtendingEntity extends SecondMapped {
    @Id
    int id;
}
