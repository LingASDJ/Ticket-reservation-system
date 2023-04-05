package com.javafx.card.entity;

/**
 * @author XGLins
 * @date 2023/4/4 22:20
 */
public class Ticket {

    //车票id
    private int cId;

    //用户
    private User user;

    //班车
    private Shuttle shuttle;

    //乘车状态
    /**
     * 0-正常乘车，1-乘车异常
     * */
    private String delFlag;

    //无参构造
    public Ticket(int cId) {
        this.cId = cId;
    }

    //有参构造
    public Ticket(int cId, User user, Shuttle shuttle, String delFlag) {
        this.cId = cId;
        this.user = user;
        this.shuttle = shuttle;
        this.delFlag = delFlag;
    }

    //get 和 set 方法

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Shuttle getShuttle() {
        return shuttle;
    }

    public void setShuttle(Shuttle shuttle) {
        this.shuttle = shuttle;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    //重写ToString方法
    @Override
    public String toString() {
        return "Ticket{" +
                "cId=" + cId +
                ", user=" + user +
                ", shuttle=" + shuttle +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
