package IDEA200652.user_from_pictures;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

    @Column
    @NotNull
    protected Integer add_user_id;


    @NotNull
    protected Integer update_user_id;

}
