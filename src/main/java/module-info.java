module com.example.cali {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cali to javafx.fxml;
    exports com.example.cali;
}