//Purpose of this program is creating a level 3 of hook game.
//Melisa DÖNMEZ 150116030
//Ekin NOHUTÇU 150116067

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.Line;
import javafx.scene.shape.Arc;
import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;

public class Level3 extends Application {

// This method has a pane,circle,line and arc objects and mouse events for
// the actions.
public void start(Stage primaryStage) {

//Creating a pane object.
Pane pane = new Pane();

//We created the bottom circle and added to the pane.
Circle circle = new Circle();
circle.setCenterX(150);
circle.setCenterY(265);
circle.setRadius(12);
circle.setStroke(Color.DIMGRAY);
circle.setFill(Color.DIMGRAY);
pane.getChildren().add(circle);

//We created the middle circle and added to the pane.
Circle circle2 = new Circle();
circle2.setCenterX(110);
circle2.setCenterY(230);
circle2.setRadius(12);
circle2.setStroke(Color.DIMGRAY);
circle2.setFill(Color.DIMGRAY);
pane.getChildren().add(circle2);

// We created the topmost circle and added to the pane.
Circle circle3 = new Circle();
circle3.setCenterX(70);
circle3.setCenterY(200);
circle3.setRadius(12);
circle3.setStroke(Color.DIMGRAY);
circle3.setFill(Color.DIMGRAY);
pane.getChildren().add(circle3);

//We created a horizontal thin line connected to the topmost circle and added to the pane.
Line line8 = new Line();
line8.setStartX(82);
line8.setStartY(200);
line8.setEndX(262);
line8.setEndY(200);
line8.setStroke(Color.DIMGRAY);
pane.getChildren().add(line8);

//We created a horizontal thin line connected to the middle circle and added to the pane.
Line line9 = new Line();
line9.setStartX(112);
line9.setStartY(230);
line9.setEndX(190);
line9.setEndY(230);
line9.setStroke(Color.DIMGRAY);
pane.getChildren().add(line9);

//We created a vertical thin line connected to the bottom circle and added to the pane.
Line line10 = new Line();
line10.setStartX(150);
line10.setStartY(253);
line10.setEndX(150);
line10.setEndY(90);
line10.setStroke(Color.DIMGRAY);
pane.getChildren().add(line10);

//We created a vertical thin line connected to the middle circle and added to the pane.
Line line11 = new Line();
line11.setStartX(190);
line11.setStartY(230);
line11.setEndX(190);
line11.setEndY(145);
line11.setStroke(Color.DIMGRAY);
pane.getChildren().add(line11);

//We created a horizontal little thin line connected to the bottom circle and added to the pane.
Line line12 = new Line();
line12.setStartX(150);
line12.setStartY(90);
line12.setEndX(159);
line12.setEndY(90);
line12.setStroke(Color.DIMGRAY);
pane.getChildren().add(line12);

//We created a horizontal little thin line connected to the middle circle and added to the pane.
Line line13 = new Line();
line13.setStartX(190);
line13.setStartY(145);
line13.setEndX(199);
line13.setEndY(145);
line13.setStroke(Color.DIMGRAY);
pane.getChildren().add(line13);

//We created a vertical little thick line connected to the middle circle and added to the pane.
Line line14 = new Line();
line14.setStartX(199);
line14.setStartY(141);
line14.setEndX(199);
line14.setEndY(149);
line14.setStroke(Color.DIMGRAY);
line14.setStrokeLineCap(StrokeLineCap.ROUND);
line14.setStrokeWidth(3.2);
pane.getChildren().add(line14);

//We created a little vertical thick line connected to the bottom circle and added to the pane.
Line line15 = new Line();
line15.setStartX(159);
line15.setStartY(87);
line15.setEndX(159);
line15.setEndY(96);
line15.setStroke(Color.DIMGRAY);
line15.setStrokeWidth(3.2);
line15.setStrokeLineCap(StrokeLineCap.ROUND);
pane.getChildren().add(line15);

//We created a little vertical thin line connected to the top circle and added to the pane.
Line line = new Line();
line.setStartX(262);
line.setStartY(193);
line.setEndX(262);
line.setEndY(200);
line.setStroke(Color.DIMGRAY);
pane.getChildren().add(line);

//We created a horizontal thick long line connected to the bottom circle and added to the pane.
Line line2 = new Line();
line2.setStartX(159);
line2.setStartY(91);
line2.setEndX(250);
line2.setEndY(91);
line2.setStroke(Color.DIMGRAY);
line2.setStrokeWidth(3.2);
line2.setStrokeLineCap(StrokeLineCap.ROUND);
pane.getChildren().add(line2);

//We created the topmost arc and added to the pane.
Arc arc = new Arc();
arc.setCenterX(262);
arc.setCenterY(91);
arc.setRadiusX(12);
arc.setRadiusY(12);
arc.setStartAngle(0);
arc.setStrokeWidth(3.2);
arc.setStroke(Color.DIMGRAY);
arc.setFill(null);
arc.setLength(180);
pane.getChildren().add(arc);

//We created the horizontal thick line connected to the middle circle and added to the pane.
Line line3 = new Line();
line3.setStartX(201);
line3.setStartY(145);
line3.setEndX(265);
line3.setEndY(145);
line3.setStroke(Color.DIMGRAY);
line3.setStrokeWidth(3.2);
line3.setStrokeLineCap(StrokeLineCap.ROUND);
pane.getChildren().add(line3);

//We created the vertical thick line which is connected with the topmost circle's arc and added to the pane.
Line line4 = new Line();
line4.setStartX(262);
line4.setStartY(89);
line4.setEndX(262);
line4.setEndY(133);
line4.setStroke(Color.DIMGRAY);
line4.setStrokeWidth(3.2);
line4.setStrokeLineCap(StrokeLineCap.ROUND);
pane.getChildren().add(line4);

//We created the half arc and added to the pane.
Arc arc2 = new Arc();
arc2.setCenterX(262);
arc2.setCenterY(145);
arc2.setRadiusX(12);
arc2.setRadiusY(12);
arc2.setStartAngle(270);
arc2.setStrokeWidth(3.2);
arc2.setStroke(Color.DIMGRAY);
arc2.setFill(null);
arc2.setLength(90);
pane.getChildren().add(arc2);

//We created the half arc and added to the pane.
Arc arc3 = new Arc();
arc3.setCenterX(262);
arc3.setCenterY(145);
arc3.setRadiusX(12);
arc3.setRadiusY(12);
arc3.setStartAngle(0);
arc3.setStrokeWidth(3.2);
arc3.setStroke(Color.DIMGRAY);
arc3.setFill(null);
arc3.setLength(90);
pane.getChildren().add(arc3);

//We created a vertical thick line connected to the top circle and added to the pane.
Line line5 = new Line();
line5.setStartX(262);
line5.setStartY(157);
line5.setEndX(262);
line5.setEndY(188);
line5.setStroke(Color.DIMGRAY);
line5.setStrokeWidth(3.2);
line5.setStrokeLineCap(StrokeLineCap.ROUND);
pane.getChildren().add(line5);

//We created a horizontal little thick line connected with the top circle and added to the pane.
Line line6 = new Line();
line6.setStartX(258);
line6.setStartY(191);
line6.setEndX(266);
line6.setEndY(191);
line6.setStroke(Color.DIMGRAY);
line6.setStrokeWidth(3.2);
line6.setStrokeLineCap(StrokeLineCap.ROUND);
pane.getChildren().add(line6);

//We created a horizontal thick line which is connected to the topmost arc and added to the pane.

Line line7 = new Line();
line7.setStartX(274);
line7.setStartY(91);
line7.setEndX(300);
line7.setEndY(91);
line7.setStroke(Color.DIMGRAY);
line7.setStrokeWidth(3.2);
line7.setStrokeLineCap(StrokeLineCap.ROUND);
pane.getChildren().add(line7);

//We created a scene with the width = 400 and height = 400.

Scene scene = new Scene(pane, 400, 400, Color.WHITE);

// We gave a name to the scene.

primaryStage.setTitle("Level3");
primaryStage.setScene(scene);
primaryStage.show();

//If the bottom circle has clicked, event handler fire an event.
circle.setOnMouseClicked(new EventHandler<MouseEvent>() {

@Override

//This is an overridden method and it handles the event.
public void handle(MouseEvent e) {

//Timeline for line15. Keyframe lengthen the line15 in 200 milliseconds.
Timeline t1 = new Timeline(KeyFrame1(line15, 159, 72, 159, 111, 200), KeyFrame2(line15));
t1.play();
t1.setAutoReverse(true);

//Timeline for line2. Keyframe shorten the line2 in 1450 milliseconds.
Timeline t2 = new Timeline(KeyFrame1(line2, 159, 91, 159, 91, 1450), KeyFrame2(line2));
t2.play();
t2.setAutoReverse(true);
//When t2 has finished, send the arc to the delete arc method.
t2.setOnFinished(event -> deleteArc(arc));

//Timeline for line7. Keyframe shorten the line7 in 1900 milliseconds.
Timeline t3 = new Timeline(KeyFrame1(line7, 159, 91, 185, 91, 1900), KeyFrame2(line7));
t3.play();
t3.setAutoReverse(true);
//When t3 has finished, send line15,line2,circle,arc,line7,line10,line12,primarystage and pane to the deleteline method.
t3.setOnFinished(event -> deleteLine(line15, line2, circle, arc, line7, line10, line12, primaryStage, pane));

//If there is no collision between arc and line, run this code.
if (!(collision(line4, arc))) {

//Keyframe for arc.
KeyFrame keyFrame7 = new KeyFrame(Duration.millis(0),
new KeyValue(arc.centerXProperty(), arc.getCenterX()),
new KeyValue(arc.centerYProperty(), arc.getCenterY()),
new KeyValue(arc.radiusXProperty(), arc.getRadiusX()),
new KeyValue(arc.radiusYProperty(), arc.getRadiusY()));

KeyFrame keyFrame8 = new KeyFrame(Duration.millis(1900), new KeyValue(arc.centerXProperty(), 147),
new KeyValue(arc.centerYProperty(), 91), new KeyValue(arc.radiusXProperty(), 12),
new KeyValue(arc.radiusYProperty(), 12));

//Timeline for arc.
Timeline t4 = new Timeline(keyFrame7, keyFrame8);
t4.play();
t4.setAutoReverse(true);

}

//If there is no collision between arc and line, run this code.
else {

circle.setDisable(true);
circle2.setDisable(true);
circle3.setDisable(true);

//Timeline for line15.
Timeline t6 = new Timeline(KeyFrame1(line15, 159, 72, 159, 111, 200), KeyFrame2(line15));
t6.play();
t6.setAutoReverse(true);

//Keyframe for the arc.
KeyFrame keyFrame9 = new KeyFrame(Duration.millis(0),
new KeyValue(arc.centerXProperty(), arc.getCenterX()),
new KeyValue(arc.centerYProperty(), arc.getCenterY()),
new KeyValue(arc.radiusXProperty(), arc.getRadiusX()),
new KeyValue(arc.radiusYProperty(), arc.getRadiusY()));

KeyFrame keyFrame10 = new KeyFrame(Duration.millis(155), new KeyValue(arc.centerXProperty(), 253),
new KeyValue(arc.centerYProperty(), 91), new KeyValue(arc.radiusXProperty(), 12),
new KeyValue(arc.radiusYProperty(), 12));
Timeline t5 = new Timeline(keyFrame9, keyFrame10);
t5.play();
//When t5 has finished, send the pane, t2,t3 and primarystage to the fade for all method.
t5.setOnFinished(event -> FadeForAll(pane, t2, t3, primaryStage));

}

}

});

//If the middle circle has clicked, event handler fire an event.
circle2.setOnMouseClicked(new EventHandler<MouseEvent>() {

@Override

public void handle(MouseEvent e) {

Timeline t1 = new Timeline(KeyFrame1(line14, 199, 126, 199, 164, 200), KeyFrame2(line14));

t1.play();

t1.setAutoReverse(true);

Timeline t2 = new Timeline(KeyFrame1(line3, 201, 145, 201, 145, 1000), KeyFrame2(line3));

t2.play();

t2.setAutoReverse(true);

t2.setOnFinished(event -> disappear(line14, line3, circle2, line9, line11, line13));

}

});

circle3.setOnMouseClicked(new EventHandler<MouseEvent>() {

@Override

//This is an overridden method and it handles the event.
public void handle(MouseEvent e) {

//Timeline for line6. Keyframe lengthen the line6 in 200 milliseconds.
Timeline t1 = new Timeline(KeyFrame1(line6, 241, 191, 283, 191, 200), KeyFrame2(line6));
t1.play();
t1.setAutoReverse(true);

//Timeline for line5. Keyframe shorten the line5 in 800 milliseconds.
Timeline t2 = new Timeline(KeyFrame1(line5, 262, 191, 262, 191, 800), KeyFrame2(line5));
t2.play();
t2.setAutoReverse(true);
//When t2 has finished, send the arcs to the delete arc method.
t2.setOnFinished(event -> deleteArc2(arc2, arc3));

//Timeline for line4. Keyframe shorten the line in 1500 milliseconds.
Timeline t3 = new Timeline(KeyFrame1(line4, 262, 147, 262, 191, 1500), KeyFrame2(line4));
t3.play();
t3.setAutoReverse(true);
//When t3 has finished, send the nodes to the delete line method.
t3.setOnFinished(event -> deleteLine2(line6, line5, circle3, arc2, arc3, line4, line, line8));

//If there is no collision between arc and line, run this code.
if (!(collision2(line3, arc3))) {

//Keyframe for arc3.
KeyFrame keyFrame7 = new KeyFrame(Duration.millis(0),
new KeyValue(arc3.centerXProperty(), arc3.getCenterX()),
new KeyValue(arc3.centerYProperty(), arc3.getCenterY()),
new KeyValue(arc3.radiusXProperty(), arc3.getRadiusX()),
new KeyValue(arc3.radiusYProperty(), arc3.getRadiusY()));

KeyFrame keyFrame8 = new KeyFrame(Duration.millis(1500), new KeyValue(arc3.centerXProperty(), 262),
new KeyValue(arc3.centerYProperty(), 205), new KeyValue(arc3.radiusXProperty(), 12),
new KeyValue(arc3.radiusYProperty(), 12));

Timeline t4 = new Timeline(keyFrame7, keyFrame8);
t4.play();
t4.setAutoReverse(true);

//Keyframe for arc2.
KeyFrame keyFrame9 = new KeyFrame(Duration.millis(0),
new KeyValue(arc2.centerXProperty(), arc2.getCenterX()),
new KeyValue(arc2.centerYProperty(), arc2.getCenterY()),
new KeyValue(arc2.radiusXProperty(), arc2.getRadiusX()),
new KeyValue(arc2.radiusYProperty(), arc2.getRadiusY()));
KeyFrame keyFrame10 = new KeyFrame(Duration.millis(1500), new KeyValue(arc2.centerXProperty(), 262),
new KeyValue(arc2.centerYProperty(), 205), new KeyValue(arc2.radiusXProperty(), 12),
new KeyValue(arc2.radiusYProperty(), 12));

Timeline t7 = new Timeline(keyFrame9, keyFrame10);
t7.play();
t7.setAutoReverse(true);

}

//If there is a collision between arc and line, run this code.
else {

circle.setDisable(true);
circle2.setDisable(true);
circle3.setDisable(true);
//Timeline for line6.
Timeline t7 = new Timeline(KeyFrame1(line6, 241, 191, 283, 191, 200), KeyFrame2(line6));
t7.play();
t7.setAutoReverse(true);

//Keyframe for arc2.
KeyFrame keyFrame9 = new KeyFrame(Duration.millis(0),
new KeyValue(arc2.centerXProperty(), arc2.getCenterX()),
new KeyValue(arc2.centerYProperty(), arc2.getCenterY()),
new KeyValue(arc2.radiusXProperty(), arc2.getRadiusX()),
new KeyValue(arc2.radiusYProperty(), arc2.getRadiusY()));

KeyFrame keyFrame10 = new KeyFrame(Duration.millis(200), new KeyValue(arc2.centerXProperty(), 262),
new KeyValue(arc2.centerYProperty(), 153), new KeyValue(arc2.radiusXProperty(), 12),
new KeyValue(arc2.radiusYProperty(), 12));
Timeline t5 = new Timeline(keyFrame9, keyFrame10);
t5.play();

//Keyframe for arc3.
KeyFrame keyFrame11 = new KeyFrame(Duration.millis(0),
new KeyValue(arc3.centerXProperty(), arc3.getCenterX()),
new KeyValue(arc3.centerYProperty(), arc3.getCenterY()),
new KeyValue(arc3.radiusXProperty(), arc3.getRadiusX()),
new KeyValue(arc3.radiusYProperty(), arc3.getRadiusY()));

KeyFrame keyFrame12 = new KeyFrame(Duration.millis(200), new KeyValue(arc3.centerXProperty(), 262),
new KeyValue(arc3.centerYProperty(), 153), new KeyValue(arc3.radiusXProperty(), 12),
new KeyValue(arc3.radiusYProperty(), 12));

Timeline t6 = new Timeline(keyFrame11, keyFrame12);
t6.play();
//When t5 has finished, send pane,t2,t3,primarystage fade for all method.
t5.setOnFinished(event -> FadeForAll(pane, t2, t3, primaryStage));

}

}

});

}

//This method for delete the arc.
public boolean deleteArc(Arc arc) {

KeyFrame keyFrame3 = new KeyFrame(Duration.millis(0), new KeyValue(arc.startAngleProperty(), 0),
new KeyValue(arc.lengthProperty(), 180));
KeyFrame keyFrame4 = new KeyFrame(Duration.millis(400), new KeyValue(arc.startAngleProperty(), 0),
new KeyValue(arc.lengthProperty(), 0));

Timeline t3 = new Timeline(keyFrame3, keyFrame4);
t3.play();

return true;

}

//This method for delete the arc.
public boolean deleteArc2(Arc arc2, Arc arc3) {

KeyFrame keyFrame3 = new KeyFrame(Duration.millis(0), new KeyValue(arc2.startAngleProperty(), 270),
new KeyValue(arc2.lengthProperty(), 90));
KeyFrame keyFrame4 = new KeyFrame(Duration.millis(300), new KeyValue(arc2.startAngleProperty(), 360),
new KeyValue(arc2.lengthProperty(), 0));

Timeline t3 = new Timeline(keyFrame3, keyFrame4);
t3.play();

KeyFrame keyFrame5 = new KeyFrame(Duration.millis(0), new KeyValue(arc3.startAngleProperty(), 0),
new KeyValue(arc3.lengthProperty(), 90));
KeyFrame keyFrame6 = new KeyFrame(Duration.millis(400), new KeyValue(arc3.startAngleProperty(), 90),
new KeyValue(arc3.lengthProperty(), 0));

Timeline t4 = new Timeline(keyFrame5, keyFrame6);
//When t3 has finished, play the t4.
t3.setOnFinished(event -> t4.play());

return true;

}

//This method for delete the line.
public boolean deleteLine(Line line15, Line line2, Circle circle, Arc arc, Line line7, Line line10, Line line12,
Stage stage, Pane pane) {

Timeline t1 = new Timeline(KeyFrame1(line7, 159, 91, 159, 91, 300), KeyFrame2(line7));
t1.play();
t1.setAutoReverse(true);
t1.setOnFinished((event -> disappear(line15, line2, circle, arc, line7, line10, line12, stage, pane)));

return true;

}

//This method for delete the lineç
public boolean deleteLine2(Line line6, Line line5, Circle circle3, Arc arc2, Arc arc3, Line line4, Line line,
Line line8) {

Timeline t1 = new Timeline(KeyFrame1(line4, 262, 191, 262, 191, 600), KeyFrame2(line4));
t1.play();
t1.setAutoReverse(true);
t1.setOnFinished(event -> disappear2(line6, line5, circle3, arc2, arc3, line4, line, line8));

return true;

}

//This method for disappear.
public boolean disappear2(Line line6, Line line5, Circle circle3, Arc arc2, Arc arc3, Line line4, Line line,
Line line8) {

//Fade transition for line6.
FadeTransition(line6, 200);

//Timeline for line5.
Timeline t1 = new Timeline(KeyFrame1(line5, 262, 191, 262, 191, 200), KeyFrame2(line5));
t1.play();
t1.setAutoReverse(true);

//Fade transition for line5.
FadeTransition ft1 = new FadeTransition(Duration.millis(200), line5);
ft1.setFromValue(1.0);
ft1.setToValue(0);
ft1.setCycleCount(0);
ft1.setAutoReverse(true);
t1.setOnFinished(event -> ft1.play());

//Keyframe for circle3.
KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0),
new KeyValue(circle3.centerXProperty(), circle3.getCenterX()),
new KeyValue(circle3.centerYProperty(), circle3.getCenterY()),
new KeyValue(circle3.radiusProperty(), circle3.getRadius()));

