//Purpose of this program is creating a level 4 of hook game.
//Melisa DÖNMEZ 150116030
//Ekin NOHUTÇU 150116067

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Arc;

public class Level4 extends Application {

// This method has a pane,circle,line and arc objects and mouse events for
// the actions.
public void start(Stage primaryStage) {

// Creating a pane object.
Pane pane = new Pane();

// We created the bottom circle and added to the pane.
Circle circle = new Circle(140, 260, 12);
circle.setStroke(Color.DIMGRAY);
circle.setFill(Color.DIMGRAY);
pane.getChildren().add(circle);

// We created the leftmost circle and added to the pane.
Circle circle2 = new Circle(80, 200, 12);
circle2.setStroke(Color.DIMGRAY);
circle2.setFill(Color.DIMGRAY);
pane.getChildren().add(circle2);

// We created the empty circle and added to the pane.
Circle circle3 = new Circle(140, 200, 12);
circle3.setStroke(Color.DIMGRAY);
circle3.setFill(Color.WHITE);
circle3.setStrokeWidth(2.2);
pane.getChildren().add(circle3);

// We created a horizontal thin line connected to the leftmost circle
// and added to the pane.
Line line = new Line(92, 200, 127, 200);
line.setStroke(Color.DIMGRAY);
pane.getChildren().add(line);

// We created a horizontal thin line after the empty circle which is
// connected to the
// leftmost circle and added to the pane.
Line line3 = new Line(153, 200, 250, 200);
line3.setStroke(Color.DIMGRAY);
pane.getChildren().add(line3);

// We created a vertical thin line after the empty circle which is
// connected to the
// bottom circle and added to the pane.
Line line4 = new Line(140, 102, 140, 188);
line4.setStroke(Color.DIMGRAY);
pane.getChildren().add(line4);

// We created a horizontal little thin line connected to the bottom
// circle and added to the pane.
Line line5 = new Line(140, 102, 147, 102);
line5.setStroke(Color.DIMGRAY);
pane.getChildren().add(line5);

// We created a vertical little thin line connected with the leftmost
// circle and added to the pane.
Line line6 = new Line(250, 200, 250, 193);
line6.setStroke(Color.DIMGRAY);
pane.getChildren().add(line6);

// We created a thin vertical line inside the empty circle and added to
// the pane.
Line line7 = new Line(140, 188, 140, 212);
line7.setStroke(Color.DIMGRAY);
pane.getChildren().add(line7);

// We created a vertical thin line connected to the bottom circle and
// added to the pane.
Line line8 = new Line(140, 213, 140, 248);
line8.setStroke(Color.DIMGRAY);
pane.getChildren().add(line8);

// We created a vertical little thick line connected with the bottom
// circle and added to the pane.
Line line9 = new Line(147, 96, 147, 108);
line9.setStrokeWidth(3.2);
line9.setStrokeLineCap(StrokeLineCap.ROUND);
line9.setStroke(Color.DIMGRAY);
pane.getChildren().add(line9);

// We created a horizontal long thick line connected to the bottom
// circle and added to the pane.
Line line10 = new Line(147, 102, 237.5, 102);
line10.setStrokeWidth(3.2);
line10.setStroke(Color.DIMGRAY);
pane.getChildren().add(line10);

// We created the topmost arc and added to the pane.
Arc arc = new Arc(250.5, 102, 12, 12, 0, 180);
arc.setStrokeWidth(3.2);
arc.setStroke(Color.DIMGRAY);
arc.setFill(null);
pane.getChildren().add(arc);

// We created a horizontal thick line connected to the topmost arc and
// added to the pane.
Line line11 = new Line(262.5, 102, 270, 102);
line11.setStrokeWidth(3.2);
line11.setStroke(Color.DIMGRAY);
pane.getChildren().add(line11);

// We created a horizontal little thick line connected to the leftmost
// circle and added to the pane.
Line line12 = new Line(244, 193, 256, 193);
line12.setStrokeWidth(3.2);
line12.setStrokeLineCap(StrokeLineCap.ROUND);
line12.setStroke(Color.DIMGRAY);
pane.getChildren().add(line12);

// We created a vertical thick line connected to the leftmost circle and
// added to the circle.
Line line13 = new Line(250.5, 193, 250.5, 100);
line13.setStrokeWidth(3.2);
line13.setStroke(Color.DIMGRAY);
pane.getChildren().add(line13);

// We created a scene with width = 400 and height = 400
Scene scene = new Scene(pane, 400, 400, Color.WHITE);
primaryStage.setTitle("Level4");
primaryStage.setScene(scene);
primaryStage.show();

// If the empty circle has clicked, event handler fire an event.
circle3.setOnMouseClicked(new EventHandler<MouseEvent>() {

public void handle(MouseEvent e) {

// Change position to line which in the empty circle
if (line7.getStartX() == 140 && line7.getStartY() == 188 && line7.getEndX() == 140
&& line7.getEndY() == 212) {

line7.setStartX(129);
line7.setStartY(200);
line7.setEndX(151);
line7.setEndY(200);

}

// Change position to line which in the empty circle.
else if (line7.getStartX() == 129 && line7.getStartY() == 200 && line7.getEndX() == 151
&& line7.getEndY() == 200) {

line7.setStartX(140);
line7.setStartY(188);
line7.setEndX(140);
line7.setEndY(212);

}

}

});

//// If the bottom circle has clicked, event handler fire an event.
circle.setOnMouseClicked(new EventHandler<MouseEvent>() {

public void handle(MouseEvent e) {

	//if the line in the empty circle is in the correct position and there is no collision start motion.
if (line7.getStartX() == 140 && line7.getStartY() == 188 && line7.getEndX() == 140
&& line7.getEndY() == 212 && (collision(line13, arc))) {

// Timeline for line9.
Timeline t1 = new Timeline(KeyFrame1(line9, 147, 84, 147, 120, 300), KeyFrame2(line9));
t1.play();
t1.setAutoReverse(true);

// Timeline for line10.
Timeline t2 = new Timeline(KeyFrame1(line10, 147, 102, 147, 102, 1300), KeyFrame2(line10));
t2.play();
t2.setAutoReverse(true);

// Timeline for arc.
Timeline t3 = new Timeline(KeyFrameArc2(arc, 135, 102, 1650), KeyFrameArc1(arc));
t3.play();
t3.setAutoReverse(true);

// Timeline for line11.
Timeline t4 = new Timeline(KeyFrame1(line11, 147, 102, 154.5, 102, 1650), KeyFrame2(line11));
t4.play();
t4.setAutoReverse(true);

// When t2 has finished, send these nodes to the delete arc
// method.
t2.setOnFinished(event -> DeleteArc(arc, line11, line9, line10, line4, line5, line8, line7, circle3,
circle, pane, primaryStage));

}

//if the line in the empty circle is in the correct position and there is no collision start motion.
else if (line7.getStartX() == 140 && line7.getStartY() == 188 && line7.getEndX() == 140 && line7.getEndY() == 212
&& (!collision(line13, arc))) {

circle3.setDisable(true);
circle2.setDisable(true);

// Timeline for line9.
Timeline t1 = new Timeline(KeyFrame1(line9, 147, 84, 147, 120, 300), KeyFrame2(line9));
t1.play();
t1.setAutoReverse(true);

// Timeline for line10.
Timeline t2 = new Timeline(KeyFrame1(line10, 147, 102, 229, 102, 300), KeyFrame2(line10));
t2.play();
t2.setAutoReverse(true);

// Timeline for arc.
Timeline t3 = new Timeline(KeyFrameArc2(arc, 242, 102, 300), KeyFrameArc1(arc));
t3.play();
t3.setAutoReverse(true);

// Timeline for line11.
Timeline t4 = new Timeline(KeyFrame1(line11, 254, 102, 261.5, 102, 300), KeyFrame2(line11));
t4.play();
t4.setAutoReverse(true);
t4.setOnFinished(event -> FadeForAll(pane, primaryStage));

}

}

});

// If the empty circle has clicked, event handler fire an event.
circle2.setOnMouseClicked(new EventHandler<MouseEvent>() {

public void handle(MouseEvent e) {

// if the line in the empty circle is in the correct position start motion.
if (line7.getStartX() == 129 && line7.getStartY() == 200 && line7.getEndX() == 151
&& line7.getEndY() == 200) {

// Timeline for line12.
Timeline t1 = new Timeline(KeyFrame1(line12, 230, 193, 270, 193, 300), KeyFrame2(line12));
t1.play();
t1.setAutoReverse(true);

// timeline for line13
Timeline t2 = new Timeline(KeyFrame1(line13, 250.5, 193, 250.5, 193, 1300), KeyFrame2(line13));
t2.play();
t2.setAutoReverse(true);
t2.setOnFinished(event -> DeleteLine(line12, line13, line, line3, line6, circle2));

}

}

});

}

// Main method.
public static void main(String[] args) {

launch(args);

}

// Whis method for delete line.
public boolean DeleteLine(Line line, Line line2, Line line3, Line line4, Line line5, Circle circle2) {

// Timeline for line.
Timeline t1 = new Timeline(KeyFrame1(line, 244, 193, 256, 193, 200), KeyFrame2(line));
t1.play();
t1.setAutoReverse(true);
t1.setOnFinished(event -> disappear(line, line2, line3, line4, line5, circle2));

return true;

}

// This method for disappear.
public boolean disappear(Line line, Line line2, Line line3, Line line4, Line line5, Circle circle2) {

// Fade transition for line
FadeTransition(line, 200);
// Fade transition for line2
FadeTransition(line2, 200);
// Fade transition for line3.
FadeTransition(line3, 200);
// Fade transition for line4
FadeTransition(line4, 200);
// Fade transition for line5.
FadeTransition(line5, 200);

// Keyframe for circle2.
KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0),
new KeyValue(circle2.centerXProperty(), circle2.getCenterX()),
new KeyValue(circle2.centerYProperty(), circle2.getCenterY()),
new KeyValue(circle2.radiusProperty(), circle2.getRadius()));
KeyFrame keyFrame2 = new KeyFrame(Duration.millis(200), new KeyValue(circle2.centerXProperty(), 80),
new KeyValue(circle2.centerYProperty(), 200), new KeyValue(circle2.radiusProperty(), 3));

