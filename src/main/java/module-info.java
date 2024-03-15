module game.kargaj {
    requires javafx.controls;
    requires javafx.fxml;

    opens game.kargaj to javafx.fxml;
    exports game.kargaj;
}