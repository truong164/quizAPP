package com.dht.quizapp;

import com.ddt.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class PrimaryController {

    public void handleQuestionManagement(ActionEvent event) {
        Scene scene = new Scene(new FXMLLoader(App.class.getResource( "question.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Quiz App");
        stage.show(); 
    }
    
    public void handlePractice(ActionEvent event){
        MyAlert.getInstance().showMSG("Comming soon...");
    }
    
}