// Timeline for circle2.
Timeline t1 = new Timeline(keyFrame1, keyFrame2);
t1.play();
t1.setOnFinished(event -> FadeTransition(circle2, 100));

return true;

}

// This method for shorten the code.
public KeyFrame KeyFrame1(Line line, double startX, double startY, double endX, double endY, double time) {

KeyFrame keyFrame2 = new KeyFrame(Duration.millis(time), new KeyValue(line.startXProperty(), startX),
new KeyValue(line.startYProperty(), startY), new KeyValue(line.endXProperty(), endX),
new KeyValue(line.endYProperty(), endY));

return keyFrame2;

}

// This method for shorten the code.
public KeyFrame KeyFrame2(Line line) {

KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0), new KeyValue(line.startXProperty(), line.getStartX()),
new KeyValue(line.startYProperty(), line.getStartY()),
new KeyValue(line.endXProperty(), line.getEndX()), new KeyValue(line.endYProperty(), line.getEndY()));

return keyFrame1;

}

// This method for shorten the code.
public KeyFrame KeyFrameArc1(Arc arc) {

KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0), new KeyValue(arc.centerXProperty(), arc.getCenterX()),
new KeyValue(arc.centerYProperty(), arc.getCenterY()),
new KeyValue(arc.radiusXProperty(), arc.getRadiusX()),
new KeyValue(arc.radiusYProperty(), arc.getRadiusY()));

