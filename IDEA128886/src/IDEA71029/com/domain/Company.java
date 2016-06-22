package IDEA71029.com.domain;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: ihannur
 * Date: 12/8/10
 * Time: 2:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Company  {
    private String companyId;
    private long version;
    private String creatorId;
    private String modifierId;
    private long realmId;
    private String phone;
    private String dbaName;
    private String fedTaxId;
    private String legalName;
    private String sourceCompanyId;


    public Company(){
    }

    public String getCompanyId() {
        return companyId;
    }

    public long getVersion() {
        return version;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public String getModifierId() {
        return modifierId;
    }

    public long getRealmId() {
        return realmId;
    }

    public String getPhone() {
        return phone;
    }

    public String getDbaName() {
        return dbaName;
    }

    public String getFedTaxId() {
        return fedTaxId;
    }

    public String getLegalName() {
        return legalName;
    }

    public String getSourceCompanyId() {
        return sourceCompanyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public void setRealmId(long realmId) {
        this.realmId = realmId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDbaName(String dbaName) {
        this.dbaName = dbaName;
    }

    public void setFedTaxId(String fedTaxId) {
        this.fedTaxId = fedTaxId;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public void setSourceCompanyId(String sourceCompanyId) {
        this.sourceCompanyId = sourceCompanyId;
    }


}
