package com.javafx.card.car;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UserLoginColltroller {

    //账号文本框
    @FXML
    public TextField account;

    //账号合理性检查
    @FXML
    public boolean accountCheckSuccess = false;

    //密码合理性检查
    @FXML
    public boolean passwordCheckSuccess = false;

    //密码文本框
    @FXML
    public PasswordField password;

    //本地检查的Label
    @FXML
    private Label checkLogin;

    @FXML
    public void checkLogin() {
        //如果账户为Complexx,那么返回真,当它和密码返回真,登录成功。反之，失败

        //JavaFX 监听文本框
        account.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                accountCheckSuccess= newValue.equals("Complexx") || newValue.equals("YiLing") || newValue.equals("DarKing");
            }
        });

        //JavaFX 监听密码框
        passwordCheck();
    }

    //模拟登录 Local Login 本地登录
    public void loginSuccess(){
        if(accountCheckSuccess && passwordCheckSuccess){
            checkLogin.setText("登录成功，欢迎你"+account.getText());
        } else {
            checkLogin.setText("登录失败，密码或账户有误");
        }
    }

    @FXML
    //检测密码是否在库中
    public void passwordCheck(){
        //监听密码输入框
        password.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if(account.getText().equals("DarKing")) {
                    passwordCheckSuccess = newValue.equals("114514");
                } else if(account.getText().equals("YiLing")) {
                    passwordCheckSuccess = newValue.equals("magic123");
                } else if(account.getText().equals("Complexx")) {
                    passwordCheckSuccess = newValue.equals("ilikejava321");
                } else {
                    passwordCheckSuccess = false;
                }
            }
        });
    }
}
