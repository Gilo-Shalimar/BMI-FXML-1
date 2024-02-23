import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class App extends Application {
    

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage stage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/VIEW/CALCULATOR.fxml"));
            stage.setTitle("BMI");
            stage.setResizable(false);
            Scene scene = new Scene(root);
            stage.getIcons().add(new Image(App.class.getResourceAsStream("/PICTURES/CALCULATOR/LOGO (2).png")));
            stage.setScene(scene);
            stage.setFullScreen(true);
            stage.setWidth(1920);
            stage.setHeight(1080); 
            stage.initStyle(StageStyle.UNDECORATED);

            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}