KeyFrame keyFrame2 = new KeyFrame(Duration.millis(200), new KeyValue(circle3.centerXProperty(), 70),
new KeyValue(circle3.centerYProperty(), 200), new KeyValue(circle3.radiusProperty(), 3));

Timeline t2 = new Timeline(keyFrame1, keyFrame2);
t2.play();

//Fade transition for circle3.
FadeTransition ft2 = new FadeTransition(Duration.millis(100), circle3);
ft2.setFromValue(1.0);
ft2.setToValue(0);
ft2.setCycleCount(0);
ft2.setAutoReverse(true);
t2.setOnFinished(event -> ft2.play());

//Fade transition for arc2.
FadeTransition(arc2, 400);
//Fade transition for arc3.
FadeTransition(arc3, 400);
//Fade transition for line4.
FadeTransition(line4, 200);
//Fade transition for line.
FadeTransition(line, 200);
//Fade transition for line8.
FadeTransition(line8, 200);

return true;

}

//This method for disappear.
public boolean disappear(Line line15, Line line2, Circle circle, Arc arc, Line line7, Line line10, Line line12,
Stage stage, Pane pane) {

//Fade transition for line15.
FadeTransition(line15, 200);

//Timeline for line2.
Timeline t1 = new Timeline(KeyFrame1(line2, 159, 91, 159, 91, 200), KeyFrame2(line2));
t1.play();
t1.setAutoReverse(true);

//Fade transition for line2.
FadeTransition ft1 = new FadeTransition(Duration.millis(100), line2);
ft1.setFromValue(1.0);
ft1.setToValue(0);
ft1.setCycleCount(0);
ft1.setAutoReverse(true);
t1.setOnFinished(event -> ft1.play());

//Keyframe for circle.
KeyFrame keyFrame5 = new KeyFrame(Duration.millis(0),
new KeyValue(circle.centerXProperty(), circle.getCenterX()),
new KeyValue(circle.centerYProperty(), circle.getCenterY()),
new KeyValue(circle.radiusProperty(), circle.getRadius()));

KeyFrame keyFrame6 = new KeyFrame(Duration.millis(200), new KeyValue(circle.centerXProperty(), 150),
new KeyValue(circle.centerYProperty(), 265), new KeyValue(circle.radiusProperty(), 3));

//Timeline for circle.
Timeline t3 = new Timeline(keyFrame5, keyFrame6);
t3.play();

//Fade transition for circle.
FadeTransition ft2 = new FadeTransition(Duration.millis(100), circle);
ft2.setFromValue(1.0);
ft2.setToValue(0);
ft2.setCycleCount(0);
ft2.setAutoReverse(true);
t3.setOnFinished(event -> ft2.play());
ft2.setOnFinished(event -> getLevel4(stage, pane));

//Fade transition for arc.
FadeTransition(arc, 400);
//Fade transition for line.
FadeTransition(line7, 200);
//Fade transition for line10.
FadeTransition(line10, 200);
//Fade transition for line12.
FadeTransition(line12, 200);

return true;

}

