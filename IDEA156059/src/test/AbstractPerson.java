package test;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractPerson {

    @Id
    public int id;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "ACCOUNT", nullable = false, referencedColumnName = "id")
    public Account account;
}
