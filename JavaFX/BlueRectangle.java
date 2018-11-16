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

public class BlueRectangle extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		final StackPane stack = new StackPane();
		Rectangle r1 = new Rectangle(100, 100, Color.RED);
		Circle c1 = new Circle(100, Color.YELLOW);
		Button b1 = new Button("Button1");
		b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				r1.setFill(Color.GREEN);
			}
		});
		
		final Scene scene = new Scene(stack, 400, 400);
		primaryStage.setTitle("Blue Rectangle");
		primaryStage.setScene(scene);
		stack.getChildren().addAll(c1, r1, b1);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
