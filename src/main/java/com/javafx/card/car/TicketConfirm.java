package com.javafx.card.car;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TicketConfirm extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        //获取预订系统的FXMLLoader
        FXMLLoader fxmlLoader = new FXMLLoader(UserLogin.class.getResource("TicketConfirm.fxml"));

        //定义预订系统的Scene类
        Scene scene = new Scene(fxmlLoader.load(), 390, 320);

        //定义用户标题
        stage.setTitle("预订系统");

        //禁止改变大小
        stage.setResizable(false);

        //定义界面
        stage.setScene(scene);

        //使这个JavaFX界面显示出来
        stage.show();
    }

    //Main入口
    public static void main(String[] args) {
        launch();
    }
}
