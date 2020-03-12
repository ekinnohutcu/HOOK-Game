//Purpose of this program is creating a level 1 of hook game.

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

//Class of the level 1 and it extends application class.
public class Level1 extends Application {

//This method has a pane,circle,line and arc objects and mouse events for the actions.
public void start(Stage primaryStage) {

//We created a pane object.
Pane pane = new Pane();

//We created a circle object with color dimgray and added to the pane.
Circle circle = new Circle(290, 232, 12, Color.DIMGRAY);
circle.setFill(Color.DIMGRAY);
pane.getChildren().add(circle);

// We created another circle object with color dimgray and added to the pane.
Circle circle2 = new Circle(220, 267, 12, Color.DIMGRAY);
circle2.setFill(Color.DIMGRAY);
pane.getChildren().add(circle2);

// We crated a thick vertical long line under the half circle and added to the pane
Line line = new Line(220, 127, 220, 215);
line.setStroke(Color.DIMGRAY);
line.setStrokeWidth(3.2);
pane.getChildren().add(line);

// We created a thick horizontal long line under the half circle and added to the pane

Line line2 = new Line(90, 130, 208, 130);
line2.setStrokeWidth(3.2);
line2.setStroke(Color.DIMGRAY);
pane.getChildren().add(line2);

//We created a half circle and added to the pane.
Arc arc = new Arc(220, 130, 12, 12, 0, 180);
arc.setStrokeWidth(3.2);
arc.setStroke(Color.DIMGRAY);
arc.setFill(null);
pane.getChildren().add(arc);

//We created a small thick horizontal line above the circle on the left and added to the pane.
Line line3 = new Line(215, 217, 225, 217);
line3.setStroke(Color.DIMGRAY);
line3.setStrokeWidth(3.2);
line3.setStrokeLineCap(StrokeLineCap.ROUND);
pane.getChildren().add(line3);

//We created a thick vertical bar previous to the thick horizontal line before the half circle and added to the pane.
Line line4 = new Line(88, 125, 88, 135);
line4.setStrokeWidth(3.2);
line4.setStroke(Color.DIMGRAY);
line4.setStrokeLineCap(StrokeLineCap.ROUND);
pane.getChildren().add(line4);

//We created a thick horizontal line after half circle and added to the pane.
Line line5 = new Line(233, 130, 263, 130);
line5.setStroke(Color.DIMGRAY);
line5.setStrokeLineCap(StrokeLineCap.ROUND);
line5.setStrokeWidth(3.2);
pane.getChildren().add(line5);

//We created a thin vertical line above the circle on the left and added to the pane.
Line line6 = new Line(220, 218, 220, 255);
line6.setStroke(Color.DIMGRAY);
pane.getChildren().add(line6);

//We created a thin horizontal long line before the right circle and added to the pane.
Line line7 = new Line(80, 232, 280, 232);
line7.setStroke(Color.DIMGRAY);
pane.getChildren().add(line7);

//we created a  leftmost long vertical thin line and added to the pane.
Line line8 = new Line(80, 130, 80, 232);
line8.setStroke(Color.DIMGRAY);
pane.getChildren().add(line8);

//We  leftmost small horizontal thin line and added to the pane.
Line line9 = new Line(80, 130, 88, 130);
line9.setStroke(Color.DIMGRAY);
pane.getChildren().add(line9);

//We created a scene with the width = 400 and height = 400.
Scene scene = new Scene(pane, 400, 400, Color.WHITE);

//We gave a name of the stage
primaryStage.setTitle("Level1");
primaryStage.setScene(scene);
primaryStage.show();

//If the bottom circle has clicked, event handler fire the event.
circle2.setOnMouseClicked(new EventHandler<MouseEvent>() {

@Override

//This is an overridden method and it handles the event.
public void handle(MouseEvent e) {

//Timeline for line3. Keyframe lengthens the line3 in 200 milliseconds.
Timeline t1 = new Timeline(KeyFrame1(line3, 200, 217, 240, 217, 200), KeyFrame2(line3));
t1.play();
t1.setAutoReverse(true);

//Timeline for line. Keyframe shorten the line in 1200 milliseconds.
Timeline t2 = new Timeline(KeyFrame1(line, 220, 215, 220, 215, 1200), KeyFrame2(line));
t2.play();
t2.setAutoReverse(true);

//When the t2 is finshed, send the line,line3,circle and line6 to the disappear method.
t2.setOnFinished(event -> disappear(line, line3, circle2, line6));

}

});

//If the leftmost circle has clicked, event handler fire an event.
circle.setOnMouseClicked(new EventHandler<MouseEvent>() {

//This is an overridden method and it handles the event.
public void handle(MouseEvent e) {

//Timeline of line4. Keyframe lengthen the line4 in 200 milliseconds.
Timeline t1 = new Timeline(KeyFrame1(line4, 88, 110, 88, 150, 200), KeyFrame2(line4));
t1.play();
t1.setAutoReverse(true);

//Timeline for line2. Keyrame shorten the line2 in 1900 milliseconds.
Timeline t2 = new Timeline(KeyFrame1(line2, 88, 130, 88, 130, 1900), KeyFrame2(line2));
t2.play();
t2.setAutoReverse(true);
t2.setOnFinished(event -> deleteArc(arc));

//Timeline for line5. Keyframe shorten the line5 in 2330 milliseconds.
Timeline t3 = new Timeline(KeyFrame1(line5, 90, 130, 120, 130, 2330), KeyFrame2(line5));
t3.play();
t3.setAutoReverse(true);

//When t3 is finished, send the line2,line4,circle,arc,line5,line7,line8,line9,primarystage and pane to the deleteline method.
t3.setOnFinished(event -> deleteLine(line2, line4, circle, arc, line5, line7, line8, line9, primaryStage, pane));

//If there is no collision between line and arc, run this code.
if (!(collision(line, arc))) {

//Keyframe for the arc action in 2.33 seconds.
KeyFrame keyFrame7 = new KeyFrame(Duration.millis(0),
new KeyValue(arc.centerXProperty(), arc.getCenterX()),
new KeyValue(arc.centerYProperty(), arc.getCenterY()),
new KeyValue(arc.radiusXProperty(), arc.getRadiusX()),
new KeyValue(arc.radiusYProperty(), arc.getRadiusY()));

KeyFrame keyFrame8 = new KeyFrame(Duration.seconds(2.33), new KeyValue(arc.centerXProperty(), 75),
new KeyValue(arc.centerYProperty(), 130), new KeyValue(arc.radiusXProperty(), 12),
new KeyValue(arc.radiusYProperty(), 12));

//Timeline for arc.
Timeline t4 = new Timeline(keyFrame7, keyFrame8);
t4.play();
t4.setAutoReverse(true);

}

//If there is a collision between line and arc, run this code.
else {

//This is for if we click the other circle, leftmost circle cannot be able to click.
circle2.setDisable(true);
circle.setDisable(true);
//While collisiýn exist, this keyframe moves the arc to line.
KeyFrame keyFrame9 = new KeyFrame(Duration.millis(0),
new KeyValue(arc.centerXProperty(), arc.getCenterX()),
new KeyValue(arc.centerYProperty(), arc.getCenterY()),
new KeyValue(arc.radiusXProperty(), arc.getRadiusX()),
new KeyValue(arc.radiusYProperty(), arc.getRadiusY()));

KeyFrame keyFrame10 = new KeyFrame(Duration.millis(175), new KeyValue(arc.centerXProperty(), 211),
new KeyValue(arc.centerYProperty(), 130), new KeyValue(arc.radiusXProperty(), 12),
new KeyValue(arc.radiusYProperty(), 12));

//Timeline for the arcs.
Timeline t5 = new Timeline(keyFrame9, keyFrame10);
t5.play();

//When t5 has finished,send pane,t1,t2,t3 and primarystage to the FadeForAll methpd.
t5.setOnFinished(event -> FadeForAll(pane, t1, t2, t3, primaryStage));

}

}

});

}

//This method for disappear with for parameters.
public boolean disappear(Node node, Line node2, Circle node3, Node node4) {

//Fade for node.
FadeTransition(node, 200);

//Timeline for node2 to shorten the node2 and disappear it.
Timeline t1 = new Timeline(KeyFrame1(node2, 217, 217, 223, 217, 200), KeyFrame2(node2));
t1.play();
t1.setAutoReverse(true);
//Send the node2 to fade transition method.
t1.setOnFinished(event -> FadeTransition(node2, 100));

//Keyframe of circle to shrink.
KeyFrame keyFrame5 = new KeyFrame(Duration.millis(0), new KeyValue(node3.centerXProperty(),
node3.getCenterX()), new KeyValue(node3.centerYProperty(), node3.getCenterY()),
new KeyValue(node3.radiusProperty(), node3.getRadius()));

KeyFrame keyFrame6 = new KeyFrame(Duration.millis(200), new KeyValue(node3.centerXProperty(),
220), new KeyValue(node3.centerYProperty(), 267),
new KeyValue(node3.radiusProperty(),3));

//Timeline for the circle.
Timeline t3 = new Timeline(keyFrame5, keyFrame6);
t3.play();
//Send the circle to fade transition method.
t3.setOnFinished(event -> FadeTransition(node3, 100));

//Fade transition for node4.
FadeTransition(node4, 200);

return true;

}

//This method for disappear with 10 parameters.
public boolean disappear(Node node, Line node2, Circle node3, Arc node4, Node node5, Node node6, Node node7,
Node node8, Stage stage, Pane pane) {

//Fade transition for node.
FadeTransition(node, 200);

//Timeline for node2. Keyframe shorten the line4 in 200 milliseconds.
Timeline t1 = new Timeline(KeyFrame1(node2, 88, 125, 88, 135, 200), KeyFrame2(node2));
t1.play();
t1.setAutoReverse(true);
//when t1 has finished, send the node2 to fade transition method.
t1.setOnFinished(event -> FadeTransition(node2, 200));

//Keyframe for circle, it shrinks the circle.
KeyFrame keyFrame5 = new KeyFrame(Duration.millis(0), new KeyValue((node3).centerXProperty(),
(node3).getCenterX()),
new KeyValue((node3).centerYProperty(), (node3).getCenterY()),
new KeyValue((node3).radiusProperty(), (node3).getRadius()));

KeyFrame keyFrame6 = new KeyFrame(Duration.millis(200), new KeyValue((node3).centerXProperty(),
290), new KeyValue((node3).centerYProperty(), 232),
new KeyValue((node3).radiusProperty(), 3));

//Timeline for circle.
Timeline t3 = new Timeline(keyFrame5, keyFrame6);
t3.play();
//When t3 has finished send the circle to fade transition method.
t3.setOnFinished(event -> FadeTransition(node3, 400));

//Fade transition for arc.
FadeTransition(node4, 200);

//fade transition for node5.
FadeTransition(node5, 200);

//Fade transition for npde6.
FadeTransition(node6, 200);

//fade transition for node7.
FadeTransition(node7, 200);

//Fade transition for node8.
FadeTransition ft8 = new FadeTransition(Duration.millis(200), node8);
ft8.setFromValue(1.0);
ft8.setToValue(0);
ft8.setCycleCount(0);
ft8.setAutoReverse(true);
ft8.play();

//When ft8 has finished, send the stage and pane to the getLevel2 method for start the next level automatically.
ft8.setOnFinished(event -> getLevel2(stage, pane));

return true;

}

//This method for delete the arc.
public boolean deleteArc(Arc arc1) {

//Keyframe for arc to delete the arc with angle.
KeyFrame keyFrame3 = new KeyFrame(Duration.millis(0), new KeyValue(arc1.startAngleProperty(),
0), new KeyValue(arc1.lengthProperty(), 180));
KeyFrame keyFrame4 = new KeyFrame(Duration.millis(400), new KeyValue(arc1.startAngleProperty(),
0), new KeyValue(arc1.lengthProperty(), 0));

//Timeline for arc.
Timeline t3 = new Timeline(keyFrame3, keyFrame4);
t3.play();

return true;

}

//This method for delete the lines with 10 parameters.
public boolean deleteLine(Node line2, Line line4, Circle circle, Arc arc, Line line5, Node line7, Node line8,
Node line9, Stage stage, Pane pane) {

//This keyframe delete the line5.
KeyFrame keyFrame = new KeyFrame(Duration.millis(0), new KeyValue(line5.startXProperty(), line5.getStartX()),
new KeyValue(line5.startYProperty(), line5.getStartY()), new KeyValue(line5.endXProperty(),
line5.getEndX()),
new KeyValue(line5.endYProperty(), line5.getEndY()));
KeyFrame keyFrame2 = new KeyFrame(Duration.millis(300), new KeyValue(line5.startXProperty(), 90),
new KeyValue(line5.startYProperty(), line5.getStartY()), new KeyValue(line5.endXProperty(),
90),
new KeyValue(line5.endYProperty(), line5.getEndY()));

//Timeline for line5.
Timeline t1 = new Timeline(keyFrame, keyFrame2);
t1.play();
//When t1 has finished, send the parameters to disappear method.
t1.setOnFinished((event -> disappear(line2, line4, circle, arc, line5, line7, line8, line9, stage, pane)));

return true;

}

//This method checks the collision between arc and line.
public boolean collision(Line line, Arc arc) {

if (new Rectangle(line.getStartX() - 7, line.getStartY(), 8, 12).intersects(arc.getCenterX() - 10,
arc.getCenterY(),
8, 12)) {

return true;

}

return false;

}

//This method fades pane,t1,t2,t3 and stage. This method for if there is a collision between arc and line, restart the game.
public boolean FadeForAll(Pane pane, Timeline t1, Timeline t2, Timeline t3, Stage stage) {

//Fade transition for pane.
FadeTransition ft7 = new FadeTransition(Duration.seconds(2.5), pane);
ft7.setFromValue(1.0);
ft7.setToValue(0);
ft7.setCycleCount(0);
ft7.setAutoReverse(true);
ft7.play();

//Stop the t1.
t1.stop();
//Stop the t2.
t2.stop();
//Stop the t3.
t3.stop();

//When ft7 has finished, send the stage to the start method, this makes the restart the level.
ft7.setOnFinished(event -> start(stage));

return true;

}
//We created the keyframe method to shorten the code.
public KeyFrame KeyFrame1(Line line, double startX, double startY, double endX, double endY, double time) {
KeyFrame keyFrame2 = new KeyFrame(Duration.millis(time),
new KeyValue(line.startXProperty(), startX),
new KeyValue(line.startYProperty(), startY),
new KeyValue(line.endXProperty(), endX),
new KeyValue(line.endYProperty(), endY));

return keyFrame2;

}
//We created the keyframe method to shorten the code.
public KeyFrame KeyFrame2(Line line) {

KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0),
new KeyValue(line.startXProperty(), line.getStartX()),
new KeyValue(line.startYProperty(), line.getStartY()),
new KeyValue(line.endXProperty(), line.getEndX()),
new KeyValue(line.endYProperty(), line.getEndY()));

return keyFrame1;

}

//We created fadetransition method for shorten the code.
public void FadeTransition(Node node, double time) {

FadeTransition ft1 = new FadeTransition(Duration.millis(time), node);
ft1.setFromValue(1.0);
ft1.setToValue(0);
ft1.setCycleCount(0);
ft1.setAutoReverse(true);
ft1.play();

}

//This method is for when the level 1 is complete successfully, start the level2 automatically.
public void getLevel2(Stage primaryStage, Pane pane) {
Level2 L2 = new Level2();
L2.start(primaryStage);

}

//Main method
public static void main(String[] args) {

launch(args);

}

}
