//Purpose of this program start the hook game.
//MELÝSA DÖNMEZ  150116030
//EKÝN NOHUTÇU  150116067
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Test extends Application {

public static void main(String[] args) {

launch(args);

}

@Override

public void start(Stage primaryStage) {

//We created a button object for start the game.
Button button = new Button("Start Game");

BorderPane pane = new BorderPane();
pane.setCenter(button);
button.setOnAction(event -> getLevel1(primaryStage));

//We created a scene.
Scene scene = new Scene(pane, 400, 400, Color.BEIGE);
primaryStage.setScene(scene);
primaryStage.show();

}

//This method for start the level 1 if click the start button.
public void getLevel1(Stage stage) {

Level1 L1 = new Level1();

L1.start(stage);

}

}
