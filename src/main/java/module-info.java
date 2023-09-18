module com.example.datastructure {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires lombok;

    opens com.example.datastructure to javafx.fxml;
    exports com.example.datastructure;
    exports com.example.datastructure.drawboard;
    opens com.example.datastructure.drawboard to javafx.fxml;
}