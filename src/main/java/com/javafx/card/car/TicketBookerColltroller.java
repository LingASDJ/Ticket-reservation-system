package com.javafx.card.car;

import com.javafx.card.entity.Random;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;

public class TicketBookerColltroller {

    //注册全部FXML组件
    @FXML
    public ChoiceBox checkStart;
    @FXML
    public ChoiceBox checkEnd;
    @FXML
    public ChoiceBox checkYears;
    @FXML
    public Text checkList;
    @FXML
    public ChoiceBox checkMons;
    @FXML
    public ChoiceBox checkDays;

    //查询车票
    public void setCheckList(){
       checkList.setText(checkStart.getValue() +"--->"+checkEnd.getValue()+"----"+checkYears.getValue()+"年--"+checkMons.getValue()+"月--"+checkDays.getValue()+"日");
    }

    //预订概率
    public void setOKList(){

        if(Random.Int(12) >= 6){
            checkList.setText("预订成功，请退出该界面");
        } else {
            checkList.setText("预订失败，请退出该界面");
        }

    }

    //重置方法
    public void setReload() {
        checkList.setText("表中无内容");
    }

}
