package IDEA80738;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;


@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "CNL_ID"))})
public abstract class Channel extends AbstractSequenceTrackingEntity<Long> {

}