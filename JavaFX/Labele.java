package JavaFX;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Labele extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FileInputStream input = new FileInputStream("penguin.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		imageView.setFitWidth(60);
		imageView.setPreserveRatio(true);

		Label label1 = new Label("This is a text", imageView);
		Font font = new Font("Papyrus", 30);
		label1.setFont(font);
		label1.setTextFill(Color.CORNFLOWERBLUE);
	
		
		Scene scene = new Scene(label1, 400, 200);
		primaryStage.setTitle("Label");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}