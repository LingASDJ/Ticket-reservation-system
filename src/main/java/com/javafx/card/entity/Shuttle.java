package com.javafx.card.entity;

import java.sql.Time;
import java.time.LocalDateTime;

/**
 * @author XGLins
 * @date 2023/4/4 22:06
 *
 * 班车-实体类
 *
 */
public class Shuttle {

    //班车id
    private int sId;

    //班车路线
    private String Route;

    //乘车日期
    private LocalDateTime bDate;

    //乘车时间
    private Time time;

    //总座位数
    private int sitRemainNumber;

    //剩余座位数
    private int remainingSeats;

    //票价
    private double ticketPrice;

    //无参构造
    public Shuttle() {
    }

    //有参构造
    public Shuttle(int sId, String route, LocalDateTime bDate, Time time, int sitRemainNumber, int remainingSeats, double ticketPrice) {
        this.sId = sId;
        Route = route;
        this.bDate = bDate;
        this.time = time;
        this.sitRemainNumber = sitRemainNumber;
        this.remainingSeats = remainingSeats;
        this.ticketPrice = ticketPrice;
    }

    //get 和 set 方法
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getRoute() {
        return Route;
    }

    public void setRoute(String route) {
        Route = route;
    }

    public LocalDateTime getbDate() {
        return bDate;
    }

    public void setbDate(LocalDateTime bDate) {
        this.bDate = bDate;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getSitRemainNumber() {
        return sitRemainNumber;
    }

    public void setSitRemainNumber(int sitRemainNumber) {
        this.sitRemainNumber = sitRemainNumber;
    }

    public int getRemainingSeats() {
        return remainingSeats;
    }

    public void setRemainingSeats(int remainingSeats) {
        this.remainingSeats = remainingSeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    //重写ToString方法
    @Override
    public String toString() {
        return "Shuttle{" +
                "sId=" + sId +
                ", Route='" + Route + '\'' +
                ", bDate=" + bDate +
                ", time=" + time +
                ", sitRemainNumber=" + sitRemainNumber +
                ", remainingSeats=" + remainingSeats +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
