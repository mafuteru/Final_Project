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

public class sceneTester extends Application{

    Stage window;

    public static void main(String[]args){ launch(args);}

    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Journey through Jilu");

        storyScene buildIntroa1 = new storyScene("Black.jpg", "The last thing you remember feeling is...pain. Grief. Confusion. Rage. " +
                "\nAs you slowly open your eyes, fleeting images and emotions dance around your " +
                "\nmind before mockingly dissipating into thin air.");

        Scene introa1 = new Scene(buildIntroa1.getLayout(), 500, 550);

        window.setScene(introa1);
        window.show();
    }
}
