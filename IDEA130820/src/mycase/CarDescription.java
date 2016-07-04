package mycase;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name="car_description",
        uniqueConstraints = {
                @UniqueConstraint(columnNames={"language_id", "name"})
        }
)
public class CarDescription implements Serializable {
    private static final long serialVersionUID = 2840651722666001938L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @NotNull
    @ManyToOne
    private Car car;


    @Column(name = "language_id", insertable = false, updatable = false)
    private Long languageId;

    @NotNull
    @OneToOne
    @JoinColumn(name = "language_id")
    private Language language;

    public void setLanguage(Language language) {
        this.languageId = language.getId();
        this.language = language;
    }
}