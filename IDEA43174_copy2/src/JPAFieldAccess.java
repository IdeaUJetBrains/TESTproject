package IDEA43174_copy2.src;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Access( AccessType.FIELD)
public class JPAFieldAccess {

    //OK: the error is OK absent - the setter is not needed in Field access
    private int propertySetterInSuperClass;
    public int getPropertySetterInSuperClass() {
        return propertySetterInSuperClass;
    }



    private String id;
    @Id
    public String getId() {    return id; }
    public void setId(String id) {   this.id = id;   }

}
