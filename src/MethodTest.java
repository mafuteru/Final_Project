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
        Image bear = new Image("bear.jpg");
        Image bear1 = new Image("bear.jpg");
        Image falcon = new Image("falcon.jpg");


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
        Text text2a = new Text("RAWR! As you are walking, a bear appears in front of you, without warning" +
                "\nand seemingly out of nowhere. It is your first obstacle. Armed with nothing but your " +
                "\nwits and your body, what will you do?");
        Text text2aii = new Text("You have nothing to fight with. Your puny limbs are no match for his " +
                "\nclaws and bulk. Did you really think you could win? The bear brings you in for a " +
                "\nchokehold, and as your vision blurs, you feel your arms sprout feathers. What could " +
                "\nthis possibly mean? Alas, you will never know. You die in the woods, painfully, " +
                "\nat the hands of a brute animal.");
        Text text2b = new Text("As you run, you turn your head back for a second, only to see the " +
                "\nbear gaining scarily fast on you. You taste blood as your lungs struggle to " +
                "\nmaintain your incredible pace. In fact, you are moving so fast, it almost makes you " +
                "\nwonder how you are managing to keep this pace up. When you look at your arms, you " +
                "\nare so startled you squawk in surprise");
        Text text2c = new Text("Instead of arms, you have miraculously sprouted dark brown wings, " +
                "\nsimilar to those of a fierce bird of prey, and have subconsciously been flapping " +
                "\nfuriously along. Still, the bear is somehow keeping up with your pace. Do you...");
        Text text2cii = new Text("You continue to run, managing to keep ahead of the bear for a few " +
                "\nmore minutes, but eventually it catches up to you. The last thing you hear are " +
                "\nyour startlingly animalistic shrieks of pain and despair.");
        Text text2ci = new Text("You don’t know how, but somehow your magic works! You have " +
                "\nbecome a falcon, and you focus on zooming ahead of the bear. After what " +
                "\nseems like hours of pursuit, the bear finally tires, and you collapse to " +
                "\nthe mossy forest floor, fainting dead away, body and spirit drained from " +
                "\nthe advanced sorcery you just performed.");


        images = new ArrayList<>();
        images.add(black);
        images.add(peacefulForest);
        images.add(peacefulForest1);
        images.add(peacefulForest2);
        images.add(bear);
        images.add(black);
        images.add(bear1);
        images.add(falcon);
        images.add(black);
        images.add(falcon);

        text = new ArrayList<>();
        text.add(text1a);
        text.add(text1b);
        text.add(text1c);
        text.add(text1d);
        text.add(text2a);
        text.add(text2aii);
        text.add(text2b);
        text.add(text2c);
        text.add(text2cii);
        text.add(text2ci);

        life = new ArrayList<>();
        life.add("");
        life.add("");
        life.add("");
        life.add("");
        life.add("Run");
        life.add("");
        life.add("");
        life.add("Try to focus hard and transform your" +
                "\nentire body into a light, fast bird?");
        life.add("");
        life.add("");

        death = new ArrayList<>();
        death.add("");
        death.add("");
        death.add("");
        death.add("");
        death.add("Stay and fight");
        death.add("Game over");
        death.add("");
        death.add("Continue running with a human " +
                "\nbody and bird (?????!) arms?");
        death.add("Game over");
        death.add("");

        window.setScene(newStoryScene(images.get(i), text.get(i), life.get(i), death.get(i)));
        window.show();

    }

   /* public Scene newStoryScene (Image img, Text txt){
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
    }*/

    public Scene newStoryScene(Image img, Text txt, String b1, String b2){

        ImageView iv = new ImageView();
        iv.setImage(img);
        iv.setFitWidth(500);
        iv.setFitHeight(400);
        iv.setSmooth(true);
        iv.setCache(true);

        if (b1.equals("") && b2.equals("")){
            Button cont = new Button("Continue");
            cont.setOnAction(e -> {
                if (i < images.size()) {
                    i++;
                    window.setScene(newStoryScene(images.get(i), text.get(i), life.get(i), death.get(i)));
                }
            });

            StackPane layouta = new StackPane();
            layouta.setPadding(new Insets(20, 20, 20, 20));
            layouta.getChildren().add(txt);

            StackPane layoutb = new StackPane();
            layoutb.getChildren().add(cont);

            VBox layout = new VBox();
            layout.getChildren().addAll(iv, layouta, layoutb);

            scene = new Scene(layout, 500, 570);
            return scene;
        }

        else if (b2.equals("Game over")){

            StackPane layout = new StackPane();
            layout.getChildren().add(txt);

            scene = new Scene(layout, 500, 570);
            return scene;
        }

        else {
            Button button1 = new Button(b1);
            button1.setOnAction(e -> {
                if (i < images.size()) {
                    i+=2;
                    window.setScene(newStoryScene(images.get(i), text.get(i), life.get(i), death.get(i)));
                }
            });

            Button button2 = new Button(b2);
            button2.setOnAction(e -> {
                if (i < images.size())
                    i++;
                    window.setScene(newStoryScene(images.get(i), text.get(i), life.get(i), death.get(i)));
            });

            StackPane layouta = new StackPane();
            layouta.setPadding(new Insets(20, 20, 20, 20));
            layouta.getChildren().add(txt);

            HBox layoutbi = new HBox();
            layoutbi.setSpacing(10);
            layoutbi.setPadding(new Insets(0, 20, 0, 20));
            layoutbi.getChildren().addAll(button1, button2);

            VBox layout = new VBox();
            layout.getChildren().addAll(iv, layouta, layoutbi);

            scene = new Scene(layout, 500, 570);
            return scene;
        }

    }
}