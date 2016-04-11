package data.data1;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Olga Pavlova on 4/1/2016.
 */
@Entity
@Table(name = "TABLE_NAME6", schema = "PUBLIC", catalog = "PUBLIC")
public class TableName6 {
    private Integer column1;
    private Integer column2;
    private Integer column3;
    private Integer column4;
    private String column5;

    @Basic
    @Column(name = "COLUMN_1", nullable = true)
    public Integer getColumn1() {
        return column1;
    }

    public void setColumn1(Integer column1) {
        this.column1 = column1;
    }

    @Basic
    @Column(name = "COLUMN_2", nullable = true)
    public Integer getColumn2() {
        return column2;
    }

    public void setColumn2(Integer column2) {
        this.column2 = column2;
    }

    @Basic
    @Column(name = "COLUMN_3", nullable = true)
    public Integer getColumn3() {
        return column3;
    }

    public void setColumn3(Integer column3) {
        this.column3 = column3;
    }

    @Basic
    @Column(name = "COLUMN_4", nullable = true)
    public Integer getColumn4() {
        return column4;
    }

    public void setColumn4(Integer column4) {
        this.column4 = column4;
    }

    @Basic
    @Column(name = "COLUMN_5", nullable = true, length = 255)
    public String getColumn5() {
        return column5;
    }

    public void setColumn5(String column5) {
        this.column5 = column5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TableName6 that = (TableName6) o;

        if (column1 != null ? !column1.equals(that.column1) : that.column1 != null) return false;
        if (column2 != null ? !column2.equals(that.column2) : that.column2 != null) return false;
        if (column3 != null ? !column3.equals(that.column3) : that.column3 != null) return false;
        if (column4 != null ? !column4.equals(that.column4) : that.column4 != null) return false;
        if (column5 != null ? !column5.equals(that.column5) : that.column5 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = column1 != null ? column1.hashCode() : 0;
        result = 31 * result + (column2 != null ? column2.hashCode() : 0);
        result = 31 * result + (column3 != null ? column3.hashCode() : 0);
        result = 31 * result + (column4 != null ? column4.hashCode() : 0);
        result = 31 * result + (column5 != null ? column5.hashCode() : 0);
        return result;
    }
}
