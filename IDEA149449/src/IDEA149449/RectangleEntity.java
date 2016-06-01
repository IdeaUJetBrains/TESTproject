package IDEA149449;

import javax.persistence.*;

@Entity
//@Table(name = "RECTANGLEENTITY")
public class RectangleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "X")
    public Integer x;

    @Column
    public Integer y;

    @Column
    @Convert(converter = ColorConverter.class)
    public Double Color;


}