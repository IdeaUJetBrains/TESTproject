package mycase;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Language implements Serializable {
    private static final long serialVersionUID = 3968717758435500381L;


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}