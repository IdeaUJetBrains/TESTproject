package usercase;

import org.dom4j.tree.AbstractEntity;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.OptimisticLock;
import org.hibernate.persister.walking.spi.AttributeDefinition;
import org.hsqldb.lib.HashMap;

import javax.persistence.CascadeType;
import javax.persistence.MapKey;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import java.util.Map;

/**
 * Created by Olga Pavlova on 6/24/2016.
 */
@MappedSuperclass
public abstract class AbstractAssignableNode extends AbstractEntity{

    private static final long serialVersionUID = 1L;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id.hierachyNode", orphanRemoval = true)
    @MapKey(name = "id.attributeDefinition")
    @OptimisticLock(excluded = true)
    @Cache(usage = CacheConcurrencyStrategy.NONE)
    private final Map<AttributeDefinition, usercase.HierarchyNodeAttribute> hierarchyNodeAttributes = new java.util.HashMap<>();

    protected AbstractAssignableNode(){}
}
