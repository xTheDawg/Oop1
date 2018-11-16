package Basics;
import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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

public class CircleDrawer extends Application {
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
		Text title = new Text("This is the CircleDrawer");
		title.setFont(Font.font("Verdana", 18));
		title.setFill(Color.WHITE);
		tophbox.getChildren().add(title);
		border.setTop(tophbox);
		Random rnd = new Random();
		
		TextField Rtext = new TextField();
		Rtext.setPromptText("Type Value here (0 - 255)");
		TextField Btext = new TextField();
		Rtext.setPromptText("Type Value here (0 - 255)");
		TextField Gtext = new TextField();
		Rtext.setPromptText("Type Value here (0 - 255)");
		
		Button drawbutton = new Button("Draw");
		Button randombutton = new Button("Random");
		left.getChildren().add(Rtext);
		left.getChildren().add(Btext);
		left.getChildren().add(Gtext);
		left.getChildren().add(drawbutton);
		left.getChildren().add(randombutton);
		border.setLeft(left);
		Circle c1 = new Circle(120, Color.TRANSPARENT);
		flag.getChildren().addAll(c1);
		border.setCenter(flag);
		Scene scene = new Scene(border, 600, 550);

		primaryStage.setScene(scene);
		primaryStage.show();
		
		drawbutton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					int red = Integer.parseInt(Rtext.getText());
					int blue = Integer.parseInt(Btext.getText());
					int green = Integer.parseInt(Gtext.getText());
					if(red > 255 || red < 0 || blue > 255 || blue < 0 || green > 255 || green < 0) {
						System.err.println("Only Values between 0 and 255 are allowed!!");
						System.exit(1);
					}else {
						c1.setFill(Color.rgb(red, blue, green));
					}
				}catch(NumberFormatException e) {
					System.err.println("Invalid Input, only Integer Values are allowed! Error: " + e.getMessage());
					System.exit(1);
				}
			}
		});
		
		randombutton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int Rrand = rnd.nextInt(256);
				int Brand = rnd.nextInt(256);
				int Grand = rnd.nextInt(256);
				c1.setFill(Color.rgb(Rrand, Brand, Grand));
				Rtext.setText(String.valueOf(Rrand));
				Btext.setText(String.valueOf(Brand));
				Gtext.setText(String.valueOf(Grand));

			}
		});
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
