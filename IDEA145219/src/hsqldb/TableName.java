package hsqldb;

import javax.persistence.*;

/**
 * Created by Olga Pavlova on 6/9/2016.
 */
@Entity
@Table(name = "TABLE_NAME", schema = "PUBLIC", catalog = "PUBLIC")
public class TableName {
    private Integer column1;
    private String column2;

    @Basic
    @Column(name = "COLUMN_1", nullable = true)
    public Integer getColumn1() {
        return column1;
    }

    public void setColumn1(Integer column1) {
        this.column1 = column1;
    }

    @Basic
    @Column(name = "COLUMN_2", nullable = true, length = 255)
    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TableName tableName = (TableName) o;

        if (column1 != null ? !column1.equals(tableName.column1) : tableName.column1 != null) return false;
        if (column2 != null ? !column2.equals(tableName.column2) : tableName.column2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = column1 != null ? column1.hashCode() : 0;
        result = 31 * result + (column2 != null ? column2.hashCode() : 0);
        return result;
    }

    /*private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }*/
}
