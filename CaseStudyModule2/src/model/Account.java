package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Account implements Serializable {
    private String account;
    private String password;
    private List<Order> order;
    private float money;
    private boolean isStatus;
    private Date startTime;
    private Date endTime;
    private double playTime;
    private double moneyOnHour;

    public Account() {
    }

    public Account(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public boolean isStatus() {
        return isStatus;
    }

    public void setStatus(boolean status) {
        isStatus = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public double getPlayTime() {
        return playTime;
    }

    public void setPlayTime(double playTime) {
        this.playTime = playTime;
    }

    public double getMoneyOnHour() {
        return moneyOnHour;
    }

    public void setMoneyOnHour(double moneyOnHour) {
        this.moneyOnHour = moneyOnHour;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", order=" + order +
                ", money=" + money +
                '}';
    }
}
