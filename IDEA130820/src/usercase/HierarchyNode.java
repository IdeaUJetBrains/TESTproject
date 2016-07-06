package usercase;

import org.hibernate.HibernateException;
import org.hibernate.collection.spi.PersistentCollection;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.persister.collection.CollectionPersister;
import org.hibernate.usertype.UserCollectionType;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Iterator;
import java.util.Map;

@Entity
public class HierarchyNode implements UserCollectionType {
    @Id
    public int id;

    @Override
    public PersistentCollection instantiate(SessionImplementor sessionImplementor, CollectionPersister collectionPersister) throws HibernateException {
        return null;
    }

    @Override
    public PersistentCollection wrap(SessionImplementor sessionImplementor, Object o) {
        return null;
    }

    @Override
    public Iterator getElementsIterator(Object o) {
        return null;
    }

    @Override
    public boolean contains(Object o, Object o1) {
        return false;
    }

    @Override
    public Object indexOf(Object o, Object o1) {
        return null;
    }

    @Override
    public Object replaceElements(Object o, Object o1, CollectionPersister collectionPersister, Object o2, Map map, SessionImplementor sessionImplementor) throws HibernateException {
        return null;
    }

    @Override
    public Object instantiate(int i) {
        return null;
    }
}
