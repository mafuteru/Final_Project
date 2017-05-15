/**
 * Created by lij7451 on 5/15/2017.
 */
import javafx.application.*;
import javafx.geometry.Rectangle2D;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.image.*;
import javafx.scene.paint.*;

public class ImageTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        int x = 450;
        int y = 450;

        Button button = new Button("Hello");
        Text text = new Text("hello");

        HBox hbox = new HBox();
        hbox.getChildren().addAll(button, text); // button will be left of text

        Image image = new Image("tree.jpg",x,y, false, false);
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        iv1.setPreserveRatio(true);
        iv1.setFitHeight(x);
        iv1.setFitWidth(y);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(iv1, hbox); // hbox with button and text on top of image view

        HBox root = new HBox();
        root.getChildren().add(stackPane);

        Scene scene = new Scene(root,x,y);
        stage.setTitle("Title");
        stage.setScene(scene);
        stage.show();

    }

}