return keyFrame1;

}

// This metho for shorten the code.
public KeyFrame KeyFrameArc2(Arc arc, double centerX, double centerY, double time) {
KeyFrame keyFrame1 = new KeyFrame(Duration.millis(time), new KeyValue(arc.centerXProperty(), centerX),
new KeyValue(arc.centerYProperty(), centerY), new KeyValue(arc.radiusXProperty(), 12),
new KeyValue(arc.radiusYProperty(), 12));

return keyFrame1;

}

// This method for shorten the code.
public void FadeTransition(Node node, double time) {

FadeTransition ft1 = new FadeTransition(Duration.millis(time), node);
ft1.setFromValue(1.0);
ft1.setToValue(0);
ft1.setCycleCount(0);
ft1.setAutoReverse(true);
ft1.play();

}

// This method for delete the arc.
public boolean DeleteArc(Arc arc, Line line, Line line2, Line line3, Line line4, Line line5, Line line6, Line line7,
Circle circle, Circle circle2, Pane pane, Stage stage) {

// Keyframe for arc.
KeyFrame keyFrame3 = new KeyFrame(Duration.millis(0), new KeyValue(arc.startAngleProperty(), 0),
new KeyValue(arc.lengthProperty(), 180));
KeyFrame keyFrame4 = new KeyFrame(Duration.millis(350), new KeyValue(arc.startAngleProperty(), 0),
new KeyValue(arc.lengthProperty(), 0));

// Timeline for arc.
Timeline t3 = new Timeline(keyFrame3, keyFrame4);
t3.play();
// When t3 has finshed, send the nodes to deleteline method.
t3.setOnFinished(
event -> DeleteLine(line, line2, line3, line4, line5, line6, line7, circle, circle2, pane, stage));

return true;

}

