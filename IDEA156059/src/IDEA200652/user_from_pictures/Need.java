package IDEA200652.user_from_pictures;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ACCOUNT")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Need extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false, nullable = false)
    @Setter(AccessLevel.NONE)
    private Integer student_need_id;
}
