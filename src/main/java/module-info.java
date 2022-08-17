module uv.ejercicio1_equipod {
    requires javafx.controls;
    requires javafx.fxml;


    opens uv.ejercicio1_equipod to javafx.fxml;
    exports uv.ejercicio1_equipod;
}