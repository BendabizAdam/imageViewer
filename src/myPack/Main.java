package myPack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    static Image mystaticimg;
    static Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setTitle("imageViewer");
        primaryStage.setScene(new Scene(root));
        stage=primaryStage;
        primaryStage.getIcons().add(new Image((Main.class.getResourceAsStream("img/picture-frame.png"))));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
