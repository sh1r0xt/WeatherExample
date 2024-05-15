module com.example.weatherexample {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;


    opens com.example.weatherexample to javafx.fxml;
    exports com.example.weatherexample;
}