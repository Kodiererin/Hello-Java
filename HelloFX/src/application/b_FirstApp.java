package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class b_FirstApp extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
//		by default javaFX gives a stage
		Button b = new Button("Click Me");
		FlowPane fp = new FlowPane();
		fp.getChildren().add(b);
		Scene sc = new Scene(fp);
		stage.setScene(sc);
		
		stage.show();
	}
}
