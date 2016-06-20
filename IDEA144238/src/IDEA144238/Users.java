package IDEA144238;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Olga Pavlova on 6/20/2016.
 */
@Entity
public class Users {
    private int id;
    private String username;
    private String password;
    private String mobile;
    private String email;
    private String address;
    private Double price;
    private byte enabled;
    private Timestamp lastLogin;
    private Timestamp registerTime;
    private String coords;
    private Byte gender;
    private String lastLoginIp;
    private Double addsPrice;
    private Integer totalDisplay;
    private Integer addWeight;
    private String detail;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USERNAME", nullable = false, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 500)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "MOBILE", nullable = true, length = 50)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 500)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "PRICE", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "ENABLED", nullable = false)
    public byte getEnabled() {
        return enabled;
    }

    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "LAST_LOGIN", nullable = true)
    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Basic
    @Column(name = "REGISTER_TIME", nullable = true)
    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    @Basic
    @Column(name = "COORDS", nullable = true, length = 500)
    public String getCoords() {
        return coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }

    @Basic
    @Column(name = "GENDER", nullable = true)
    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "LAST_LOGIN_IP", nullable = true, length = 45)
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    @Basic
    @Column(name = "ADDS_PRICE", nullable = true, precision = 0)
    public Double getAddsPrice() {
        return addsPrice;
    }

    public void setAddsPrice(Double addsPrice) {
        this.addsPrice = addsPrice;
    }

    @Basic
    @Column(name = "TOTAL_DISPLAY", nullable = true)
    public Integer getTotalDisplay() {
        return totalDisplay;
    }

    public void setTotalDisplay(Integer totalDisplay) {
        this.totalDisplay = totalDisplay;
    }

    @Basic
    @Column(name = "ADD_WEIGHT", nullable = true)
    public Integer getAddWeight() {
        return addWeight;
    }

    public void setAddWeight(Integer addWeight) {
        this.addWeight = addWeight;
    }

    @Basic
    @Column(name = "DETAIL", nullable = true, length = -1)
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (id != users.id) return false;
        if (enabled != users.enabled) return false;
        if (username != null ? !username.equals(users.username) : users.username != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;
        if (mobile != null ? !mobile.equals(users.mobile) : users.mobile != null) return false;
        if (email != null ? !email.equals(users.email) : users.email != null) return false;
        if (address != null ? !address.equals(users.address) : users.address != null) return false;
        if (price != null ? !price.equals(users.price) : users.price != null) return false;
        if (lastLogin != null ? !lastLogin.equals(users.lastLogin) : users.lastLogin != null) return false;
        if (registerTime != null ? !registerTime.equals(users.registerTime) : users.registerTime != null) return false;
        if (coords != null ? !coords.equals(users.coords) : users.coords != null) return false;
        if (gender != null ? !gender.equals(users.gender) : users.gender != null) return false;
        if (lastLoginIp != null ? !lastLoginIp.equals(users.lastLoginIp) : users.lastLoginIp != null) return false;
        if (addsPrice != null ? !addsPrice.equals(users.addsPrice) : users.addsPrice != null) return false;
        if (totalDisplay != null ? !totalDisplay.equals(users.totalDisplay) : users.totalDisplay != null) return false;
        if (addWeight != null ? !addWeight.equals(users.addWeight) : users.addWeight != null) return false;
        if (detail != null ? !detail.equals(users.detail) : users.detail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (int) enabled;
        result = 31 * result + (lastLogin != null ? lastLogin.hashCode() : 0);
        result = 31 * result + (registerTime != null ? registerTime.hashCode() : 0);
        result = 31 * result + (coords != null ? coords.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (lastLoginIp != null ? lastLoginIp.hashCode() : 0);
        result = 31 * result + (addsPrice != null ? addsPrice.hashCode() : 0);
        result = 31 * result + (totalDisplay != null ? totalDisplay.hashCode() : 0);
        result = 31 * result + (addWeight != null ? addWeight.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        return result;
    }
}
