module com.dht.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.dht.quizapp to javafx.fxml;
    exports com.dht.quizapp;
}
