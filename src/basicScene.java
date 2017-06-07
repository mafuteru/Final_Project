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

public abstract class basicScene {

    private Stage window;
    private Image image;
    private ImageView iv;
    private Text text;

    public basicScene(){
    }

    public basicScene(String picture, String txt){
        image = new Image(picture);
        text = new Text(txt);
    }

    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Journey through Jilu");
    }

    public void setImage (){
        iv = new ImageView();
        iv.setImage(image);
        iv.setFitWidth(500);
        iv.setFitHeight(400);
        iv.setSmooth(true);
        iv.setCache(true);
    }

    public ImageView getImage(){
        return iv;
    }

    public Text getText(){
        return text;
    }

    public abstract VBox getLayout ();

}