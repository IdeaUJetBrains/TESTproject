package IDEA93082;



import result156059WithFields.Buss;
import result156059WithFields.Driver;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;


@MappedSuperclass
@XmlRootElement
public abstract class AbstractBuss implements Serializable {

    private static final long serialVersionUID = 1L;
    protected transient Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @XmlTransient
    public Long getId() {
        return id;
    }


}
