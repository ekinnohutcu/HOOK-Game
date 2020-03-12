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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Arc;

public class Level5 extends Application {

// This method has a pane,circle,line and arc objects and mouse events for
// the actions.
public void start(Stage primaryStage) {

//Creating a pane object.
Pane pane = new Pane();

//We created a rightmost circle and added to the pane.
Circle circle = new Circle(250, 270, 12);
circle.setStroke(Color.DIMGRAY);
circle.setFill(Color.DIMGRAY);
pane.getChildren().add(circle);

//We created the 2nd circle on the right and added to the pane.
Circle circle2 = new Circle(175, 270, 12);
circle2.setStroke(Color.DIMGRAY);
circle2.setFill(Color.DIMGRAY);
pane.getChildren().add(circle2);

//We created the 3rd circle on the right and added to the pane.
Circle circle3 = new Circle(115, 228, 12);
circle3.setStroke(Color.DIMGRAY);
circle3.setFill(Color.DIMGRAY);
pane.getChildren().add(circle3);

//We created the 4th circle on the right and added to the pane.
Circle circle4 = new Circle(115, 188, 12);
circle4.setStroke(Color.DIMGRAY);
circle4.setFill(Color.DIMGRAY);
pane.getChildren().add(circle4);

//We created a thin line above the rightmost circle and added to the pane.
Line line = new Line(250, 138, 250, 270);
line.setStroke(Color.DIMGRAY);
pane.getChildren().add(line);

//We created a thin vertical line above the 2nd circle from the right and added to the game.
Line line2 = new Line(175, 240, 175, 270);
line2.setStroke(Color.DIMGRAY);
pane.getChildren().add(line2);

//We created an empty circle and added to the pane.
Circle circle5 = new Circle(175, 228, 12);
circle5.setStrokeWidth(2.2);
circle5.setStroke(Color.DIMGRAY);
circle5.setFill(Color.WHITE);
pane.getChildren().add(circle5);

//We created a thin horizontal line in empty circle and added to the pane.
Line line3 = new Line(163, 228, 187, 228);
line3.setStroke(Color.DIMGRAY);
pane.getChildren().add(line3);

//We created a thin vertical line above the empty circle and added to the pane.
Line line4 = new Line(175, 200, 175, 216);
line4.setStroke(Color.DIMGRAY);
pane.getChildren().add(line4);

//We created an empty circle and added to the pane.
Circle circle6 = new Circle(175, 188, 12);
circle6.setStrokeWidth(2.2);
circle6.setStroke(Color.DIMGRAY);
circle6.setFill(Color.WHITE);
pane.getChildren().add(circle6);

//We created a vertical thin line in an empty circle and added to the pane.
Line line5 = new Line(175, 176, 175, 199);
line5.setStroke(Color.DIMGRAY);
pane.getChildren().add(line5);

//We created a thin horizontal line after 3rd circle and added to the pane.
Line line6 = new Line(115, 228, 162, 228);
line6.setStroke(Color.DIMGRAY);
pane.getChildren().add(line6);

//We created a horizontal thin line after 4th circle and added to the pane.
Line line7 = new Line(115, 188, 162, 188);
line7.setStroke(Color.DIMGRAY);
pane.getChildren().add(line7);

//We created a horizontal long line after 1nd empty circle and added to the pane.
Line line8 = new Line(188, 228, 265, 228);
line8.setStroke(Color.DIMGRAY);
pane.getChildren().add(line8);

//We created a horizontal thin line after 2nd empty circle and added to the pane.
Line line9 = new Line(187, 188, 220, 188);
line9.setStroke(Color.DIMGRAY);
pane.getChildren().add(line9);

//We created a small vertical thin line to the right of the 2nd empty circle and added to the pane.
Line line10 = new Line(220, 180, 220, 188);
line10.setStroke(Color.DIMGRAY);
pane.getChildren().add(line10);

//We created a thick horizontal line after 2nd empty circle and added to the pane.
Line line11 = new Line(215, 180, 225, 180);
line11.setStrokeLineCap(StrokeLineCap.ROUND);
line11.setStrokeWidth(3.2);
line11.setStroke(Color.DIMGRAY);
pane.getChildren().add(line11);

//We created a thick vertical line after 2nd empty circle and added to the pane.
Line line12 = new Line(220, 150, 220, 180);
line12.setStrokeWidth(3.2);
line12.setStroke(Color.DIMGRAY);
pane.getChildren().add(line12);

//We created a half circle and added to the pane.
Arc arc1 = new Arc(220, 138, 12, 12, 90, 180);
arc1.setStrokeWidth(3.2);
arc1.setStroke(Color.DIMGRAY);
arc1.setFill(null);
pane.getChildren().add(arc1);

//We created a small thick vertical bar above the half circle and added to the pane.
Line line13 = new Line(220, 115, 220, 125);
line13.setStrokeWidth(3.2);
line13.setStroke(Color.DIMGRAY);
pane.getChildren().add(line13);

//We created a vertical thin line above the half circle and added to the pane.
Line line14 = new Line(175, 116, 175, 176);
line14.setStroke(Color.DIMGRAY);
pane.getChildren().add(line14);

//We created a horizontal small line after the vertical thin line and added to the pane.
Line line15 = new Line(175, 116, 183, 116);
line15.setStroke(Color.DIMGRAY);
pane.getChildren().add(line15);

//We created a thick vertical small stick line after the horizontal small line and added to the pane.
Line line16 = new Line(183, 111, 183, 121);
line16.setStroke(Color.DIMGRAY);
line16.setStrokeWidth(3.2);
line16.setStrokeLineCap(StrokeLineCap.ROUND);
pane.getChildren().add(line16);

//We created a thick horizontal line after the thick vertical small line and added to the pane.
Line line17 = new Line(183, 116, 208, 116);
line17.setStroke(Color.DIMGRAY);
line17.setStrokeWidth(3.2);
pane.getChildren().add(line17);

//We created a half circle and added to the pane.
Arc arc2 = new Arc(220, 116, 12, 12, 0, 180);
arc2.setStrokeWidth(3.2);
arc2.setStroke(Color.DIMGRAY);
arc2.setFill(null);
pane.getChildren().add(arc2);

//We created a thick horizontal line after the arc2 and added to the pane.
Line line18 = new Line(232, 116, 265, 116);
line18.setStroke(Color.DIMGRAY);
line18.setStrokeWidth(3.2);
pane.getChildren().add(line18);

//We created the smallest vertical line at the far right and added to the pane.
Line line19 = new Line(265, 220, 265, 228);
line19.setStroke(Color.DIMGRAY);
pane.getChildren().add(line19);

//We created thick horizontal small line next to the upper line and added to the pane.
Line line20 = new Line(260, 220, 270, 220);
line20.setStroke(Color.DIMGRAY);
line20.setStrokeWidth(3.2);
line20.setStrokeLineCap(StrokeLineCap.ROUND);
pane.getChildren().add(line20);

//We created the thickest vertical long stick on the far right and added to the pane.
Line line21 = new Line(265, 130, 265, 220);
line21.setStroke(Color.DIMGRAY);
line21.setStrokeWidth(3.2);
pane.getChildren().add(line21);

//We created a half circle at the right and added to the pane.
Arc arc3 = new Arc(265, 116, 12, 12, 0, 90);
arc3.setStrokeWidth(3.2);
arc3.setStroke(Color.DIMGRAY);
arc3.setFill(null);
pane.getChildren().add(arc3);

Arc arc4 = new Arc(265, 116, 12, 12, 270, 90);
arc4.setStrokeWidth(3.2);
arc4.setStroke(Color.DIMGRAY);
arc4.setFill(null);
pane.getChildren().add(arc4);

//We created a horizontal small thin bar above the 1nd circle and added to the pane.
Line line22 = new Line(243, 138, 250, 138);
line22.setStroke(Color.DIMGRAY);
pane.getChildren().add(line22);

//We created a thick vertical small line next to the top line and added to the pane.
Line line23 = new Line(243, 133, 243, 143);
line23.setStroke(Color.DIMGRAY);
line23.setStrokeLineCap(StrokeLineCap.ROUND);
line23.setStrokeWidth(3.2);
pane.getChildren().add(line23);

//We created a thick horizontal line next to the upper line and added to the pane.
Line line24 = new Line(220, 138, 243, 138);
line24.setStroke(Color.DIMGRAY);
line24.setStrokeWidth(3.2);
pane.getChildren().add(line24);

//We created a small thick vertical line above the rightmost half circle and added to the pane.
Line line25 = new Line(265, 95, 265, 102);
line25.setStroke(Color.DIMGRAY);
line25.setStrokeWidth(3.2);
pane.getChildren().add(line25);

//We created a scene with the width = 400 and height = 400
Scene scene = new Scene(pane, 400, 400, Color.WHITE);
primaryStage.setTitle("Level5");
primaryStage.setScene(scene);
primaryStage.show();

// If the empty circle5 has clicked, event handler fire an event.
circle5.setOnMouseClicked(new EventHandler<MouseEvent>() {

public void handle(MouseEvent e) {

	// Change position to line which in the empty circle.
if (line3.getStartX() == 163 && line3.getStartY() == 228 && line3.getEndX() == 187
&& line3.getEndY() == 228) {

line3.setStartX(175);
line3.setStartY(215);
line3.setEndX(175);
line3.setEndY(240);

}

//Change position to line which in the empty circle.
else if (line3.getStartX() == 175 && line3.getStartY() == 215 && line3.getEndX() == 175
&& line3.getEndY() == 240) {

line3.setStartX(163);
line3.setStartY(228);
line3.setEndX(187);
line3.setEndY(228);

}

}

});

// If the circle6 has clicked, event handler fire an event.
circle6.setOnMouseClicked(new EventHandler<MouseEvent>() {

public void handle(MouseEvent e) {

// Change position to line which in the empty circle.
if (line5.getStartX() == 175 && line5.getStartY() == 176 && line5.getEndX() == 175
&& line5.getEndY() == 199) {

line5.setStartX(163);
line5.setStartY(188);
line5.setEndX(187);
line5.setEndY(188);

}

//Change position to line which in the empty circle.
else if (line5.getStartX() == 163 && line5.getStartY() == 188 && line5.getEndX() == 187
&& line5.getEndY() == 188) {

line5.setStartX(175);
line5.setStartY(176);
line5.setEndX(175);
line5.setEndY(199);

}

}

});

// If the circle has clicked, event handler fire an event.
circle.setOnMouseClicked(new EventHandler<MouseEvent>() {

public void handle(MouseEvent e) {

//Timeline for line23.
Timeline t1 = new Timeline(KeyFrame1(line23, 243, 118, 243, 158, 400), KeyFrame2(line23));
t1.play();
t1.setAutoReverse(true);

//Timeline for line24.
Timeline t3 = new Timeline(KeyFrame1(line24, 243, 138, 243, 138, 500), KeyFrame2(line24));
t3.play();
t3.setAutoReverse(true);
t3.setOnFinished(event -> disappear(line23, line24, line22, line, circle));

}

});

// If the circle3 has clicked, event handler fire an event.
circle3.setOnMouseClicked(new EventHandler<MouseEvent>() {

public void handle(MouseEvent e) {

//if the line in the empty circle is in the correct position and there is no collision start motion.
if (line3.getStartX() == 163 && line3.getStartY() == 228 && line3.getEndX() == 187 &&
line3.getEndY() == 228 && collision(line18, arc3)) {

//Timeline for line20.
Timeline t1 = new Timeline(KeyFrame1(line20, 245, 220, 285, 220, 200), KeyFrame2(line20));
t1.play();
t1.setAutoReverse(true);

//Timeline for line21.
Timeline t2 = new Timeline(KeyFrame1(line21, 265, 220, 265, 220, 1500), KeyFrame2(line21));
t2.play();
t2.setAutoReverse(true);

//Timeline for arc3.
Timeline t3 = new Timeline(KeyFrameArc2(arc3, 265, 232, 1950), KeyFrameArc1(arc3));
t3.play();
t3.setAutoReverse(true);

//Timeline for arc4.
Timeline t4 = new Timeline(KeyFrameArc2(arc4, 265, 232, 1950), KeyFrameArc1(arc4));
t4.play();
t4.setAutoReverse(true);

//Timeline for line25.
Timeline t5 = new Timeline(KeyFrame1(line25, 265, 213, 265, 220, 2000), KeyFrame2(line25));
t5.play();
t5.setAutoReverse(true);
t2.setOnFinished(event -> DeleteArc(arc3, arc4, line25, line20, line21, line19, line8, line3, line6,
circle5, circle3, primaryStage));

}

//if the line in the empty circle is in the correct position and there is no collision start motion.
if (line3.getStartX() == 163 && line3.getStartY() == 228 && line3.getEndX() == 187 &&

line3.getEndY() == 228 && (!(collision(line18, arc3)))) {


circle5.setDisable(true);
circle6.setDisable(true);
circle2.setDisable(true);
circle.setDisable(true);
circle4.setDisable(true);

//Timeline for line20.
Timeline t1 = new Timeline(KeyFrame1(line20, 245, 220, 285, 220, 200), KeyFrame2(line20));
t1.play();
t1.setAutoReverse(true);

//Timeline for line21
Timeline t2 = new Timeline(KeyFrame1(line21, 265, 140, 265, 220, 300), KeyFrame2(line21));
t2.play();
t2.setAutoReverse(true);

//Timeline for arc3.
Timeline t3 = new Timeline(KeyFrameArc2(arc3, 265, 125, 300), KeyFrameArc1(arc3));
t3.play();
t3.setAutoReverse(true);

//Timeline for arc4.
Timeline t4 = new Timeline(KeyFrameArc2(arc4, 265, 125, 300), KeyFrameArc1(arc4));
t4.play();
t4.setAutoReverse(true);

//Timeline for line25.
Timeline t5 = new Timeline(KeyFrame1(line25, 265, 105, 265, 112, 300), KeyFrame2(line25));
t5.play();
t5.setAutoReverse(true);
t5.setOnFinished(event -> FadeForAll(pane, primaryStage));

}

}

});


// If the circle2 has clicked, event handler fire an event.
circle2.setOnMouseClicked(new EventHandler<MouseEvent>() {

@Override

public void handle(MouseEvent arg0) {

//if the line in the empty circle is in the correct position and there is no collision start motion.
if (line3.getStartX() == 175 && line3.getStartY() == 215 && line3.getEndX() == 175
&& line3.getEndY() == 240 &&
line5.getStartX() == 175 && line5.getStartY() == 176 && line5.getEndX() == 175
&& line5.getEndY() == 199
&& collision(line13, arc2)) {

//Timeline for line16.
Timeline t1 = new Timeline(KeyFrame1(line16, 183, 96, 183, 136, 200), KeyFrame2(line16));
t1.play();
t1.setAutoReverse(true);

//Timeline for line17.
Timeline t2 = new Timeline(KeyFrame1(line17, 183, 116, 183, 116, 600), KeyFrame2(line17));
t2.play();
t2.setAutoReverse(true);

//Timeline for arc2.
Timeline t3 = new Timeline(KeyFrameArc2(arc2, 171, 116, 1200), KeyFrameArc1(arc2));
t3.play();
t3.setAutoReverse(true);

//Timeline for line18.
Timeline t4 = new Timeline(KeyFrame1(line18, 183, 116, 216, 116, 1250), KeyFrame2(line18));
t4.play();
t4.setAutoReverse(true);
t2.setOnFinished(event -> DeleteArc(arc2, line18, line16, line17, line14, line15, line4, line2,
line5, circle6, circle2));

}

//if the line in the empty circle is in the correct position and there is no collision start motion.
if (line3.getStartX() == 175 && line3.getStartY() == 215 && line3.getEndX() == 175
&& line3.getEndY() == 240 &&
line5.getStartX() == 175 && line5.getStartY() == 176 && line5.getEndX() == 175
&& line5.getEndY() == 199
&& (!collision(line13, arc2))) {

circle5.setDisable(true);
circle6.setDisable(true);
circle3.setDisable(true);
circle.setDisable(true);
circle4.setDisable(true);

//timeline for line16.
Timeline t1 = new Timeline(KeyFrame1(line16, 183, 96, 183, 136, 200), KeyFrame2(line16));
t1.play();
t1.setAutoReverse(true);

//Timeline for line17.
Timeline t2 = new Timeline(KeyFrame1(line17, 183, 116, 198, 116, 300), KeyFrame2(line17));
t2.play();
t2.setAutoReverse(true);

//Timeline for arc2.
Timeline t3 = new Timeline(KeyFrameArc2(arc2, 211, 116, 300), KeyFrameArc1(arc2));
t3.play();
t3.setAutoReverse(true);

//Timeline for line18.
Timeline t4 = new Timeline(KeyFrame1(line18, 226, 116, 259, 116, 300), KeyFrame2(line18));
t4.play();
t4.setAutoReverse(true);
t4.setOnFinished(event -> FadeForAll(pane, primaryStage));

}

}

});

// If the circle4 has clicked, event handler fire an event.
circle4.setOnMouseClicked(new EventHandler<MouseEvent>() {

@Override

public void handle(MouseEvent arg0) {

//if the line in the empty circle is in the correct position and there is no collision start motion.
if (line5.getStartX() == 163 && line5.getStartY() == 188 && line5.getEndX() == 187
&& line5.getEndY() == 188
&& collision2(line24, arc1)) {

//Timeline for line11.
Timeline t1 = new Timeline(KeyFrame1(line11, 200, 180, 240, 180, 200), KeyFrame2(line11));
t1.play();
t1.setAutoReverse(true);

//Timeline for line12.
Timeline t2 = new Timeline(KeyFrame1(line12, 220, 180, 220, 180, 600), KeyFrame2(line12));
t2.play();
t2.setAutoReverse(true);

//Timeline for arc1.
Timeline t3 = new Timeline(KeyFrameArc2(arc1, 220, 192, 1200), KeyFrameArc1(arc1));
t3.play();
t3.setAutoReverse(true);

//timeline for line13.
Timeline t4 = new Timeline(KeyFrame1(line13, 220, 170, 220, 180, 1250), KeyFrame2(line13));
t4.play();
t4.setAutoReverse(true);
t2.setOnFinished(event -> DeleteArc(arc1, line13, line11, line7, line10, line12, line9, circle4));

}

//if the line in the empty circle is in the correct position and there is no collision start motion.
if (line5.getStartX() == 163 && line5.getStartY() == 188 && line5.getEndX() == 187
&& line5.getEndY() == 188
&& (!collision2(line24, arc1))) {

circle5.setDisable(true);
circle6.setDisable(true);
circle2.setDisable(true);
circle.setDisable(true);
circle3.setDisable(true);

//Timeline for line11.
Timeline t1 = new Timeline(KeyFrame1(line11, 200, 180, 240, 180, 200), KeyFrame2(line11));
t1.play();
t1.setAutoReverse(true);

//Timeline for line12.
Timeline t2 = new Timeline(KeyFrame1(line12, 220, 160, 220, 180, 300), KeyFrame2(line12));
t2.play();
t2.setAutoReverse(true);

//Timeline for arc1.
Timeline t3 = new Timeline(KeyFrameArc2(arc1, 220, 147, 300), KeyFrameArc1(arc1));
t3.play();
t3.setAutoReverse(true);

//Timeline for line13.
Timeline t4 = new Timeline(KeyFrame1(line13, 220, 125, 220, 135, 300), KeyFrame2(line13));
t4.play();
t4.setAutoReverse(true);
t4.setOnFinished(event -> FadeForAll(pane, primaryStage));

}

}

});

}

public static void main(String[] args) {

launch(args);

}

//This method for shorten the code.
public KeyFrame KeyFrame1(Line line, double startX, double startY, double endX, double endY, double time) {

KeyFrame keyFrame2 = new KeyFrame(Duration.millis(time),
new KeyValue(line.startXProperty(), startX),
new KeyValue(line.startYProperty(), startY),
new KeyValue(line.endXProperty(), endX),
new KeyValue(line.endYProperty(), endY));

return keyFrame2;

}

//This method for shorten the code.
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

//This method for shorten the code.
public void FadeTransition(Node node, double time) {

FadeTransition ft1 = new FadeTransition(Duration.millis(time), node);
ft1.setFromValue(1.0);
ft1.setToValue(0);
ft1.setCycleCount(0);
ft1.setAutoReverse(true);
ft1.play();

}

//This method for fade the pane and the stage.
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

//This method checks is there any collision between arc and line.
public boolean collision(Line line, Arc arc) {

if (new Rectangle(line.getEndX() - 5, line.getStartY() - 2, 12, 4).intersects(arc.getCenterX() - 3,
arc.getCenterY() - 10,
12, 8)) {
return false;
}
return true;

}

//This method checks is there any collision between arc and line.
public boolean collision2(Line line, Arc arc) {

if (new Rectangle(line.getStartX() - 7, line.getStartY(), 4, 2).intersects(arc.getCenterX() - 10,
arc.getCenterY(),4, 2)) {
return false;
}
return true;
}

//This method for delete the arc.
public boolean DeleteArc(Arc arc, Line line, Line line2, Line line3, Line line4, Line line5, Line line7,
Circle circle) {

//Keyframe for the arc.
KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0), new KeyValue(arc.startAngleProperty(),
90), new KeyValue(arc.lengthProperty(), 180));
KeyFrame keyFrame2 = new KeyFrame(Duration.millis(600), new KeyValue(arc.startAngleProperty(),
90), new KeyValue(arc.lengthProperty(), 0));

