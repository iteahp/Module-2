package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Computer implements Serializable {
    private int id;
    private String name;
    private boolean status;
    private Date startTime;
    private Date endTime;
   private double date ;
    private double moneyOnHour;
  private  double money ;
  private List<Order> order;

    public Computer(int id,String name) {
        this.id = id;
        this.name = name;
    }
    public double getMoneyOnHour() {
        return moneyOnHour;
    }

    public void setMoneyOnHour(double moneyOnHour) {
        this.moneyOnHour = moneyOnHour;
    }

    public Computer() {
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

    public Computer(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +", order = "+order+
                '}';
    }
}
