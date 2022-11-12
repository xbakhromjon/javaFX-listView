module uz.bakhromjon.javafxlistview {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafxlistview to javafx.fxml;
    exports uz.bakhromjon.javafxlistview;
}