//Timeline for the arc.
Timeline t1 = new Timeline(keyFrame1, keyFrame2);
t1.play();
//When t1 has finished, send the parameters to the disappear method.
t1.setOnFinished(event -> DeleteLine(line, line2, line3, line4, line5, line7, circle));

return true;

}

//This method for delete the line.
public boolean DeleteLine(Line line, Line line2, Line line3, Line line4, Line line5, Line line7, Circle circle) {

//Timeline for line.
Timeline t1 = new Timeline(KeyFrame1(line, 220, 180, 220, 180, 300), KeyFrame2(line));
t1.play();
t1.setAutoReverse(true);

//Timeline for line.
Timeline t2 = new Timeline(KeyFrame1(line2, 215, 180, 225, 180, 400), KeyFrame2(line2));
t2.setAutoReverse(true);
t1.setOnFinished(event -> t2.play());
t2.setOnFinished(event -> disappear(line, line2, line3, line4, line5, line7, circle));

return true;

}

//This method for the disappear.
public boolean disappear(Line line, Line line2, Line line3, Line line4, Line line5, Line line7, Circle circle) {

//Fade transition for line.
FadeTransition(line, 200);
//Fade transition for line2.
FadeTransition(line2, 200);
//Fade transition for line3.
FadeTransition(line3, 200);
//Fade transition for line4.
FadeTransition(line4, 200);
//Fade transition for line5.
FadeTransition(line5, 200);
//Fade transition for line7.
FadeTransition(line7, 200);

//Keyframe for the circle.
KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0), new KeyValue(circle.centerXProperty(),
circle.getCenterX()), new KeyValue(circle.centerYProperty(), circle.getCenterY()),
new KeyValue(circle.radiusProperty(), circle.getRadius()));

