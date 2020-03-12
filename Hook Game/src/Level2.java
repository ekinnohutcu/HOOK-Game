//Purpose of this program is creating a level 2 of hook game.
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

public class Level2 extends Application {

// This method has a pane,circle,line and arc objects and mouse events for
// the actions.
public void start(Stage primaryStage) {

// We created a pane object.
Pane pane = new Pane();

// We created a rightmost circle object with color dimgray and added to the pane.

Circle circle = new Circle(295, 270, 12);
circle.setStroke(Color.DIMGRAY);
circle.setFill(Color.DIMGRAY);
pane.getChildren().add(circle);

//.we created 2nd circle on the right and added to the pane.

Circle circle2 = new Circle(200, 270, 12);
circle2.setStroke(Color.DIMGRAY);
circle2.setFill(Color.DIMGRAY);
pane.getChildren().add(circle2);

// We crated 3rd circle on the right and added to the pane.
Circle circle3 = new Circle(152, 270, 12);
circle3.setStroke(Color.DIMGRAY);
circle3.setFill(Color.DIMGRAY);
pane.getChildren().add(circle3);

//We created 4th circle on the right and added to the pane.
Circle circle4 = new Circle(95, 270, 12);
circle4.setStroke(Color.DIMGRAY);
circle4.setFill(Color.DIMGRAY);
pane.getChildren().add(circle4);

//We created a thin line above the rightmost circle and added to the pane.
Line line = new Line(295, 180, 295, 270);
line.setStroke(Color.DIMGRAY);
pane.getChildren().add(line);

//We created a small horizontal line connecting the line which above the circle and added to the pane.
Line line2 = new Line(285, 180, 295, 180);
line2.setStroke(Color.DIMGRAY);
pane.getChildren().add(line2);

//We created a thick vertical line next to the upper line and added to the pane.
Line line3 = new Line(285, 175, 285, 185);
line3.setStrokeWidth(3.2);
line3.setStrokeLineCap(StrokeLineCap.ROUND);
line3.setStroke(Color.DIMGRAY);
pane.getChildren().add(line3);

//We created a thick horizontal line before empty circle and added to the pane.
Line line4 = new Line(211, 180, 285, 180);
line4.setStrokeWidth(3.2);
line4.setStroke(Color.DIMGRAY);
pane.getChildren().add(line4);

//We created an empty circle and added to the pane.
Arc arc = new Arc(200, 180, 11, 11, 0, 180);
arc.setStrokeWidth(3.2);
arc.setStroke(Color.DIMGRAY);
arc.setFill(null);
pane.getChildren().add(arc);

//We created a thick horizontal line after empty circle and added to the pane.

Line line5 = new Line(151, 180, 189, 180);
line5.setStrokeWidth(3.2);
line5.setStroke(Color.DIMGRAY);
pane.getChildren().add(line5);

//We created a thin vertical bar above the 2nd circle from the right and added to the pane.
Line line6 = new Line(200, 230, 200, 270);
line6.setStroke(Color.DIMGRAY);
pane.getChildren().add(line6);

//We created a thick horizontal small line above the second circle and added to the pane.
Line line7 = new Line(195, 230, 205, 230);
line7.setStrokeWidth(3.2);
line7.setStrokeLineCap(StrokeLineCap.ROUND);
line7.setStroke(Color.DIMGRAY);
pane.getChildren().add(line7);

//We created a thick vertical long line above the second circle and added to the pane.
Line line8 = new Line(200, 178, 200, 230);
line8.setStrokeWidth(3.2);
line8.setStrokeLineCap(StrokeLineCap.ROUND);
line8.setStroke(Color.DIMGRAY);
pane.getChildren().add(line8);

//We created a vertical thin line above the third circle and added to the pane.
Line line9 = new Line(152, 230, 152, 270);
line9.setStroke(Color.DIMGRAY);
pane.getChildren().add(line9);

//We created a horizontal small thick line above the third circle and added to the pane.
Line line10 = new Line(147, 230, 157, 230);
line10.setStroke(Color.DIMGRAY);
line10.setStrokeWidth(3.2);
line10.setStrokeLineCap(StrokeLineCap.ROUND);
pane.getChildren().add(line10);

//We created a thick vertical line above the third circle and added to the pane.
Line line11 = new Line(152, 192, 152, 230);
line11.setStroke(Color.DIMGRAY);
line11.setStrokeWidth(3.2);
pane.getChildren().add(line11);

//We created the 1st empty circle above the third circle and added to the pane.
Arc arc1 = new Arc(152, 180, 11, 11, 90, 180);
arc1.setStrokeWidth(3.2);
arc1.setStroke(Color.DIMGRAY);
arc1.setFill(null);
arc1.setLength(180);
pane.getChildren().add(arc1);

//We created a thick vertical line above the 1st half circle above the third circle and added to the pane.
Line line12 = new Line(152, 145, 152, 168);
line12.setStrokeWidth(3.2);
line12.setStroke(Color.DIMGRAY);
pane.getChildren().add(line12);

//We created a half of 2nd empty half circle at the top of 3rd circle and added to the pane.
Arc arc2 = new Arc(152, 132, 12, 12, 270, 90);
arc2.setStrokeWidth(3.2);
arc2.setStroke(Color.DIMGRAY);
arc2.setFill(null);
pane.getChildren().add(arc2);

//We created a half of 2nd empty half circle at the top of 3rd circle and added to the pane.
Arc arc3 = new Arc(152, 132, 12, 12, 0, 90);
arc3.setStrokeWidth(3.2);
arc3.setStroke(Color.DIMGRAY);
arc3.setFill(null);
pane.getChildren().add(arc3);

//We created a vertical line above the half circle and added to the pane.
Line line13 = new Line(152, 105, 152, 120);
line13.setStroke(Color.DIMGRAY);
line13.setStrokeWidth(3.2);
pane.getChildren().add(line13);

//We created a thin vertical line above the fourth circle and added to the pane.
Line line14 = new Line(95, 132, 95, 270);
line14.setStroke(Color.DIMGRAY);
pane.getChildren().add(line14);

//We created a thin small horizontal line above the 4nd circle and added to the circle.
Line line15 = new Line(95, 132, 105, 132);
line15.setStroke(Color.DIMGRAY);
pane.getChildren().add(line15);

//We created a thick vertical line under the half circle and added to the pane.
Line line16 = new Line(105, 127, 105, 137);
line16.setStrokeWidth(3.2);
line16.setStroke(Color.DIMGRAY);
line16.setStrokeLineCap(StrokeLineCap.ROUND);
pane.getChildren().add(line16);

//We created a thick horizontal line in the half circle and added to the pane.
Line line17 = new Line(105, 132, 153, 132);
line17.setStrokeWidth(3.2);
line17.setStroke(Color.DIMGRAY);
pane.getChildren().add(line17);

//We created a scene with the width = 400 and height = 400.
Scene scene = new Scene(pane, 400, 400, Color.WHITE);

//We gave the name to the scene.
primaryStage.setTitle("Level2");
primaryStage.setScene(scene);
primaryStage.show();

//If the second circle has clicked, event handler fire the event.
circle2.setOnMouseClicked(new EventHandler<MouseEvent>() {

//This is an overridden method and it handles the event.
public void handle(MouseEvent e) {

//Timeline for line7. Keyframe lengthen the line7 in 300 milliseconds.
Timeline t1 = new Timeline(KeyFrame1(line7, 180, 230, 220, 230, 300), KeyFrame2(line7));
t1.play();
t1.setAutoReverse(true);
//Timeline for line8. .keyframe shorten the line8 in 600 millseconds.
Timeline t2 = new Timeline(KeyFrame1(line8, 200, 230, 200, 230, 600), KeyFrame2(line8));
t2.play();
t2.setAutoReverse(true);
//When the t2 has fisnished, send the line6,line7,line8 and circle2 to the disappear method.
t2.setOnFinished(event -> dissapear(line6, line7, line8, circle2));

}

});

////If the rightmost circle has clicked, event handler fire the event.
circle.setOnMouseClicked(new EventHandler<MouseEvent>() {

//This is an overridden method and it handles the event.
public void handle(MouseEvent e) {

//Timeline for line5. Keyframe lengthen line5 in 2000 milliseconds.
Timeline t1 = new Timeline(KeyFrame1(line5, 247, 180, 285, 180, 2000), KeyFrame2(line5));
t1.play();
t1.setAutoReverse(true);
//When t1 has finished, send line5,line3,line4,line,line2 and circle to the deleteline method.
t1.setOnFinished(event -> deleteLine(line5, line3, line4, line, line2, circle));

//Time line for line3. Keyframe shorten line3 in 200 milliseconds.
Timeline t3 = new Timeline(KeyFrame1(line3, 285, 160, 285, 200, 200), KeyFrame2(line3));
t3.play();
t3.setAutoReverse(true);

//Timeline for line4. Keyframe shorten line4 in 1500 milliseconds.
Timeline t2 = new Timeline(KeyFrame1(line4, 285, 180, 285, 180, 1500), KeyFrame2(line4));
t2.play();
t2.setAutoReverse(true);
//When the t2 has finished, send the arc to the delete arc method.
t2.setOnFinished(event -> deleteArc(arc));

//If there is collision between arc and line, run this code.
if ((collision(line8, arc))) {

Timeline t4 = new Timeline(KeyFrameArc1(arc), KeyFrameArc2(arc, 297, 179, 2000));
t4.play();
t4.setAutoReverse(true);

}

//If there is no collision between arc and line run this code.
else {

//These three codes for not to click the other circles when one circle has clicked.
circle4.setDisable(true);
circle3.setDisable(true);
circle2.setDisable(true);
circle.setDisable(true);
Timeline t5 = new Timeline(KeyFrameArc1(arc), KeyFrameArc2(arc, 209, 180, 185));
t5.play();
t5.setOnFinished(event -> FadeForAll(pane, t1, t2, t3, primaryStage));

}

}

});

//If 4th circle on the right  has clicked, event handler fire the event.
circle4.setOnMouseClicked(new EventHandler<MouseEvent>() {

//This is an overridden method and it handles the event.
public void handle(MouseEvent e) {

//Timeline for line16. Keyframe for lengthen the line16 in 300 milliseconds.
Timeline t1 = new Timeline(KeyFrame1(line16, 105, 112, 105, 152, 300), KeyFrame2(line16));
t1.play();
t1.setAutoReverse(true);

//Timeline for line17. Keyframe for shorten the line17 in 600 milliseconds.
Timeline t2 = new Timeline(KeyFrame1(line17, 105, 132, 105, 132, 600), KeyFrame2(line17));
t2.play();
t2.setAutoReverse(true);
//When t2 has finished, send the line14,line15,line16,line17 and circle4 to the disappear method.
t2.setOnFinished(event -> dissapear(line14, line15, line16, line17, circle4));

}

});

//If  3rd circle on the right  has clicked, event handler fire the event.
circle3.setOnMouseClicked(new EventHandler<MouseEvent>() {

//This is an overridden method and it handles the event.
public void handle(MouseEvent e) {

//Timeline for line10. Keyframe lengthen line10 in 200 milliseconds
Timeline t1 = new Timeline(KeyFrame1(line10, 132, 230, 172, 230, 200), KeyFrame2(line10));
t1.play();
t1.setAutoReverse(true);

//Timeline for line11. Keyframe shorten the line11 in 700 milliseconds.
Timeline t2 = new Timeline(KeyFrame1(line11, 152, 230, 152, 230, 700), KeyFrame2(line11));
t2.play();
t2.setAutoReverse(true);

//When t2 has finished, send arc to the deletearc method.
t2.setOnFinished(event -> deleteArc1(arc1));

//timeline for line13. Keyframe shorten the line13 in 2200 milliseconds.
Timeline t3 = new Timeline(KeyFrame1(line13, 152, 215, 152, 230, 2200), KeyFrame2(line13));
t3.play();
t3.setAutoReverse(true);

//Timeline for line12. Keyframe shorten the line12 in 1200 milliseconds.
Timeline t4 = new Timeline(KeyFrame1(line12, 152, 207, 152, 230, 1200), KeyFrame2(line12));
t4.play();
t4.setAutoReverse(true);

//When t4 has finished, send line12, arc2, arc3 to the deleteline method.
t4.setOnFinished(event -> deleteLine(line12, arc2, arc3));

//If there is a collision between arc and line run this code.
if ((collision(line5, arc1) && (collision2(line17, arc3)))) {

//timeline for arc.
Timeline t5 = new Timeline(KeyFrameArc1(arc1), KeyFrameArc2(arc1, 152, 243, 1200));
t5.play();
t5.setAutoReverse(true);

//Timeline for arc2
Timeline t6 = new Timeline(KeyFrameArc1(arc2), KeyFrameArc2(arc2, 152, 240, 2150));
t6.play();
t6.setAutoReverse(true);

//Timeline for arc3
Timeline t7 = new Timeline(KeyFrameArc1(arc3), KeyFrameArc2(arc3, 152, 240, 2150));
t7.play();
t7.setAutoReverse(true);

//When t6 sen the parameters to deleteline2 method.
t6.setOnFinished(event -> deleteLine2(line13, line10, line9, circle3, line11, line12, line5, arc1,
primaryStage));

}

//If there is no collision between arc and line, run this code.
else {
	circle4.setDisable(true);
	circle2.setDisable(true);
	circle3.setDisable(true);
	circle.setDisable(true);
	t4.stop();
	Timeline t12 = new Timeline(KeyFrame1(line12, 152, 207, 152, 230, 1550), KeyFrame2(line12));
	t12.play();
	t12.setAutoReverse(true);

//Timeline gor arc1.
Timeline t8 = new Timeline(KeyFrameArc1(arc1), KeyFrameArc2(arc1, 152, 189, 175));
t8.play();
//Timeline for arc2.
Timeline t9 = new Timeline(KeyFrameArc1(arc2), KeyFrameArc2(arc2, 152, 142, 200));
t9.play();
t9.setAutoReverse(true);
//Timeline for arc3
Timeline t10 = new Timeline(KeyFrameArc1(arc3), KeyFrameArc2(arc3, 152, 142, 200));
t10.play();
t10.setAutoReverse(true);
//When the t9 has finished, send t3,t2,t4,primarystage and pane to the fadeforall method.
t9.setOnFinished(event -> FadeForAll(t3, t2, t4,t12, primaryStage, pane));

}

}

});

}

//This method disappears the parameters and it takes four parameters.
public boolean dissapear(Line line, Line line2, Line line3, Circle circle) {

//Fade transition for line.
	FadeTransition(line, 200);

//Timeline for line2.
Timeline t1 = new Timeline(KeyFrame1(line2, 195, 230, 205, 230, 200), KeyFrame2(line2));
t1.play();
t1.setAutoReverse(true);

//Fade transition for line2.
t1.setOnFinished(event -> FadeTransition(line2, 100));

//Keyframe for circle.
KeyFrame keyFrame5 = new KeyFrame(Duration.millis(0), new KeyValue(circle.centerXProperty(),
circle.getCenterX()), new KeyValue(circle.centerYProperty(), circle.getCenterY()),
new KeyValue(circle.radiusProperty(), circle.getRadius()));
KeyFrame keyFrame6 = new KeyFrame(Duration.millis(200), new KeyValue(circle.centerXProperty(),
200), new KeyValue(circle.centerYProperty(), 270),
new KeyValue(circle.radiusProperty(),
3));

//Timeline for circle.
Timeline t3 = new Timeline(keyFrame5, keyFrame6);
t3.play();
//When the t3 has finished, send the circle to fadetransition method.
t3.setOnFinished(event -> FadeTransition(circle, 100));
//Fade transition for line3.
FadeTransition(line3, 200);

return true;

}

//This method checks collision.
public boolean collision(Line line, Arc arc) {

if (new Rectangle(line.getStartX() - 7, line.getStartY(), 4, 2).intersects(arc.getCenterX() - 10,
arc.getCenterY(),
4, 2)) {

return false;

}

return true;

}

//This method checks collision.
public boolean collision2(Line line, Arc arc) {

if (new Rectangle(line.getEndX() - 5, line.getStartY() - 2, 12, 4).intersects(arc.getCenterX() - 3,
arc.getCenterY() - 10,

12, 8)) {

return false;

}

return true;

}

//This method for if there is a collision, fade pane, t1,t2,t3 and stage and restart the level.
public boolean FadeForAll(Pane pane, Timeline t1, Timeline t2, Timeline t3, Stage stage) {

//Fade transition for pane.
FadeTransition ft7 = new FadeTransition(Duration.seconds(2.5), pane);
ft7.setFromValue(1.0);
ft7.setToValue(0);
ft7.setCycleCount(0);
ft7.setAutoReverse(true);
ft7.play();

//These three codes dont allow to other circle when one circle has clicked.
t1.stop();
t2.stop();
t3.stop();

//When ft7 has finished, send the stage to start method. When you fail this code restarts the level 2.
ft7.setOnFinished(event -> start(stage));

return true;

}

//This method for fade the t3,t1,t2,stage and pane if there is a collision.
public boolean FadeForAll(Timeline t3, Timeline t1, Timeline t2, Timeline t4,Stage stage, Pane pane) {

//Fade transitino for pane.
FadeTransition ft7 = new FadeTransition(Duration.seconds(2.5), pane);
ft7.setFromValue(1.0);
ft7.setToValue(0);
ft7.setCycleCount(0);
ft7.setAutoReverse(true);
ft7.play();

//These three codes dont allow to other circle when one circle has clicked.
t1.stop();
t2.stop();
t3.stop();
t4.stop();

//When ft7 has finished send the stage to the start method for restart the level.
ft7.setOnFinished(event -> start(stage));

return true;

}
//This method for delete the arc.
public boolean deleteArc(Arc arc1) {


KeyFrame keyFrame3 = new KeyFrame(Duration.millis(0), new KeyValue(arc1.startAngleProperty(),
0), new KeyValue(arc1.lengthProperty(), 180));
KeyFrame keyFrame4 = new KeyFrame(Duration.millis(450), new KeyValue(arc1.startAngleProperty(),
180), new KeyValue(arc1.lengthProperty(), 0));

Timeline t3 = new Timeline(keyFrame3, keyFrame4);
t3.play();

return true;

}
//This method for delete a line and it has 6 parameters.
public boolean deleteLine(Line line, Line line2, Line line3, Line line4, Line line5, Circle circle) {
Timeline t1 = new Timeline(KeyFrame1(line, 285, 180, 285, 180, 500), KeyFrame2(line));
t1.play();
//When t1 has finished, sen the parameters to the disappear method.
t1.setOnFinished(event -> dissapear(line, line2, line3, line4, line5, circle));

return true;

}

//This method for disappear line,line2,line3,line4,line5 and circle.
public boolean dissapear(Line line, Line line2, Line line3, Line line4, Line line5, Circle circle) {

//Timeline for line2. Keyframe makes disappear line2.
Timeline t1 = new Timeline(KeyFrame1(line2, 285, 175, 285, 185, 300), KeyFrame2(line2));
t1.play();
//When t1 has finished send line2 to fade transition method.
t1.setOnFinished(event -> FadeTransition(line2, 200));

//Fade transition for line.
FadeTransition(line, 300);
//Fade transition for line3.
FadeTransition(line3, 300);
//Fade transition for line4.
FadeTransition(line4, 300);
//Fade transition for line5.
FadeTransition(line5, 300);

//Keyframe for circle.
KeyFrame keyFrame5 = new KeyFrame(Duration.millis(0), new KeyValue(circle.centerXProperty(),
circle.getCenterX()), new KeyValue(circle.centerYProperty(), circle.getCenterY()),
new KeyValue(circle.radiusProperty(), circle.getRadius()));

KeyFrame keyFrame6 = new KeyFrame(Duration.millis(200), new KeyValue(circle.centerXProperty(),
295), new KeyValue(circle.centerYProperty(), 270),
new KeyValue(circle.radiusProperty(),
3));

Timeline t3 = new Timeline(keyFrame5, keyFrame6);
t3.play();
//When t3 has finished, send the circle to fade transition method.
t3.setOnFinished(event -> FadeTransition(circle, 100));

return true;

}

//This method for disappear the parameters.
public boolean dissapear(Line line, Line line2, Line line3, Line line4, Circle circle) {

Timeline t1 = new Timeline(KeyFrame1(line3, 105, 127, 105, 137, 300), KeyFrame2(line3));
t1.play();
t1.setAutoReverse(true);
t1.setOnFinished(evet -> FadeTransition(line3, 200));

//Fade transition for line.
FadeTransition(line, 300);
//Fade transition for line2
FadeTransition(line2, 300);
//Fade transition for line4.
FadeTransition(line4, 300);

//Keyframe for circle to shrink it.
KeyFrame keyFrame5 = new KeyFrame(Duration.millis(0),
new KeyValue(circle.centerXProperty(), circle.getCenterX()),
new KeyValue(circle.centerYProperty(), circle.getCenterY()),
new KeyValue(circle.radiusProperty(), circle.getRadius()));

KeyFrame keyFrame6 = new KeyFrame(Duration.millis(200),
new KeyValue(circle.centerXProperty(), 95),
new KeyValue(circle.centerYProperty(), 270),
new KeyValue(circle.radiusProperty(), 3));

//Timeline for circle.
Timeline t3 = new Timeline(keyFrame5, keyFrame6);
t3.play();
//When the t3 has finished send the circle to fade transition method.
t3.setOnFinished(event -> FadeTransition(circle, 100));

return true;

}

//This method for delete the arc.
public boolean deleteArc1(Arc arc1) {

KeyFrame keyFrame3 = new KeyFrame(Duration.millis(0), new KeyValue(arc1.startAngleProperty(),
90), new KeyValue(arc1.lengthProperty(), 180));
KeyFrame keyFrame4 = new KeyFrame(Duration.millis(460), new KeyValue(arc1.startAngleProperty(),
90), new KeyValue(arc1.lengthProperty(), 0));

Timeline t3 = new Timeline(keyFrame3, keyFrame4);

t3.play();

return true;

}

//This method for delete line.
public boolean deleteLine(Line line12, Arc arc, Arc arc2) {

Timeline t6 = new Timeline(KeyFrame1(line12, 152, 230, 152, 230, 500), KeyFrame2(line12));
t6.setAutoReverse(true);
t6.play();

t6.setOnFinished(event -> deleteArc2(arc, arc2));

return true;

}

//This method for delete the arc.
public boolean deleteArc2(Arc arc2, Arc arc3) {
KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0),
new KeyValue(arc2.startAngleProperty(), 270),
new KeyValue(arc2.lengthProperty(), 90));

