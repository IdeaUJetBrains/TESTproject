package test;

import org.hibernate.annotations.Entity;

import javax.ejb.EJB;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Olga Pavlova on 4/11/2016.
 */
@javax.persistence.Entity
@Table(name = "MESSAGE_ENTRY", schema = "PUBLIC", catalog = "PUBLIC")
@EJB
public class MessageEntry {
    private int id;
    private String from_id;
    private String postOrder;
    private String fromId;

    @Basic
    @Column(name = "POST_ORDER", nullable = true, length = 255)
    public String getPostOrder() {

        return postOrder;
    }

    public void setPostOrder(String postOrder) {
        this.postOrder = postOrder;
    }

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom_id() {
        return from_id;
    }

    public void setFrom_id(String from_id) {
        this.from_id = from_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageEntry messageEntry = (MessageEntry) o;

        if (id != messageEntry.id) return false;
        if (from_id != null ? !from_id.equals(messageEntry.from_id) : messageEntry.from_id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (from_id != null ? from_id.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "FROM_ID", nullable = true, length = 255)
    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }
}