KeyFrame keyFrame2 = new KeyFrame(Duration.millis(200), new KeyValue(circle.centerXProperty(),
115), new KeyValue(circle.centerYProperty(), 188),
new KeyValue(circle.radiusProperty(),
3));

//Timeline for the circle.
Timeline t2 = new Timeline(keyFrame1, keyFrame2);
t2.play();
t2.setOnFinished(event -> FadeTransition(circle, 100));

return true;

}

//This method for the disappear.
public boolean disappear(Line line, Line line2, Line line3, Line line4, Circle circle) {

//Timeline for line.
Timeline t1 = new Timeline(KeyFrame1(line, 243, 133, 243, 143, 300), KeyFrame2(line));
t1.play();
t1.setAutoReverse(true);
t1.setOnFinished(event -> FadeTransition(line, 100));

//Fade transition for line2.
FadeTransition(line2, 200);
//Fade transition for line3.
FadeTransition(line3, 200);
//Fade transition for line4.
FadeTransition(line4, 200);

//Keyframe for circle.
KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0), new KeyValue(circle.centerXProperty(),
circle.getCenterX()), new KeyValue(circle.centerYProperty(), circle.getCenterY()),
new KeyValue(circle.radiusProperty(), circle.getRadius()));

KeyFrame keyFrame2 = new KeyFrame(Duration.millis(200), new KeyValue(circle.centerXProperty(),
250), new KeyValue(circle.centerYProperty(), 270),
new KeyValue(circle.radiusProperty(),
3));

