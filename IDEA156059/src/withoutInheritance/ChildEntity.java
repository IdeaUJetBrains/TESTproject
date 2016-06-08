package withoutInheritance;

import java.io.Serializable;

/**
 * Created by Olga Pavlova on 6/8/2016.
 */
public class ChildEntity extends BaseEntity {
    @Override
    public Serializable getId1() {
        return null;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }
}
