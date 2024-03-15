package game.kargaj;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public static Scene scene;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;

    @FXML
    private Button btn3;
    @FXML
    private TextField input;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btn1.setOnAction(e -> btn1OnClick());
        btn2.setOnAction(e -> btn2OnClick());
        btn3.setOnAction(e -> btn3OnClick());

    }

    @FXML
    private void btn1OnClick() {
        System.out.println(input.getText());
    }

    @FXML
    private void btn3OnClick() {
        new Game();
    }

    @FXML
    private void btn2OnClick() {
        FXMLLoader fxmlLoader = null;
        try {
            fxmlLoader = new FXMLLoader(new File("./src/main/resources/game/kargaj/Fxml/newPgae.fxml").toURI().toURL());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        try {
             scene = new Scene(fxmlLoader.load(), 600, 600);
            HelloApplication.primaryStage.setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}