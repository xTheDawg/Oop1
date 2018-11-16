package JavaFX;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Flagchanger extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane border = new BorderPane();
		HBox tophbox = new HBox();
		tophbox.setPadding(new Insets(15, 12, 15, 12));
		tophbox.setSpacing(10);
		tophbox.setStyle("-fx-background-color: #336699;");
		VBox left = new VBox();
		left.setPadding(new Insets(10));
		left.setSpacing(8);
		StackPane flag = new StackPane();
		Text title = new Text("Flags with Layout Panes");
		title.setFont(Font.font("Verdana", 18));
		title.setFill(Color.WHITE);
		tophbox.getChildren().add(title);
		border.setTop(tophbox);
		Button flagbutton = new Button("Switzerland");
		Button flagbuttonJP = new Button("Japan");
		left.getChildren().add(flagbutton);
		left.getChildren().add(flagbuttonJP);
		border.setLeft(left);
		Rectangle r1 = new Rectangle(200, 200, Color.RED);
		Rectangle r2 = new Rectangle(120, 36, Color.WHITE);
		Rectangle r3 = new Rectangle(36, 120, Color.WHITE);
		Circle c1 = new Circle(50, Color.TRANSPARENT);
		flag.getChildren().addAll(r1, r2, r3, c1);
		border.setCenter(flag);
		Scene scene = new Scene(border, 600, 550);
		//Duration duration = new Duration(100);
		Tooltip tooltip = new Tooltip("This changes the Flag to the Swiss Flag!");
		//tooltip.setShowDelay(duration);
		flagbutton.setTooltip(tooltip);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		flagbutton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				r1.setWidth(200);
				r1.setHeight(200);
				r1.setFill(Color.RED);
				r2.setWidth(120);
				r2.setHeight(36);
				r2.setFill(Color.WHITE);
				r3.setFill(Color.WHITE);
				c1.setFill(Color.TRANSPARENT);
			}
		});
		
		flagbuttonJP.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				r1.setWidth(300);
				r1.setHeight(200);
				r1.setFill(Color.BLACK);
				r2.setWidth(299);
				r2.setHeight(199);
				r2.setFill(Color.WHITE);
				r3.setFill(Color.TRANSPARENT);
				c1.setFill(Color.RED);
			}
		});
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}