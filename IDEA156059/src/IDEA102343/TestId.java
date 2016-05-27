package IDEA102343;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class TestId {

    //~ Instance fields --------------------------------------------------------

    private UUID m_id;

    //~ Methods ----------------------------------------------------------------

    @Id
    public UUID getId() {
        return m_id;
    }

    void setId(UUID id) {
        m_id = id;
    }

    //~ Inner Classes ----------------------------------------------------------
    // Is flagged as not having a primary key
    @Entity
    static class Inherited extends TestId {

        //~ Methods ------------------------------------------------------------

        @Override
        @Transient
        public UUID getId() {
            return super.getId();
        }
    }

}