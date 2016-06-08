import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@org.hibernate.annotations.AccessType( "property")
public class HibernatePropertyAccess extends HibernateAbstractPropertyAccess {

    //OK: The error in ChildClass is OK absent - the setter is in SuperClass
    private int propertySetterInSuperClass;
    public int getPropertySetterInSuperClass() {
        return propertySetterInSuperClass;
    }

    //OK: The error in ChildClass is OK absent - the setter is in SuperSuperClass
    private int propertySetterInSuperSuperClass;
    public int getPropertySetterInSuperSuperClass() {
        return propertySetterInSuperClass;
    }

    @Override
    public Serializable getId1() {
        return null;
    }
}
