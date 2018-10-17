package IDEA200652.simple_as_in_issue;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class FirstMapped {
    @Column
    String first_val;
}
