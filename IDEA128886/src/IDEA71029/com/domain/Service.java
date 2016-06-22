package IDEA71029.com.domain;

import IDEA71029.com.hibernate.CalendarImpl;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: ihannur
 * Date: 12/8/10
 * Time: 4:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Service {
   private long serviceCd;
    private long version;
    private long realmId;
    private String name;
    private String description;
    private CalendarImpl serviceStartDate;

    public long getServiceCd() {
        return serviceCd;
    }

    public long getVersion() {
        return version;
    }

    public long getRealmId() {
        return realmId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setServiceCd(long serviceCd) {
        this.serviceCd = serviceCd;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public void setRealmId(long realmId) {
        this.realmId = realmId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CalendarImpl getServiceStartDate() {
        return serviceStartDate;
    }

    public void setServiceStartDate(CalendarImpl serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }
}
