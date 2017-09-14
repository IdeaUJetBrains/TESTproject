package IDEA80738;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@MappedSuperclass
public class AbstractSequenceTrackingEntity<T> {

    public void setId(Long id) {
        this.id = id;
    }

    protected transient Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

}
