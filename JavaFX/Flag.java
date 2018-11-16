package JavaFX;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Flag extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		final StackPane stack = new StackPane();
		Rectangle r1 = new Rectangle(400, 400, Color.RED);
		Rectangle r2 = new Rectangle(200, 75, Color.WHITE);
		Rectangle r3 = new Rectangle(75, 200, Color.WHITE);
		//Circle c1 = new Circle(60, Color.RED);
		
		final Scene scene = new Scene(stack, 400, 400);
		primaryStage.setTitle("Flag");
		primaryStage.setScene(scene);
		stack.getChildren().addAll(r1, r2, r3);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
