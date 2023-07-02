module org.registromensualidad {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens mensualidad.control to javafx.fxml;
    exports mensualidad.control;
}
