import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;


@MappedSuperclass
@TypeDefs({
        @TypeDef(name = JaNeeType.NAME, typeClass = JaNeeType.class)
})
public class BaseEntity  implements Serializable {

}