//Fade method for pane, t2, t3 and stage.
public boolean FadeForAll(Pane pane, Timeline t2, Timeline t3, Stage stage) {

//fade transition for pane.
FadeTransition ft7 = new FadeTransition(Duration.seconds(2.5), pane);
ft7.setFromValue(1.0);
ft7.setToValue(0);
ft7.setCycleCount(0);
ft7.setAutoReverse(true);
ft7.play();

t2.stop();
t3.stop();

//When ft7 has finished, send the stage to the start method for restart the level.
ft7.setOnFinished(event -> start(stage));

return true;

}

//This method for disappear.
public boolean disappear(Line line14, Line line3, Circle circle2, Line line9, Line line11, Node node) {

//Fade transition for line14.
FadeTransition(line14, 200);

//Timeline for line3.
Timeline t1 = new Timeline(KeyFrame1(line3, 199, 145, 199, 145, 200), KeyFrame2(line3));
t1.play();
t1.setAutoReverse(true);

//Fade transition for line3.
FadeTransition ft1 = new FadeTransition(Duration.millis(100), line3);
ft1.setFromValue(1.0);
ft1.setToValue(0);
ft1.setCycleCount(0);
ft1.setAutoReverse(true);
t1.setOnFinished(event -> ft1.play());

//Keyframe for circle2.
KeyFrame keyFrame5 = new KeyFrame(Duration.millis(0),
new KeyValue(circle2.centerXProperty(), circle2.getCenterX()),
new KeyValue(circle2.centerYProperty(), circle2.getCenterY()),
new KeyValue(circle2.radiusProperty(), circle2.getRadius()));

KeyFrame keyFrame6 = new KeyFrame(Duration.millis(200), new KeyValue(circle2.centerXProperty(), 110),
new KeyValue(circle2.centerYProperty(), 230), new KeyValue(circle2.radiusProperty(), 3));

//Timeline for circle2.
Timeline t3 = new Timeline(keyFrame5, keyFrame6);
t3.play();

//Fade transition for circle3.
FadeTransition ft2 = new FadeTransition(Duration.millis(100), circle2);
ft2.setFromValue(1.0);
ft2.setToValue(0);
ft2.setCycleCount(0);
ft2.setAutoReverse(true);
t3.setOnFinished(event -> ft2.play());

//Fade transition for line9
FadeTransition(line9, 200);
//Fade transition for line11.
FadeTransition(line11, 200);
//Fade transition for node.
FadeTransition(node, 200);

return true;

}

