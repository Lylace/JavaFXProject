package lylace.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class FXmain3 extends Application {

	@Override
	public void start(Stage pStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/lylace/view/FXmain3.fxml"));

		pStage.setTitle("JavaFX 로그인");
		pStage.getIcons().add(new Image("/lylace/icon/analytics.png"));
		pStage.setScene(new Scene(root, 640, 480));

		pStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
