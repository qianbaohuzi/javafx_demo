module com.liam.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.liam.javafx to javafx.fxml;
    exports com.liam.javafx;
}