//This method stops the timelines.
public boolean StopTimeline(Timeline t1, Timeline t2) {

t1.stop();
t2.stop();

return true;

}

//This method for shorten the code.
public KeyFrame KeyFrame1(Line line, double startX, double startY, double endX, double endY, double time) {

KeyFrame keyFrame2 = new KeyFrame(Duration.millis(time), new KeyValue(line.startXProperty(), startX),
new KeyValue(line.startYProperty(), startY), new KeyValue(line.endXProperty(), endX),
new KeyValue(line.endYProperty(), endY));

return keyFrame2;

}

//This method for shorten the code.
public KeyFrame KeyFrame2(Line line) {

KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0), new KeyValue(line.startXProperty(), line.getStartX()),
new KeyValue(line.startYProperty(), line.getStartY()),
new KeyValue(line.endXProperty(), line.getEndX()), new KeyValue(line.endYProperty(), line.getEndY()));

return keyFrame1;

}

//This method for shorten the code.
public void FadeTransition(Node node, double time) {

FadeTransition ft1 = new FadeTransition(Duration.millis(time), node);
ft1.setFromValue(1.0);
ft1.setToValue(0);
ft1.setCycleCount(0);
ft1.setAutoReverse(true);
ft1.play();

}

//This method checks is there any collision between arc and line.
public boolean collision(Line line, Arc arc) {

if (new Rectangle(line.getStartX() - 7, line.getStartY(), 8, 12).intersects(arc.getCenterX() - 10,
arc.getCenterY(), 8, 12)) {
return true;
}
return false;

}

//This method checks is there any collision between arc and line.
public boolean collision2(Line line, Arc arc) {

if (new Rectangle(line.getEndX() - 3, line.getStartY(), 4, 6).intersects(arc.getCenterX(),
arc.getCenterY(), 4, 6)) {
return true;
}
return false;

}

//This method for start the next level automatically.
public void getLevel4(Stage primaryStage, Pane pane) {

Level4 L4 = new Level4();
L4.start(primaryStage);

}

public static void main(String[] args) {

launch(args);

}

}
