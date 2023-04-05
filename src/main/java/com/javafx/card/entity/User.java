package com.javafx.card.entity;

/**
 * @author XGLins
 * @date 2023/4/4 22:02
 *
 * 用户-实体类
 *
 */
public class User {

    //用户id
    private String uId;

    //用户名（学号）
    private int stuId;

    //姓名
    private String name;

    //密码
    private String password;

    //无参构造
    public User() {
    }

    //有参构造
    public User(String uId, int stuId, String name, String password) {
        this.uId = uId;
        this.stuId = stuId;
        this.name = name;
        this.password = password;
    }

    //get 和 set 方法
    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //重写ToString方法
    @Override
    public String toString() {
        return "User{" +
                "id='" + uId + '\'' +
                ", stuId='" + stuId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