//Timeline for circle.
Timeline t2 = new Timeline(keyFrame1, keyFrame2);
t2.play();
t2.setOnFinished(event -> FadeTransition(circle, 100));

return true;

}

//This method for delete the arc.
public boolean DeleteArc(Arc arc3, Arc arc4, Line line, Line line2, Line line3, Line line4, Line line5, Line line6,
Line line7,Circle circle, Circle circle2, Stage stage) {

//Keyframe for arc4.
KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0),
new KeyValue(arc4.startAngleProperty(), 270),
new KeyValue(arc4.lengthProperty(), 90));

KeyFrame keyFrame2 = new KeyFrame(Duration.millis(200),
new KeyValue(arc4.startAngleProperty(), 360),
new KeyValue(arc4.lengthProperty(), 0));

//Timeline for arc4.
Timeline t1 = new Timeline(keyFrame1, keyFrame2);
t1.play();

//Keyframe for arc3.
KeyFrame keyFrame3 = new KeyFrame(Duration.millis(0),
new KeyValue(arc3.startAngleProperty(), 0),
new KeyValue(arc3.lengthProperty(), 90));

KeyFrame keyFrame4 = new KeyFrame(Duration.millis(250),
new KeyValue(arc3.startAngleProperty(), 90),
new KeyValue(arc3.lengthProperty(), 0));

