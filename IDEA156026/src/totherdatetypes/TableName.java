package totherdatetypes;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.ZonedDateTime;

/**
 * Created by Olga Pavlova on 9/28/2016.
 */
@Entity
@Table(name = "table_name_time_tz")
public class TableName {
    private int id;
    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    //private Time vTime;
    private ZonedDateTime vTimeWithTimeZone;
//    private Timestamp vTimestamp;
//    private ZonedDateTime vTimestampWithTimeZone;
//    private Date vDate;
//    private ZonedDateTime vInterval;
/*
    @Basic
    @Column(name = "v_time", nullable = true)
    public Time getvTime() {
        return vTime;
    }
    public void setvTime(Time vTime) {
        this.vTime = vTime;
    }
*/

    @Basic
    @Column(name = "v_time_with_time_zone", nullable = true)
    public ZonedDateTime getvTimeWithTimeZone() {
        return vTimeWithTimeZone;
    }
    public void setvTimeWithTimeZone(ZonedDateTime vTimeWithTimeZone) {
        this.vTimeWithTimeZone = vTimeWithTimeZone;
    }

    /*
    @Basic
    @Column(name = "v_timestamp", nullable = true)
    public Timestamp getvTimestamp() {
        return vTimestamp;
    }

    public void setvTimestamp(Timestamp vTimestamp) {
        this.vTimestamp = vTimestamp;
    }

    @Basic
    @Column(name = "v_timestamp_with_time_zone", nullable = true)
    public ZonedDateTime getvTimestampWithTimeZone() {
        return vTimestampWithTimeZone;
    }

    public void setvTimestampWithTimeZone(ZonedDateTime vTimestampWithTimeZone) {
        this.vTimestampWithTimeZone = vTimestampWithTimeZone;
    }

    @Basic
    @Column(name = "v_date", nullable = true)
    public Date getvDate() {
        return vDate;
    }

    public void setvDate(Date vDate) {
        this.vDate = vDate;
    }

    @Basic
    @Column(name = "v_interval", nullable = true)
    public ZonedDateTime getvInterval() {
        return vInterval;
    }

    public void setvInterval(ZonedDateTime vInterval) {
        this.vInterval = vInterval;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TableName tableName = (TableName) o;

        if (id != tableName.id) return false;
        if (vTime != null ? !vTime.equals(tableName.vTime) : tableName.vTime != null) return false;
        if (vTimeWithTimeZone != null ? !vTimeWithTimeZone.equals(tableName.vTimeWithTimeZone) : tableName.vTimeWithTimeZone != null)
            return false;
        if (vTimestamp != null ? !vTimestamp.equals(tableName.vTimestamp) : tableName.vTimestamp != null) return false;
        if (vTimestampWithTimeZone != null ? !vTimestampWithTimeZone.equals(tableName.vTimestampWithTimeZone) : tableName.vTimestampWithTimeZone != null)
            return false;
        if (vDate != null ? !vDate.equals(tableName.vDate) : tableName.vDate != null) return false;
        if (vInterval != null ? !vInterval.equals(tableName.vInterval) : tableName.vInterval != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vTime != null ? vTime.hashCode() : 0;
        result = 31 * result + (vTimeWithTimeZone != null ? vTimeWithTimeZone.hashCode() : 0);
        result = 31 * result + (vTimestamp != null ? vTimestamp.hashCode() : 0);
        result = 31 * result + (vTimestampWithTimeZone != null ? vTimestampWithTimeZone.hashCode() : 0);
        result = 31 * result + (vDate != null ? vDate.hashCode() : 0);
        result = 31 * result + (vInterval != null ? vInterval.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
    */
}

