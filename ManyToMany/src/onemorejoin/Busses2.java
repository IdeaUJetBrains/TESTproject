package onemorejoin;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by Olga Pavlova on 11/4/2015.
 */
@Entity
@Table(name = "BUSSES", schema = "PUBLIC", catalog = "PUBLIC")
public class Busses2 {
    private Map<Object, Drivers2> driverID23;

    @MapKey(name = "id")
    @ManyToMany
    @JoinTable(name = "BUSSDRIVERS", catalog = "PUBLIC", schema = "PUBLIC", joinColumns = @JoinColumn(name = "BUSSID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "DRIVERID", referencedColumnName = "ID"))
    public Map<Object, Drivers2> getDriverID23() {
        return driverID23;
    }

    public void setDriverID23(Map<Object, Drivers2> driverID23) {
        this.driverID23 = driverID23;
    }
}
