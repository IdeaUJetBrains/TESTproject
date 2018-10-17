package IDEA200652.simple_as_in_issue;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class SecondMapped extends FirstMapped {
    @Column
    String second_val;
}
