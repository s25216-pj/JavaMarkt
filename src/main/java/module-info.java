module pl.pjatk.javamarkt {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.pjatk.javamarkt to javafx.fxml;
    exports pl.pjatk.javamarkt;
}