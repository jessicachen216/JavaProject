import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.Slider;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebBrowser extends Application 
{
  public static void main(String[] args) {
	  launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
	  primaryStage.setTitle("java-buddy.blogspot.com");
	
	  WebView myBrowser = new WebView();
	  WebEngine myWebEngine = myBrowser.getEngine();
	  myWebEngine.load("http://java-buddy.blogspot.com/");
	
	  StackPane root = new StackPane();
	  root.getChildren().add(myBrowser);
	  primaryStage.setScene(new Scene(root, 640, 480));
	  primaryStage.show();
  }
}
