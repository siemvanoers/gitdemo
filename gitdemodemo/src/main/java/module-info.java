module com.example.gitdemodemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitdemodemo to javafx.fxml;
    exports com.example.gitdemodemo;
}