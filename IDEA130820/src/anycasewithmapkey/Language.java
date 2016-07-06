package anycasewithmapkey;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Language implements Serializable {
    private static final long serialVersionUID = 3968717758435500381L;

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    @EmbeddedId
    private LanguagePK id;

    public LanguagePK getId() {
        return id;
    }

    public void setId(LanguagePK id) {
        this.id = id;
    }

    @Embeddable
    public static class LanguagePK implements Serializable {
        private Long id;

        public LanguagePK() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }



        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LanguagePK that = (LanguagePK) o;

            return id.equals(that.id);

        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }
    }

}