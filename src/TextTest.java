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
    Scene scene1, scene2;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("thenewboston");

        Label label1 = new Label("Please enter your name.");

        //Form
        TextField nameInput = new TextField();
        String name = nameInput.getText();

        button = new Button("Submit");
        button.setOnAction( e -> {
            window.setScene(scene2);
        } );

        //Layout
        VBox layout1 = new VBox(10);
        layout1.setPadding(new Insets(20, 20, 20, 20));
        layout1.getChildren().addAll(label1, nameInput, button);

        //Label label2 = new Label("Hello, "+nameInput.getText());
        Text text = new Text("Hello there "+name);

        VBox layout2 = new VBox(20);
        layout2.setPadding(new Insets(20, 20, 20, 20));
        layout2.getChildren().addAll(text);
        scene2 = new Scene(layout2, 200, 200);

        scene1 = new Scene(layout1, 300, 250);
        window.setScene(scene1);
        window.show();
    }


}