// This method for delete the line.
public boolean DeleteLine(Line line, Line line2, Line line3, Line line4, Line line5, Line line6, Line line7,
Circle circle, Circle circle2, Pane pane, Stage stage) {

// Timeline for line.
Timeline t1 = new Timeline(KeyFrame1(line, 147, 102, 147, 102, 200), KeyFrame2(line));
t1.play();
t1.setAutoReverse(true);

// Timeline for line2.
Timeline t2 = new Timeline(KeyFrame1(line2, 147, 96, 147, 108, 200), KeyFrame2(line2));
t2.setAutoReverse(true);
t1.setOnFinished(eent -> t2.play());
// When t2 has finished, send the nodes to the disappear method.
t2.setOnFinished(
event -> disappear(line, line2, line3, line4, line5, line6, line7, circle, circle2, pane, stage));

return true;

}

// This method for disappear.
public boolean disappear(Line line, Line line2, Line line3, Line line4, Line line5, Line line6, Line line7,
Circle circle, Circle circle2, Pane pane, Stage stage) {

// Fade transition for line.
FadeTransition(line, 200);
// Fade transition for line2.
FadeTransition(line2, 200);
// Fade transition for line3.
FadeTransition(line3, 200);
// Fade transition for line4.
FadeTransition(line4, 200);
// Fade Transition for line5.
FadeTransition(line5, 200);
// Fade transition for line6.
FadeTransition(line6, 200);
// Fade transition for line7.
FadeTransition(line7, 600);
// Fade transition for circle.
FadeTransition(circle, 600);

// Fade transition for circle2.
FadeTransition ft1 = new FadeTransition(Duration.millis(200), circle2);
ft1.setFromValue(1.0);
ft1.setToValue(0);
ft1.setCycleCount(0);
ft1.setAutoReverse(true);

// Keyframe for circle2.
KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0),
new KeyValue(circle2.centerXProperty(), circle2.getCenterX()),
new KeyValue(circle2.centerYProperty(), circle2.getCenterY()),
new KeyValue(circle2.radiusProperty(), circle2.getRadius()));

KeyFrame keyFrame2 = new KeyFrame(Duration.millis(200), new KeyValue(circle2.centerXProperty(), 140),
new KeyValue(circle2.centerYProperty(), 260), new KeyValue(circle2.radiusProperty(), 3));

// Timeline for circle2.
Timeline t1 = new Timeline(keyFrame1, keyFrame2);
t1.play();
t1.setOnFinished(event -> ft1.play());
ft1.setOnFinished(event -> getLevel5(stage, pane));

return true;

}

// This method checks is there any collision between arc and line.
public boolean collision(Line line, Arc arc) {

if (new Rectangle(line.getStartX() - 7, line.getEndY(), 8, 12).intersects(arc.getCenterX() + 1,
arc.getCenterY() - 2, 8, 12)) {

return false;

}

return true;

}

// This method for fade the pane and stage.
public boolean FadeForAll(Pane pane, Stage stage) {

FadeTransition ft7 = new FadeTransition(Duration.seconds(2), pane);
ft7.setFromValue(1.0);
ft7.setToValue(0);
ft7.setCycleCount(0);
ft7.setAutoReverse(true);
ft7.play();
ft7.setOnFinished(event -> start(stage));

return true;

}

// This method for start the next level automatically.
public void getLevel5(Stage primaryStage, Pane pane) {

Level5 L5 = new Level5();
L5.start(primaryStage);

}

}