//Timeline for arc3.
Timeline t2 = new Timeline(keyFrame3, keyFrame4);
t1.setOnFinished(event -> t2.play());
//When t2 has finished, send the nodes to the delete line method.
t2.setOnFinished(event -> DeleteLine(line, line2, line3, line4, line5, line6, line7, circle, circle2, stage));

return true;

}

//This method for delete the arc.
public boolean DeleteArc(Arc arc, Line line, Line line2, Line line3, Line line4, Line line5, Line line6,
Line line7, Line line8, Circle circle, Circle circle2) {

KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0), new KeyValue(arc.startAngleProperty(),
0), new KeyValue(arc.lengthProperty(), 180));
KeyFrame keyFrame2 = new KeyFrame(Duration.millis(600), new KeyValue(arc.startAngleProperty(),
0), new KeyValue(arc.lengthProperty(), 0));

Timeline t1 = new Timeline(keyFrame1, keyFrame2);
t1.play();
t1.setOnFinished(event -> DeleteLine(line, line2, line3, line4, line5, line6, line7, line8, circle, circle2));

return true;

}

//This method for delete the line.
public boolean DeleteLine(Line line, Line line2, Line line3, Line line4, Line line5, Line line6, Line line7,
Line line8, Circle circle, Circle circle2) {

Timeline t1 = new Timeline(KeyFrame1(line, 183, 116, 183, 116, 500), KeyFrame2(line));
t1.play();
t1.setAutoReverse(true);

Timeline t2 = new Timeline(KeyFrame1(line2, 183, 111, 183, 121, 300), KeyFrame2(line2));
t2.setAutoReverse(true);
t1.setOnFinished(evet -> t2.play());
t2.setOnFinished(event -> disappear(line, line2, line3, line4, line5, line6, line7, line8, circle, circle2));

return true;

}

