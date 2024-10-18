module com.example.agechecker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.agechecker to javafx.fxml;
    exports com.example.agechecker;
}