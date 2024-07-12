module com.oop.project.mindunits {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.oop.project.mindunits to javafx.fxml;
    exports com.oop.project.mindunits;
}