module edu.farmingdale.csc325_module05lab {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens edu.farmingdale.csc325_module05lab to javafx.fxml;
    exports edu.farmingdale.csc325_module05lab;
}