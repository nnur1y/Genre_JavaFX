package sample;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.paint.ImagePattern;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;



public class Main  extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane pane = new BorderPane();
        Button btOK = new Button("OK");
        btOK.setTextFill(Color.DARKCYAN);
        pane.setTop(topPane());
        TextField inputName = new TextField();
        pane.setCenter(centerHBox(inputName));
        pane.setBottom(buttomPane(btOK));
        pane.setPrefSize(200, 200);



        BackgroundImage myBI = new BackgroundImage(new Image("sample/img/background_image.jpg"),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                new BackgroundSize(1.0, 1.0, true, true, false, false));
        pane.setBackground(new Background(myBI));

        Scene scene = new Scene(pane, 330,450 );
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();

        btOK.setOnAction(e -> {
            SecondPage  nextPane= new SecondPage(inputName.getText());
            try {
                nextPane.secondScene(primaryStage);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        });

    }

    private GridPane buttomPane(Button btOK) {
            GridPane paneButtom = new GridPane();
            paneButtom.getChildren().add(btOK);
            paneButtom.setAlignment(Pos.CENTER);
            paneButtom.setPadding(new Insets(5, 20, 150, 220));
        return  paneButtom;
    }
    private HBox centerHBox(TextField input) {
            HBox paneHBox = new HBox();
            paneHBox.setPadding(new Insets(10, 20, 20, 10));
            paneHBox.setAlignment(Pos.CENTER);
            Text name = new Text();
            name.setFill(Color.YELLOW);
            Label nameLabel = new Label("Name: ");
            nameLabel.setTextFill(Color.DARKCYAN);
            nameLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
            paneHBox.getChildren().add(nameLabel);
            paneHBox.getChildren().add(input);
        return  paneHBox;
    }
    private GridPane topPane() {
            GridPane pane = new GridPane();
            pane.setPadding(new Insets(90, 50, 10, 80));
            pane.setAlignment(Pos.CENTER);
            Circle circle = new Circle();
            circle.setCenterX(90);
            circle.setCenterY(70);
            circle.setRadius(80);
            Label label = new Label("DAN");
            GridPane.setHalignment(label, HPos.CENTER);
            GridPane.setHalignment(circle, HPos.CENTER);
            label.setTextFill(Color.SNOW);
            label.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD, FontPosture.ITALIC, 40));
            pane.getChildren().addAll(circle, label);
            Image imageL = new Image("sample/img/title.jpg");
            circle.setFill(new ImagePattern(imageL));
        return  pane;
    }

    public static void main(String[] args) {
        launch(args);
    }
}