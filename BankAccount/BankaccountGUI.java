package BankAccount;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BankaccountGUI extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox global = new VBox();
		VBox tophbox = new VBox();
		VBox left = new VBox();
		VBox right = new VBox();
		HBox local = new HBox();
		tophbox.setPadding(new Insets(15, 12, 15, 12));
		tophbox.setSpacing(10);
		tophbox.setStyle("-fx-background-color: #336699;");
		Text title = new Text("Create a new Bankaccount!");
		title.setFont(Font.font("Verdana", 18));
		title.setFill(Color.WHITE);
		tophbox.getChildren().add(title);
		global.getChildren().addAll(tophbox, local);
		
		TextField customerName = new TextField();
		customerName.setPromptText("Type Value here (0 - 255)");
		TextField customerAddress = new TextField();
		customerAddress.setPromptText("Type Value here (0 - 255)");
		TextField accountType = new TextField();
		accountType.setPromptText("Type Value here (0 - 255)");
		TextField initialValue = new TextField();
		initialValue.setPromptText("Type Value here (0 - 255)");
		
		Text writeName = new Text("Write your Name");
		Text writeAddress = new Text("Write your Address");
		Text writeType = new Text("Name of the Bankaccount (f.e. Salary)");
		Text writeInitial = new Text("Initial Balance:");
		Text accountCreated = new Text("Your account has been created with ID: ");
		Text options = new Text("Further options");
		Text getAmount = new Text("Amount (CHF)");
		Text showAmount = new Text("New balance: ");
		
		Button create = new Button("Create Account");
		Button put = new Button("Put amount");
		Button withdraw = new Button("Withdraw amount");
		Button balance = new Button("Get Balance");

		Scene scene = new Scene(global, 600, 550);

		primaryStage.setScene(scene);
		primaryStage.show();
		
		create.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

			}
		});
		
		put.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

			}
		});
		
		withdraw.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

			}
		});
		
		balance.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

			}
		});
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
