import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ImageTest extends Application {
    String[] images = {"asahi.png", "deck.png"};
    ImageView imageView = new ImageView(images[0]);
    Label label1 = new Label(images[0]);
    public void start(Stage stage) throws Exception {
        stage.setTitle("配列使って写真を変更する");
        stage.setWidth(1000);
        stage.setHeight(600);
        VBox root = new VBox();
        root.getChildren().addAll(label1, imageView);
        root.setOnMouseClicked(event -> imageChange());
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    void imageChange() {
        Image img2 = new Image(images[1]);
        imageView.setImage(img2);
        label1.setText(images[1]);
    }
}