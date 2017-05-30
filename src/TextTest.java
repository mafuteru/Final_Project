import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TextTest extends Application {

    Stage window;
    Scene scene1, scene2, scene3m, scene3f;
    Button button, male, female, startm, startf;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Journey Through Jilu");

        Label label1 = new Label("Please enter your name.");

        //Form
        final TextField nameInput = new TextField();
        //String name = nameInput.getText();
        nameInput.setPromptText("Enter character name");
        nameInput.getText();

        final Label l = new Label();

        button = new Button("Submit");
        button.setOnAction( e -> {
            l.setText("What is your gender, "+nameInput.getText()+"?");
            window.setScene(scene2);
        } );

        //Scene 1
        VBox layout1 = new VBox(10);
        layout1.setPadding(new Insets(20, 20, 20, 20));
        layout1.getChildren().addAll(label1, nameInput, button);
        scene1 = new Scene(layout1, 300, 250);

        //Scene 2
        male = new Button("Male");
        female = new Button("Female");
        male.setOnAction(e -> window.setScene(scene3m));
        female.setOnAction(e -> window.setScene(scene3f));

        VBox layout2 = new VBox(10);
        layout2.setPadding(new Insets(20, 20, 20, 20));
        layout2.getChildren().addAll(l,male,female);
        scene2 = new Scene(layout2, 300, 250);

        //Scene 3m
       Label label3m = new Label("Male. This is you.");
        VBox layout3m = new VBox();
        layout3m.setPadding(new Insets(20, 20, 20, 20));
        Image imageP = new Image("Pent.png",300,370, false, false);
        ImageView pent = new ImageView();
        pent.setImage(imageP);
        pent.setPreserveRatio(true);
        pent.setFitHeight(300);
        pent.setFitWidth(370);

        startm = new Button("Continue");
        startm.setOnAction(e -> window.setScene(scene2));
        layout3m.getChildren().addAll(label3m,pent,startm);
        scene3m = new Scene(layout3m, 300, 400);

        //Scene 3f
        Label label3f = new Label("Female. This is you.");
        VBox layout3f = new VBox();
        layout3f.setPadding(new Insets(20, 20, 20, 20));
        Image imageJ = new Image("Julia.png",300,370, false, false);
        ImageView julia = new ImageView();
        julia.setImage(imageJ);
        julia.setPreserveRatio(true);
        julia.setFitHeight(300);
        julia.setFitWidth(370);

        startf = new Button("Continue");
        startf.setOnAction(e -> window.setScene(scene2));
        layout3f.getChildren().addAll(label3f,julia,startf);
        scene3f = new Scene(layout3f, 300, 400);

       //Start
        window.setScene(scene1);
        window.show();
    }


}


