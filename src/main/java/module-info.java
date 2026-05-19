module com.example.class_19th {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.class_19th to javafx.fxml;
    exports com.example.class_19th;
}