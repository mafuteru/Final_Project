import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TextTest extends Application {

    Stage window;
    Scene scene1, scene2, scene3;
    Button button, male, female;

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
        male.setOnAction(e -> window.setScene(scene3));
        female.setOnAction(e -> window.setScene(scene3));

        VBox layout2 = new VBox(10);
        layout2.setPadding(new Insets(20, 20, 20, 20));
        layout2.getChildren().addAll(l,male,female);
        scene2 = new Scene(layout2, 300, 250);

        //Scene 3
        GridPane layout3 = new GridPane();
        scene3 = new Scene(layout3, 200, 200);

       //Start
        window.setScene(scene1);
        window.show();
    }


}


