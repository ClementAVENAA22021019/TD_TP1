module test.td_tp1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens test.td_tp1 to javafx.fxml;
    exports test.td_tp1;
}