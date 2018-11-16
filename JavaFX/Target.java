package JavaFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Target extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		final StackPane stack = new StackPane();
		Circle c1 = new Circle(120, Color.AQUAMARINE);
		Circle c2 = new Circle(100, Color.ALICEBLUE);
		Circle c3 = new Circle(80, Color.BLANCHEDALMOND);
		Circle c4 = new Circle(60, Color.BURLYWOOD);
		Circle c5 = new Circle(40, Color.DARKSLATEGRAY);
		
		final Scene scene = new Scene(stack, 400, 400);
		primaryStage.setTitle("Flag");
		primaryStage.setScene(scene);
		stack.getChildren().addAll(c1, c2, c3, c4, c5);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}