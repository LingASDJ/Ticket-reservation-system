package com.javafx.card.car;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TicketBooker extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        //获取车票预订系统的FXMLLoader
        FXMLLoader fxmlLoader = new FXMLLoader(TicketBooker.class.getResource("TicketBooker.fxml"));

        //定义车票预订系统的Scene类
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        //定义车票预订系统的标题
        stage.setTitle("车票预订系统");

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

