package IDEA43174_copy.src;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Access( AccessType.PROPERTY)
public class JPAPropertyAccess extends JPAAbstractPropertyAccess {

    //OK: The error in ChildClass is OK absent - the setter is in SuperClass
    private int propertySetterInSuperClass;
    public int getPropertySetterInSuperClass() {
        return propertySetterInSuperClass;
    }


    @Override
    public Serializable getId1() {
        return null;
    }
}
