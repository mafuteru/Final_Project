import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class Intro extends Application{

    Stage window;
    Scene scene1a, scene1b;

    public static void main (String[]args){
        launch(args);
    }

    public void start (Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Journey through Jilu");

        //Scene 1a
        Image black = new Image("Black.jpg");
        ImageView iv1a = new ImageView();
        iv1a.setImage(black);
        iv1a.setFitWidth(500);
        iv1a.setFitHeight(400);
        iv1a.setSmooth(true);
        iv1a.setCache(true);

        Text text1a = new Text("The last thing you remember feeling is...pain. Grief. Confusion. Rage. " +
                "\nAs you slowly open your eyes, fleeting images and emotions dance around your " +
                "\nmind before mockingly dissipating into thin air.");

        StackPane layout1ai = new StackPane();
        layout1ai.setPadding(new Insets(20, 20, 20, 20));
        layout1ai.getChildren().add(text1a);

        Button cont1 = new Button("Continue");
        cont1.setOnAction(e -> window.setScene(scene1b));

        StackPane layout1aii = new StackPane();
        layout1aii.getChildren().add(cont1);

        VBox layout1a = new VBox();
        layout1a.getChildren().addAll(iv1a, layout1ai, layout1aii);

        scene1a = new Scene(layout1a, 500, 600);

        //Scene1b
        Image peacefulForest = new Image("peacefulForest.jpg");
        ImageView iv1b = new ImageView(peacefulForest);
        iv1b.setFitWidth(500);
        iv1b.setFitHeight(400);
        iv1b.setSmooth(true);
        iv1b.setCache(true);

        Text text1b = new Text("Even though you are now awake, there is not much to see." +
                "\nAn expanse of green forest stretches for as far as your eyes can see. " +
                "\nYou only have one memory: a name. You think it is yours. " +
                "\nBut how can you be sure? All you know is that you are hungry, thirsty, and weak.");

        StackPane layout1bi = new StackPane();
        layout1bi.setPadding(new Insets(20, 20, 20, 20));
        layout1bi.getChildren().add(text1b);

        Button cont2 = new Button("Continue");

        StackPane layout1bii = new StackPane();
        layout1bii.getChildren().add(cont2);


        VBox layout1b = new VBox();
        layout1b.getChildren().addAll(iv1b, layout1bi, layout1bii);

        scene1b = new Scene(layout1b, 500, 600);

        window.setScene(scene1a);
        window.show();

    }
}