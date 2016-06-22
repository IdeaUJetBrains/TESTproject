package IDEA71029.com.domain;

import IDEA71029.com.hibernate.CalendarImpl;
import IDEA71029.com.hibernate.Money;

/**
 * Created by IntelliJ IDEA.
 * User: ihannur
 * Date: Dec 9, 2010
 * Time: 11:30:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class CompanyService {



    private long version;
    private String creatorId;
    private String compServiceId;
    private long realmId;
    private String serviceName;
    private ServiceStatusCode statusCd = ServiceStatusCode.Active;
    private CalendarImpl startDate;
    private Money amount;


    public void setVersion(long version) {
        this.version = version;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public void setCompServiceId(String compServiceId) {
        this.compServiceId = compServiceId;
    }

    public void setRealmId(long realmId) {
        this.realmId = realmId;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setStatusCd(ServiceStatusCode statusCd) {
        this.statusCd = statusCd;
    }

    public long getVersion() {
        return version;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public String getCompServiceId() {
        return compServiceId;
    }

    public long getRealmId() {
        return realmId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public ServiceStatusCode getStatusCd() {
        return statusCd;
    }

    private Company mCompany = null;

    public void setCompany(Company pCompany)
    {
    	mCompany = pCompany;
    }

    public Company getCompany()
    {
    	return mCompany;
    }

    //
    // Service
    //
    private Service mService = null;

    public void setService(Service pService)
    {
    	mService = pService;
    }

    public Service getService()
    {
    	return mService;
    }

    public static String Company(){
        return "";
    }

    public CalendarImpl getStartDate() {
        return startDate;
    }

    public void setStartDate(CalendarImpl serviceStartDate) {
        this.startDate = serviceStartDate;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }
}
