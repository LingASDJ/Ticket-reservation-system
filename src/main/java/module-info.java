module com.javafx.card.car {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.javafx.card.car to javafx.fxml;
    exports com.javafx.card.car;
}