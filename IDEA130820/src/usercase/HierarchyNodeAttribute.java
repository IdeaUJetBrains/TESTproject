package usercase;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.dom4j.Attribute;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.persister.walking.spi.AttributeDefinition;
import usercase.HierarchyNode;

/**
 * Defines a Hierarchy Node Attribute
 *
 * @author rfranco
 */
@Entity
@Table(name = "IISOLVE_HIERARCHYNODE_ATTR")
@Cache(usage = CacheConcurrencyStrategy.NONE)
public class HierarchyNodeAttribute implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private HierarchyNodeAttributePK id;

    protected HierarchyNodeAttribute() {
        // Hibernate
    }

    public HierarchyNodeAttribute(HierarchyNode hierarchyNode, Attribute attribute) {
        id = new HierarchyNodeAttributePK(hierarchyNode, attribute);
    }

    public Attribute getAttribute() {
        return getId().getAttribute();
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HierarchyNodeAttribute)) {
            return false;
        }

        HierarchyNodeAttribute other = (HierarchyNodeAttribute) obj;
        return getId().equals(other.getId());
    }

    private HierarchyNodeAttributePK getId() {
        return id;
    }

    /**
     * Hierarchy Node Attribute Primary Key
     *
     * @author rfranco
     */
    @Embeddable
    public static class HierarchyNodeAttributePK implements Serializable {

        private static final long serialVersionUID = 1L;

        @ManyToOne
        @JoinColumn(name = "HIERARCHY_NODE_ID", nullable = false)
        private HierarchyNode hierarchyNode;

        @ManyToOne()
        @JoinColumn(name = "ATTRIBUTE_ID", nullable = false)
        private Attribute attribute;

        @ManyToOne()
        @JoinColumn(name = "ATTRIBUTE_DEFINITION_ID", nullable = false)
        private AttributeDefinition attributeDefinition;

        protected HierarchyNodeAttributePK() {
            // Hibernate
        }

        public HierarchyNodeAttributePK(HierarchyNode hierarchyNode, Attribute attribute) {
            this.hierarchyNode = hierarchyNode;
            this.attribute = attribute;
            //attributeDefinition = attribute.getAttributeDefinition();
        }

        public HierarchyNode getHierarchyNode() {
            return hierarchyNode;
        }

        public Attribute getAttribute() {
            return attribute;
        }

        public AttributeDefinition getAttributeDefinition() {
            return attributeDefinition;
        }

        @Override
        public int hashCode() {
            HashCodeBuilder builder = new HashCodeBuilder();
            builder.append(getAttribute());
            builder.append(getHierarchyNode());
            return builder.toHashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HierarchyNodeAttribute.HierarchyNodeAttributePK)) {
                return false;
            }
            HierarchyNodeAttribute.HierarchyNodeAttributePK other = (HierarchyNodeAttribute.HierarchyNodeAttributePK) obj;
            EqualsBuilder builder = new EqualsBuilder();
            builder.append(getAttribute(), other.getAttribute());
            builder.append(getHierarchyNode(), other.getHierarchyNode());
            return builder.isEquals();
        }
    }
}