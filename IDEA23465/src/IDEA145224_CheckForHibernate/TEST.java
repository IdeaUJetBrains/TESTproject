package IDEA145224_CheckForHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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
