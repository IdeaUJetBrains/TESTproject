package IDEA43174_copy1.src;

import org.hibernate.annotations.AccessType;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AccessType( "field")
public class HibernateFieldAccess {

    //NotOK!!!:
    // the error should be absent - the setter is not needed in Field access
    private int propertySetterInSuperClass;
    public int getPropertySetterInSuperClass() {
        return propertySetterInSuperClass;
    }



    private String id;
    @Id
    public String getId() {    return id; }
    public void setId(String id) {   this.id = id;   }
}
