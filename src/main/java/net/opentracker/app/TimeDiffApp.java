package net.opentracker.app;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TimeDiffApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setResizable(false);
		final Scene scene = new Scene(new Group(), 600, 300);
		scene.setRoot(createContent());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public Parent createContent() {
		final TimeDiff timeDiff = new TimeDiff();
		return timeDiff;
	}

}
