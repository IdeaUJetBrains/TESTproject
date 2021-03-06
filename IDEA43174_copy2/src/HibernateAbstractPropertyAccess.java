package IDEA43174_copy2.src;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.AccessType;

import java.io.Serializable;

@Entity
@AccessType( "property")
public abstract class HibernateAbstractPropertyAccess extends SuperSuperHibernateClass {

    public int propertyAccess;

    //OK: error is Ok present - there is no setter
    public int getPropertyAccess() {
        return propertyAccess;
    }


    //OK: The error in ChildClass is OK absent - the setter is in SuperClass
    public void setPropertySetterInSuperClass(int setterInSuperClass) {

    }



    private String id;
    @Id
    public String getId() {    return id; }
    public void setId(String id) {   this.id = id;   }

    //TODO:
    // I don't know should this inspection work for abstract methods on not
    //Maybe not, only for implementations
    public abstract Serializable getId1();
}
