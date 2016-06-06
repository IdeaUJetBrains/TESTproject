import org.hibernate.annotations.TypeDef;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by Olga Pavlova on 6/6/2016.
 */
@MappedSuperclass
@TypeDef(name = "typeDefName", typeClass = JaNeeType.class)
public class BaseEntity1  implements Serializable {

}