import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class actionScene extends basicScene{

    private Button button1, button2;

    public actionScene(String picture, String txt, String b1, String b2){
        button1 = new Button(b1);
        button2 = new Button(b2);
    }

    public Button getButton1(){
        return button1;
    }

    public Button getButton2(){
        return button2;
    }

    public VBox getLayout(){
        StackPane layouta = new StackPane();
        layouta.setPadding(new Insets(20, 20, 20, 20));
        layouta.getChildren().add(getText());

        HBox layoutbi = new HBox();
        layoutbi.setSpacing(10);
        layoutbi.getChildren().addAll(getButton1(), getButton2());

        StackPane layoutb = new StackPane();
        layoutb.getChildren().add(layoutbi);

        VBox layout = new VBox();
        layout.getChildren().addAll(getImage(), layouta, layoutb);

        return layout;
    }

}