KeyFrame keyFrame2 = new KeyFrame(Duration.millis(200),
new KeyValue(arc2.startAngleProperty(), 360),
new KeyValue(arc2.lengthProperty(), 0));

Timeline t1 = new Timeline(keyFrame1, keyFrame2);

t1.play();

KeyFrame keyFrame3 = new KeyFrame(Duration.millis(0),
new KeyValue(arc3.startAngleProperty(), 0),
new KeyValue(arc3.lengthProperty(), 90));

KeyFrame keyFrame4 = new KeyFrame(Duration.millis(250),
new KeyValue(arc3.startAngleProperty(), 90),
new KeyValue(arc3.lengthProperty(), 0));

Timeline t2 = new Timeline(keyFrame3, keyFrame4);

//When t1 has finished, play the t2.
t1.setOnFinished(event -> t2.play());

return true;

}

//This method for delete the line.
public boolean deleteLine2(Line line13, Line line10, Line line9, Circle circle3, Line line11, Line line12,
Line line5, Arc arc1, Stage stage) {

Timeline t2 = new Timeline(KeyFrame1(line13, 152, 230, 152, 230, 300), KeyFrame2(line13));
t2.play();
t2.setAutoReverse(true);

Timeline t1 = new Timeline(KeyFrame1(line10, 147, 230, 157, 230, 300), KeyFrame2(line10));
t1.setAutoReverse(true);
t2.setOnFinished(event -> t1.play());
t1.setOnFinished(event -> deleteFade(line9, line10, circle3, line13, line11, line12, stage));

return true;

}

