
package IDEA174370;

/**
 * Created by peter on 06.06.17.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
    Every persistent entity class must have at least the <code>@Entity</code> annotation.
    Hibernate maps this class to a table called <code>MESSAGE</code>.
 */
@Entity
@Table(name = "MESSAGE")
public class Message {

    /*
        Every persistent entity class must have an identifier
        attribute annotated with <code>@Id</code>. Hibernate maps
        this attribute to a column named <code>ID</code>.
     */
    @Id

    /*
    @org.hibernate.annotations.GenericGenerator(
            name = "ID_GENERATOR",
            strategy = "enhanced-sequence",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name = "sequence_name",
                            value = "PWD_TEST_SEQUENCE"
                    ),
                    @org.hibernate.annotations.Parameter(
                            name = "initial_value",
                            value = "1000"
                    )
            })
    */
    /*
        Someone must generate identifier values; this annotation enables
        automatic generation of IDs.*/
    @GeneratedValue(generator = "ID_GENERATOR")
    private Long id;

    /*
        You usually implement regular attributes of a persistent class with private
        or protected fields, and public getter/setter method pairs. Hibernate maps
        this attribute to a column called <code>TEXT</code>.
     */
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}