//This method for disappear.
public boolean disappear(Line line, Line line2, Line line3, Line line4, Line line5, Line line6, Line line7,
Line line8, Circle circle, Circle circle2) {

//Fade transition for line.
FadeTransition(line, 200);
//Fade transition for line2.
FadeTransition(line2, 200);
//Fade transition for line3.
FadeTransition(line3, 200);
//Fade transition for line4.
FadeTransition(line4, 200);
//Fade transition for line5.
FadeTransition(line5, 200);
//Fade transition for line6.
FadeTransition(line6, 200);
//Fade transition for line7.
FadeTransition(line7, 200);
//Fade transition for line8.
FadeTransition(line8, 600);
//Fade transition for circle.
FadeTransition(circle, 600);

//Keyframe for circle2.
KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0), new KeyValue(circle2.centerXProperty(),
circle2.getCenterX()), new KeyValue(circle2.centerYProperty(), circle2.getCenterY()),
new KeyValue(circle2.radiusProperty(), circle2.getRadius()));

KeyFrame keyFrame2 = new KeyFrame(Duration.millis(200), new KeyValue(circle2.centerXProperty(),
175), new KeyValue(circle2.centerYProperty(), 270),
new KeyValue(circle2.radiusProperty(),
3));

Timeline t1 = new Timeline(keyFrame1, keyFrame2);
t1.play();
t1.setOnFinished(event -> FadeTransition(circle2, 100));

