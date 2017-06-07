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

import java.util.ArrayList;

public class MethodTest extends Application{

    Stage window;
    Scene scene;
    int i = 0;
    ArrayList<Image> images;
    ArrayList<Text> text;
    ArrayList<String> life;
    ArrayList<String> death;

    public static void main (String[]args){
        launch(args);
    }

    public void start (Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Journey through Jilu");

        Image black = new Image("Black.jpg");
        Image peacefulForest = new Image("peacefulForest.jpg");
        Image peacefulForest1 = new Image("peacefulForest.jpg");
        Image peacefulForest2 = new Image("peacefulForest.jpg");

        Text text1a = new Text("The last thing you remember feeling is...pain. Grief. Confusion. Rage. " +
                "\nAs you slowly open your eyes, fleeting images and emotions dance around your " +
                "\nmind before mockingly dissipating into thin air.");
        Text text1b = new Text("Even though you are now awake, there is not much to see." +
                "\nAn expanse of green forest stretches for as far as your eyes can see. " +
                "\nYou only have one memory: a name. You think it is yours. " +
                "\nBut how can you be sure? All you know is that you are hungry, thirsty, and weak.");
        Text text1c = new Text("You survey your surroundings, moving your fingers one by one, " +
                "\nas if they belong to a stranger. Cautiously, you push yourself up into a sitting position, " +
                "\nbrushing dirt off of your clothing. Your head spins. There is no one in sight. " +
                "\nThe forest is eerily quiet. ");
        Text text1d = new Text("You decide that, seeing as there is no foreseeable help in sight, " +
                "\nyou may as well search for something--food, shelter, help, anything--before you die " +
                "\nhere in the woods. You get up and begin walking, determinedly gritting your teeth " +
                "\nagainst the sharp pains in your head and limbs.");

        images = new ArrayList<>();
        images.add(black);
        images.add(peacefulForest);
        images.add(peacefulForest1);
        images.add(peacefulForest2);

        text = new ArrayList<>();
        text.add(text1a);
        text.add(text1b);
        text.add(text1c);
        text.add(text1d);

        life = new ArrayList<>();
        life.add(null);

        window.setScene(newStoryScene(images.get(i), text.get(i)));
        window.show();

    }

    public Scene newStoryScene (Image img, Text txt){
        i++;

        ImageView iv = new ImageView();
        iv.setImage(img);
        iv.setFitWidth(500);
        iv.setFitHeight(400);
        iv.setSmooth(true);
        iv.setCache(true);

        Button cont = new Button("Continue");
        cont.setOnAction(e -> {
            if (i < images.size())
                window.setScene(newStoryScene(images.get(i), text.get(i)));
        });

        StackPane layouta = new StackPane();
        layouta.setPadding(new Insets(20, 20, 20, 20));
        layouta.getChildren().add(txt);

        StackPane layoutb = new StackPane();
        layoutb.getChildren().add(cont);

        VBox layout = new VBox();
        layout.getChildren().addAll(iv, layouta, layoutb);

        scene = new Scene(layout, 500, 550);
        return scene;
    }

    public Scene newStoryScene(Image img, Text txt, String b1, String b2){

        ImageView iv = new ImageView();
        iv.setImage(img);
        iv.setFitWidth(500);
        iv.setFitHeight(400);
        iv.setSmooth(true);
        iv.setCache(true);

        Button button1 = new Button(b1);
        button1.setOnAction(e -> {
            if (i < images.size()) {
                i++;
                window.setScene(newStoryScene(images.get(i), text.get(i)));
            }
        });

        Button button2 = new Button(b2);
        button2.setOnAction(e -> {
           if (i < images.size())
               i+=2;
               window.setScene(newEndScene(images.get(i), text.get(i)));
        });

        StackPane layouta = new StackPane();
        layouta.setPadding(new Insets(20, 20, 20, 20));
        layouta.getChildren().add(txt);

        HBox layoutbi = new HBox();
        layoutbi.setSpacing(10);
        layoutbi.getChildren().addAll(button1, button2);

        StackPane layoutb = new StackPane();
        layoutb.getChildren().add(layoutbi);

        VBox layout = new VBox();
        layout.getChildren().addAll(iv, layouta, layoutb);

        scene = new Scene(layout, 500, 550);
        return scene;
    }

    public Scene newEndScene(Image img, Text txt){
        return scene;
    }
}