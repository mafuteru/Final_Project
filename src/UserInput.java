import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;




public class UserInput extends Application implements EventHandler<ActionEvent> {

    Stage window;
    Scene scene;
    Button button;
    TextField nameInput;
    Label label;

    public static void main(String[] args) {
        launch (args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("User Input Test");

        nameInput = new TextField();
        button = new Button("Enter");
        button.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event) {
                label = new Label(nameInput.getText());
            }
        });

        VBox layout = new VBox();
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    public void handle(ActionEvent event) {
        if(event.getSource()== button) {
            System.out.println(nameInput.getText());
        }
    }
}