public boolean deleteFade(Line line9, Line line10, Circle circle3, Line line13, Line line11, Line line12,
Stage stage) {

//Fade transition for line10.
FadeTransition(line10, 100);
//Fade transition for line9.
FadeTransition(line9, 100);
//Fade transition for line13.
FadeTransition(line13, 100);
//Fade transition for line11.
FadeTransition(line11, 100);

//Fade transition for line12.
FadeTransition ft1 = new FadeTransition(Duration.millis(100), line12);
ft1.setFromValue(1.0);
ft1.setToValue(0);
ft1.setCycleCount(0);
ft1.setAutoReverse(true);

ft1.play();

//Keyframe for circle3.
KeyFrame keyFrame5 = new KeyFrame(Duration.millis(0), new KeyValue(circle3.centerXProperty(),
circle3.getCenterX()), new KeyValue(circle3.centerYProperty(), circle3.getCenterY()),
new KeyValue(circle3.radiusProperty(), circle3.getRadius()));

KeyFrame keyFrame6 = new KeyFrame(Duration.millis(200), new KeyValue(circle3.centerXProperty(),
152), new KeyValue(circle3.centerYProperty(), 270),
new KeyValue(circle3.radiusProperty(),
3));

Timeline t3 = new Timeline(keyFrame5, keyFrame6);
t3.play();
//When t3 has finished, sen the circle3 to the fade transition method.
t3.setOnFinished(event -> FadeTransition(circle3, 100));

//When ft1 has finished send the stage to getLevel3 method.
ft1.setOnFinished(event -> getLevel3(stage));

return true;

}