return true;

}

//This method for delete line.
public boolean DeleteLine(Line line, Line line2, Line line3, Line line4, Line line5, Line line6, Line line7,
Circle circle, Circle circle2, Stage stage) {

Timeline t1 = new Timeline(KeyFrame1(line, 265, 220, 265, 220, 200), KeyFrame2(line));
t1.play();
t1.setAutoReverse(true);

Timeline t2 = new Timeline(KeyFrame1(line2, 260, 220, 270, 220, 400), KeyFrame2(line2));
t2.setAutoReverse(true);
t1.setOnFinished(event -> t2.play());
t2.setOnFinished(event -> FadeTransition(line2, 200));
t2.setOnFinished(event -> disappear(line, line2, line3, line4, line5, line6, line7, circle, circle2, stage));

return true;

}

//This method for disappear.
public boolean disappear(Line line, Line line2, Line line3, Line line4, Line line5, Line line6, Line line7,
Circle circle, Circle circle2, Stage stage) {

FadeTransition(line, 200);
FadeTransition(line2, 200);
FadeTransition(line3, 200);
FadeTransition(line4, 200);
FadeTransition(line5, 200);
FadeTransition(line6, 600);
FadeTransition(circle, 600);
FadeTransition(line7, 200);

FadeTransition ft1 = new FadeTransition(Duration.millis(100), circle2);
ft1.setFromValue(1.0);
ft1.setToValue(0);
ft1.setCycleCount(0);
ft1.setAutoReverse(true);

KeyFrame keyFrame1 = new KeyFrame(Duration.millis(0), new KeyValue(circle2.centerXProperty(),
circle2.getCenterX()), new KeyValue(circle2.centerYProperty(), circle2.getCenterY()),
new KeyValue(circle2.radiusProperty(), circle2.getRadius()));

KeyFrame keyFrame2 = new KeyFrame(Duration.millis(200), new KeyValue(circle2.centerXProperty(),
115), new KeyValue(circle2.centerYProperty(), 228),
new KeyValue(circle2.radiusProperty(),
3));

Timeline t1 = new Timeline(keyFrame1, keyFrame2);
t1.play();
t1.setOnFinished(event -> ft1.play());
ft1.setOnFinished(event -> getTheEnd(stage));

return true;

}

//This method for "THE END" string.
public void getTheEnd(Stage stage) {

Text centerText = new Text("The End");
centerText.setFont(Font.font("Verdana", 40));
centerText.setFill(Color.DIMGRAY);
BorderPane root = new BorderPane(centerText);

root.setPrefSize(400, 400);
Scene scene = new Scene(root);
stage.setScene(scene);
stage.setTitle("The End");
stage.show();

}

}

