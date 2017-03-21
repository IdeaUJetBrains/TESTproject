package entity;



import javax.persistence.*;

@Entity
@Table(name = "ENTITY_WITH_ENUM")
public class EntityWithEnumField {



    private int id;

    @Id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    @Enumerated(EnumType.STRING)
    @Column(name="GENDER", nullable=false)
    private Gender gender;


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public enum Gender {
        MALE,
        FEMALE,
        NEUTRUM
    }

}
