package IDEA145224_CheckForHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "prefix$MyEntity")
@Table(name = "TABLE_NAME")
public class TEST {
    private int id;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public enum TestEnum1 {
        val1,
        val2
    }

    @Entity
    @Table(name = "INNERENTITY")
    public static class InnerEntity {
        private int id;

        @Id
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public enum TestEnum1 {
            val1,
            val2
        }

    }
}
