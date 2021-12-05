package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

public class Revenue implements Serializable {
    private double turnover;
    private String name;
    private Date time;
    public Revenue() {
    }

    public Revenue(double turnover, String name, Date time) {
        this.turnover = turnover;
        this.name = name;
        this.time = time;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Revenue{" +", name='" + name + '\''+
                "turnover=" + turnover +
                ", time=" + time +
                '}';
    }
}