//This method for shorten the code.
public KeyFrame KeyFrame1(Line line, double startX, double startY, double endX, double endY, double time) {

//Keyframe for line.
KeyFrame keyFrame2 = new KeyFrame(Duration.millis(time),
new KeyValue(line.startXProperty(), startX),
new KeyValue(line.startYProperty(), startY),
new KeyValue(line.endXProperty(), endX),
new KeyValue(line.endYProperty(), endY));

return keyFrame2;

}

//This method for chorten the code.
public KeyFrame KeyFrame2(Line line) {

KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0),
new KeyValue(line.startXProperty(), line.getStartX()),
new KeyValue(line.startYProperty(), line.getStartY()),
new KeyValue(line.endXProperty(), line.getEndX()),
new KeyValue(line.endYProperty(), line.getEndY()));

return keyFrame1;

}

//This method for shorten the code.
public KeyFrame KeyFrameArc1(Arc arc) {

KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0),
new KeyValue(arc.centerXProperty(), arc.getCenterX()),
new KeyValue(arc.centerYProperty(), arc.getCenterY()),
new KeyValue(arc.radiusXProperty(), arc.getRadiusX()),
new KeyValue(arc.radiusYProperty(), arc.getRadiusY()));

return keyFrame1;

}

//This method for shorten the code.
public KeyFrame KeyFrameArc2(Arc arc, double centerX, double centerY, double time) {

KeyFrame keyFrame1 = new KeyFrame(Duration.millis(time),
new KeyValue(arc.centerXProperty(), centerX),
new KeyValue(arc.centerYProperty(), centerY),
new KeyValue(arc.radiusXProperty(), 12),
new KeyValue(arc.radiusYProperty(), 12));

return keyFrame1;

}

//Fade transition method for shorten the code.
public void FadeTransition(Node node, double time) {

FadeTransition ft1 = new FadeTransition(Duration.millis(time), node);
ft1.setFromValue(1.0);
ft1.setToValue(0);
ft1.setCycleCount(0);
ft1.setAutoReverse(true);
ft1.play();

}

//This method for start the next level automatically.
public void getLevel3(Stage primaryStage) {

Level3 L3 = new Level3();
L3.start(primaryStage);

}

//Main method.
public static void main(String[] args) {

launch(args);

}

}
