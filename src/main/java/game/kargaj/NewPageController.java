package game.kargaj;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class NewPageController implements Initializable {
    @FXML
    private Button pause;
    @FXML
    private Button play;
    @FXML
    private Label label;

    @FXML
    private Label labelPlay;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        label.setText("0");
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public void play() {
        labelPlay.setText("play");
        timeline.play();
    }

    public void pause() {
        labelPlay.setText("pause");
        timeline.pause();
    }

    private Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
        label.setText(String.valueOf(Integer.parseInt(label.getText()) + 1));
        play.setOnAction(e -> play());
        pause.setOnAction(e -> pause());
    }));




}
