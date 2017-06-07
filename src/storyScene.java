import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class storyScene extends basicScene{

    private Button cont;

    public storyScene(String picture, String txt){
        cont = new Button("Continue");
    }

    public Button getCont(){
        return cont;
    }

    public VBox getLayout(){
        StackPane layouta = new StackPane();
        layouta.setPadding(new Insets(20, 20, 20, 20));
        layouta.getChildren().add(getText());

        StackPane layoutb = new StackPane();
        layoutb.getChildren().add(getCont());

        VBox layout = new VBox();
        layout.getChildren().addAll(getImage(), layouta, layoutb);

        return layout;
    }

}