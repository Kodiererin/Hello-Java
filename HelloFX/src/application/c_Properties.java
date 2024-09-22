package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class c_Properties extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Button b = new Button("Click _Me");
		b.setTextFill(Color.CHOCOLATE);
		b.setMnemonicParsing(true);
		FlowPane fp = new FlowPane(b);
		Tooltip tp = new Tooltip("Click On Button to save");
		b.setTooltip(tp);
//		b.setStyle("-fx-border-color:yellow ; -fx-background-color:red");		
//		setting on elevr listener
		Alert a = new Alert(AlertType.INFORMATION,"Button Is Clicked");
		b.setOnAction(e->a.show());
		
		Scene sc = new Scene(fp , 400 ,400);
		stage.setScene(sc);
		stage.show();
	}
	
}
