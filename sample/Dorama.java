package sample;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.*;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.ArrayList;

public class Dorama {
    ArrayList<String> list = new ArrayList<>();
    String gamerName;
    int action = 0;
    int fantasy = 0;
    int historical = 0;
    int mektep = 0;
    int sport = 0;
    String result;

    public Dorama() {
        this.gamerName = "not found";
    }


    public void start(Stage dorama_Stage1) {

        HBox game_1 = new HBox();
        game_1.setPadding(new Insets(200, 200, 200, 200));

        VBox gameInside_1 = new VBox();
        Rectangle ramka1 = new Rectangle(400, 300);
        Image imageGame_1 = new Image("sample/img/Boys-Over-Flowers.jpg");
        ramka1.setFill(new ImagePattern(imageGame_1));
        Button firstdor = new Button("Boys over Flowers");
        gameInside_1.setAlignment(Pos.CENTER);
        gameInside_1.getChildren().addAll(ramka1, firstdor);

        VBox gameInside_2 = new VBox();
        Rectangle ramka2 = new Rectangle(400, 300);
        Image imageGame_2 = new Image("sample/img/house.jpg");
        ramka2.setFill(new ImagePattern(imageGame_2));
        Button secondDor = new Button("Full House");
        gameInside_2.setAlignment(Pos.CENTER);
        gameInside_2.getChildren().addAll(ramka2, secondDor);
        game_1.getChildren().addAll(gameInside_1, gameInside_2);

        Pane pane1 = new StackPane();
        Circle circle1 = new Circle(50, 50, 1);
        circle1.setFill(Color.AZURE);
        Label label1 = new Label("******");
        label1.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label1.setTextFill(Color.CRIMSON);
        pane1.getChildren().addAll(circle1, label1);
        // Create a path transition
        PathTransition pt1 = new PathTransition();
        pt1.setDuration(Duration.millis(200));
        pt1.setPath(circle1);
        pt1.setNode(label1);
        pt1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt1.setCycleCount(Timeline.INDEFINITE);
        pt1.setAutoReverse(false);
        pt1.play(); // Start animation
        circle1.setOnMousePressed(e -> pt1.pause());
        circle1.setOnMouseReleased(e -> pt1.play());
        Pane pane2 = new StackPane();
        Circle circle2 = new Circle(1150, 750, 1);
        circle2.setFill(Color.AZURE);
        Label label2 = new Label("******");
        label2.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label2.setTextFill(Color.CRIMSON);
        pane2.getChildren().addAll(circle2, label2);
        PathTransition pt2 = new PathTransition();
        pt2.setDuration(Duration.millis(200));
        pt2.setPath(circle2);
        pt2.setNode(label2);
        pt2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt2.setCycleCount(Timeline.INDEFINITE);
        pt2.setAutoReverse(false);
        pt2.play(); // Start animation
        circle2.setOnMousePressed(e -> pt2.pause());
        circle2.setOnMouseReleased(e -> pt2.play());
        Pane pane3 = new StackPane();
        Circle circle3 = new Circle(1150, 50, 1);
        circle3.setFill(Color.AZURE);
        Label label3 = new Label("******");
        label3.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label3.setTextFill(Color.CRIMSON);
        pane3.getChildren().addAll(circle3, label3);
        // Create a path transition
        PathTransition pt3 = new PathTransition();
        pt3.setDuration(Duration.millis(200));
        pt3.setPath(circle3);
        pt3.setNode(label3);
        pt3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt3.setCycleCount(Timeline.INDEFINITE);
        pt3.setAutoReverse(false);
        pt3.play(); // Start animation
        circle3.setOnMousePressed(e -> pt3.pause());
        circle3.setOnMouseReleased(e -> pt3.play());
        Pane pane4 = new StackPane();
        Circle circle4 = new Circle(50, 750, 1);
        circle4.setFill(Color.AZURE);
        Label label4 = new Label("******");
        label4.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label4.setTextFill(Color.CRIMSON);
        pane4.getChildren().addAll(circle4, label4);
        // Create a path transition
        PathTransition pt4 = new PathTransition();
        pt4.setDuration(Duration.millis(200));
        pt4.setPath(circle4);
        pt4.setNode(label4);
        pt4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt4.setCycleCount(Timeline.INDEFINITE);
        pt4.setAutoReverse(false);
        pt4.play(); // Start animation
        circle4.setOnMousePressed(e -> pt4.pause());
        circle4.setOnMouseReleased(e -> pt4.play());
        Pane paneg = new Pane();
        paneg.setStyle("-fx-background-color: azure");
        paneg.getChildren().addAll(pane1, pane2, pane3, pane4, game_1);


        Scene scene = new Scene(paneg, 1200, 800);
        dorama_Stage1.setTitle("Dorama: First Page");
        dorama_Stage1.setScene(scene); // Place the scene in the stage
        dorama_Stage1.show();

        firstdor.setOnAction(e -> {
            list.add(firstdor.getText());
            System.out.println(this.gamerName + list.toString());
            second(dorama_Stage1);
            mektep++;

        });
        secondDor.setOnAction(e -> {
            list.add(secondDor.getText());
            System.out.println(this.gamerName + list.toString());
            second(dorama_Stage1);

        });


    }


    private void second(Stage dorama_Stage2) {
        HBox game_2 = new HBox();
        game_2.setPadding(new Insets(200, 200, 200, 200));

        VBox gameInside_1 = new VBox();
        Rectangle ramka1 = new Rectangle(400, 300);
        Image imageGame_1 = new Image("sample/img/KI.jpg");
        ramka1.setFill(new ImagePattern(imageGame_1));
        Button firstdor = new Button("Empress Ki");
        gameInside_1.setAlignment(Pos.CENTER);
        gameInside_1.getChildren().addAll(ramka1, firstdor);

        VBox gameInside_2 = new VBox();
        Rectangle ramka2 = new Rectangle(400, 300);
        Image imageGame_2 = new Image("sample/img/W.jpg");
        ramka2.setFill(new ImagePattern(imageGame_2));
        Button secondDor = new Button("W: Two Worlds");
        gameInside_2.setAlignment(Pos.CENTER);
        gameInside_2.getChildren().addAll(ramka2, secondDor);

        game_2.getChildren().addAll(gameInside_1, gameInside_2);

        Pane pane1 = new StackPane();
        Circle circle1 = new Circle(50, 50, 1);
        circle1.setFill(Color.AZURE);
        Label label1 = new Label("******");
        label1.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label1.setTextFill(Color.CRIMSON);
        pane1.getChildren().addAll(circle1, label1);
        PathTransition pt1 = new PathTransition();
        pt1.setDuration(Duration.millis(200));
        pt1.setPath(circle1);
        pt1.setNode(label1);
        pt1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt1.setCycleCount(Timeline.INDEFINITE);
        pt1.setAutoReverse(false);
        pt1.play(); // Start animation
        circle1.setOnMousePressed(e -> pt1.pause());
        circle1.setOnMouseReleased(e -> pt1.play());
        Pane pane2 = new StackPane();
        Circle circle2 = new Circle(1150, 750, 1);
        circle2.setFill(Color.AZURE);
        Label label2 = new Label("******");
        label2.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label2.setTextFill(Color.CRIMSON);
        pane2.getChildren().addAll(circle2, label2);
        PathTransition pt2 = new PathTransition();
        pt2.setDuration(Duration.millis(200));
        pt2.setPath(circle2);
        pt2.setNode(label2);
        pt2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt2.setCycleCount(Timeline.INDEFINITE);
        pt2.setAutoReverse(false);
        pt2.play(); // Start animation
        circle2.setOnMousePressed(e -> pt2.pause());
        circle2.setOnMouseReleased(e -> pt2.play());
        Pane pane3 = new StackPane();
        Circle circle3 = new Circle(1150, 50, 1);
        circle3.setFill(Color.AZURE);
        Label label3 = new Label("******");
        label3.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label3.setTextFill(Color.CRIMSON);
        pane3.getChildren().addAll(circle3, label3);
        // Create a path transition
        PathTransition pt3 = new PathTransition();
        pt3.setDuration(Duration.millis(200));
        pt3.setPath(circle3);
        pt3.setNode(label3);
        pt3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt3.setCycleCount(Timeline.INDEFINITE);
        pt3.setAutoReverse(false);
        pt3.play(); // Start animation
        circle3.setOnMousePressed(e -> pt3.pause());
        circle3.setOnMouseReleased(e -> pt3.play());
        Pane pane4 = new StackPane();
        Circle circle4 = new Circle(50, 750, 1);
        circle4.setFill(Color.AZURE);
        Label label4 = new Label("******");
        label4.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label4.setTextFill(Color.CRIMSON);
        pane4.getChildren().addAll(circle4, label4);
        // Create a path transition
        PathTransition pt4 = new PathTransition();
        pt4.setDuration(Duration.millis(200));
        pt4.setPath(circle4);
        pt4.setNode(label4);
        pt4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt4.setCycleCount(Timeline.INDEFINITE);
        pt4.setAutoReverse(false);
        pt4.play(); // Start animation
        circle4.setOnMousePressed(e -> pt4.pause());
        circle4.setOnMouseReleased(e -> pt4.play());
        Pane paneg = new Pane();
        paneg.setStyle("-fx-background-color: antiquewhite");
        paneg.getChildren().addAll(pane1, pane2, pane3, pane4, game_2);

        Scene scene = new Scene(paneg, 1200, 800);
        dorama_Stage2.setTitle("Dorama: Second Page");
        dorama_Stage2.setScene(scene); // Place the scene in the stage
        dorama_Stage2.show();


        firstdor.setOnAction(e -> {
            list.add(firstdor.getText());
            System.out.println(this.gamerName + list.toString());
            third(dorama_Stage2);
            action++;
            historical++;

        });
        secondDor.setOnAction(e -> {
            list.add(secondDor.getText());
            System.out.println(this.gamerName + list.toString());
            third(dorama_Stage2);
            fantasy++;

        });
    }

    private void third(Stage dorama_Stage3) {
        HBox game_3 = new HBox();
        game_3.setPadding(new Insets(200, 200, 200, 200));

        VBox gameInside_1 = new VBox();
        Rectangle ramka1 = new Rectangle(400, 300);
        Image imageGame_1 = new Image("sample/img/demon.jpg");
        ramka1.setFill(new ImagePattern(imageGame_1));
        Button firstdor = new Button("Goblin");
        gameInside_1.setAlignment(Pos.CENTER);
        gameInside_1.getChildren().addAll(ramka1, firstdor);

        VBox gameInside_2 = new VBox();
        Rectangle ramka2 = new Rectangle(400, 300);
        Image imageGame_2 = new Image("sample/img/kim.jpg");
        ramka2.setFill(new ImagePattern(imageGame_2));
        Button secondDor = new Button("Secretary Kim ");
        gameInside_2.setAlignment(Pos.CENTER);
        gameInside_2.getChildren().addAll(ramka2, secondDor);

        game_3.getChildren().addAll(gameInside_1, gameInside_2);

        Pane pane1 = new StackPane();
        Circle circle1 = new Circle(50, 50, 1);
        circle1.setFill(Color.AZURE);
        Label label1 = new Label("******");
        label1.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label1.setTextFill(Color.CRIMSON);
        pane1.getChildren().addAll(circle1, label1);
        PathTransition pt1 = new PathTransition();
        pt1.setDuration(Duration.millis(200));
        pt1.setPath(circle1);
        pt1.setNode(label1);
        pt1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt1.setCycleCount(Timeline.INDEFINITE);
        pt1.setAutoReverse(false);
        pt1.play(); // Start animation
        circle1.setOnMousePressed(e -> pt1.pause());
        circle1.setOnMouseReleased(e -> pt1.play());
        Pane pane2 = new StackPane();
        Circle circle2 = new Circle(1150, 750, 1);
        circle2.setFill(Color.AZURE);
        Label label2 = new Label("******");
        label2.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label2.setTextFill(Color.CRIMSON);
        pane2.getChildren().addAll(circle2, label2);
        PathTransition pt2 = new PathTransition();
        pt2.setDuration(Duration.millis(200));
        pt2.setPath(circle2);
        pt2.setNode(label2);
        pt2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt2.setCycleCount(Timeline.INDEFINITE);
        pt2.setAutoReverse(false);
        pt2.play(); // Start animation
        circle2.setOnMousePressed(e -> pt2.pause());
        circle2.setOnMouseReleased(e -> pt2.play());
        Pane pane3 = new StackPane();
        Circle circle3 = new Circle(1150, 50, 1);
        circle3.setFill(Color.AZURE);
        Label label3 = new Label("******");
        label3.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label3.setTextFill(Color.CRIMSON);
        pane3.getChildren().addAll(circle3, label3);
        PathTransition pt3 = new PathTransition();
        pt3.setDuration(Duration.millis(200));
        pt3.setPath(circle3);
        pt3.setNode(label3);
        pt3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt3.setCycleCount(Timeline.INDEFINITE);
        pt3.setAutoReverse(false);
        pt3.play(); // Start animation
        circle3.setOnMousePressed(e -> pt3.pause());
        circle3.setOnMouseReleased(e -> pt3.play());
        Pane pane4 = new StackPane();
        Circle circle4 = new Circle(50, 750, 1);
        circle4.setFill(Color.AZURE);
        Label label4 = new Label("******");
        label4.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label4.setTextFill(Color.CRIMSON);
        pane4.getChildren().addAll(circle4, label4);
        PathTransition pt4 = new PathTransition();
        pt4.setDuration(Duration.millis(200));
        pt4.setPath(circle4);
        pt4.setNode(label4);
        pt4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt4.setCycleCount(Timeline.INDEFINITE);
        pt4.setAutoReverse(false);
        pt4.play(); // Start animation
        circle4.setOnMousePressed(e -> pt4.pause());
        circle4.setOnMouseReleased(e -> pt4.play());
        Pane paneg = new Pane();
        paneg.setStyle("-fx-background-color: beige");
        paneg.getChildren().addAll(pane1, pane2, pane3, pane4, game_3);

        Scene scene = new Scene(paneg, 1200, 800);
        dorama_Stage3.setTitle("Dorama: Third Page");
        dorama_Stage3.setScene(scene); // Place the scene in the stage
        dorama_Stage3.show();


        firstdor.setOnAction(e -> {
            list.add(firstdor.getText());
            System.out.println(this.gamerName + list.toString());
            fourth(dorama_Stage3);
            fantasy++;
            historical++;

        });
        secondDor.setOnAction(e -> {
            list.add(secondDor.getText());
            System.out.println(this.gamerName + list.toString());
            fourth(dorama_Stage3);

        });

    }

    private void fourth(Stage dorama_Stage4) {
        HBox game_4 = new HBox();
        game_4.setPadding(new Insets(200, 200, 200, 200));

        VBox gameInside_1 = new VBox();
        Rectangle ramka1 = new Rectangle(400, 300);
        Image imageGame_1 = new Image("sample/img/bb.jpg");
        ramka1.setFill(new ImagePattern(imageGame_1));
        Button f1 = new Button("Descendants of the Sun");
        gameInside_1.setAlignment(Pos.CENTER);
        gameInside_1.getChildren().addAll(ramka1, f1);

        VBox gameInside_2 = new VBox();
        Rectangle ramka2 = new Rectangle(400, 300);
        Image imageGame_2 = new Image("sample/img/chorin.jpg");
        ramka2.setFill(new ImagePattern(imageGame_2));
        Button s2 = new Button("Queen Cheorin");
        gameInside_2.setAlignment(Pos.CENTER);
        gameInside_2.getChildren().addAll(ramka2, s2);

        game_4.getChildren().addAll(gameInside_1, gameInside_2);

        Pane pane1 = new StackPane();
        Circle circle1 = new Circle(50, 50, 1);
        circle1.setFill(Color.AZURE);
        Label label1 = new Label("******");
        label1.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label1.setTextFill(Color.CRIMSON);
        pane1.getChildren().addAll(circle1, label1);
        PathTransition pt1 = new PathTransition();
        pt1.setDuration(Duration.millis(200));
        pt1.setPath(circle1);
        pt1.setNode(label1);
        pt1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt1.setCycleCount(Timeline.INDEFINITE);
        pt1.setAutoReverse(false);
        pt1.play(); // Start animation
        circle1.setOnMousePressed(e -> pt1.pause());
        circle1.setOnMouseReleased(e -> pt1.play());
        Pane pane2 = new StackPane();
        Circle circle2 = new Circle(1150, 750, 1);
        circle2.setFill(Color.AZURE);
        Label label2 = new Label("******");
        label2.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label2.setTextFill(Color.CRIMSON);
        pane2.getChildren().addAll(circle2, label2);
        PathTransition pt2 = new PathTransition();
        pt2.setDuration(Duration.millis(200));
        pt2.setPath(circle2);
        pt2.setNode(label2);
        pt2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt2.setCycleCount(Timeline.INDEFINITE);
        pt2.setAutoReverse(false);
        pt2.play(); // Start animation
        circle2.setOnMousePressed(e -> pt2.pause());
        circle2.setOnMouseReleased(e -> pt2.play());
        Pane pane3 = new StackPane();
        Circle circle3 = new Circle(1150, 50, 1);
        circle3.setFill(Color.AZURE);
        Label label3 = new Label("******");
        label3.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label3.setTextFill(Color.CRIMSON);
        pane3.getChildren().addAll(circle3, label3);
        PathTransition pt3 = new PathTransition();
        pt3.setDuration(Duration.millis(200));
        pt3.setPath(circle3);
        pt3.setNode(label3);
        pt3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt3.setCycleCount(Timeline.INDEFINITE);
        pt3.setAutoReverse(false);
        pt3.play(); // Start animation
        circle3.setOnMousePressed(e -> pt3.pause());
        circle3.setOnMouseReleased(e -> pt3.play());
        Pane pane4 = new StackPane();
        Circle circle4 = new Circle(50, 750, 1);
        circle4.setFill(Color.AZURE);
        Label label4 = new Label("******");
        label4.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label4.setTextFill(Color.CRIMSON);
        pane4.getChildren().addAll(circle4, label4);
        PathTransition pt4 = new PathTransition();
        pt4.setDuration(Duration.millis(200));
        pt4.setPath(circle4);
        pt4.setNode(label4);
        pt4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt4.setCycleCount(Timeline.INDEFINITE);
        pt4.setAutoReverse(false);
        pt4.play(); // Start animation
        circle4.setOnMousePressed(e -> pt4.pause());
        circle4.setOnMouseReleased(e -> pt4.play());
        Pane paneg = new Pane();
        paneg.setStyle("-fx-background-color: honeydew");
        paneg.getChildren().addAll(pane1, pane2, pane3, pane4, game_4);

        Scene scene = new Scene(paneg, 1200, 800);
        dorama_Stage4.setTitle("Dorama: Fourth Page");
        dorama_Stage4.setScene(scene); // Place the scene in the stage
        dorama_Stage4.show();


        f1.setOnAction(e -> {
            list.add(f1.getText());
            System.out.println(this.gamerName + list.toString());
            fifth(dorama_Stage4);
            action++;

        });
        s2.setOnAction(e -> {
            list.add(s2.getText());
            System.out.println(this.gamerName + list.toString());
            fifth(dorama_Stage4);
            fantasy++;
            historical++;

        });
    }

    private void fifth(Stage dorama_Stage5) {
        HBox game_5 = new HBox();
        game_5.setPadding(new Insets(200, 200, 200, 200));

        VBox gameInside_1 = new VBox();
        Rectangle ramka1 = new Rectangle(400, 300);
        Image imageGame_1 = new Image("sample/img/moon.jpg");
        ramka1.setFill(new ImagePattern(imageGame_1));
        Button firstdor = new Button("Moon Lovers");
        gameInside_1.setAlignment(Pos.CENTER);
        gameInside_1.getChildren().addAll(ramka1, firstdor);

        VBox gameInside_2 = new VBox();
        Rectangle ramka2 = new Rectangle(400, 300);
        Image imageGame_2 = new Image("sample/img/true.jpg");
        ramka2.setFill(new ImagePattern(imageGame_2));
        Button secondDor = new Button("True Beauty");
        gameInside_2.setAlignment(Pos.CENTER);
        gameInside_2.getChildren().addAll(ramka2, secondDor);

        game_5.getChildren().addAll(gameInside_1, gameInside_2);

        Pane pane1 = new StackPane();
        Circle circle1 = new Circle(50, 50, 1);
        circle1.setFill(Color.AZURE);
        Label label1 = new Label("******");
        label1.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label1.setTextFill(Color.CRIMSON);
        pane1.getChildren().addAll(circle1, label1);
        PathTransition pt1 = new PathTransition();
        pt1.setDuration(Duration.millis(200));
        pt1.setPath(circle1);
        pt1.setNode(label1);
        pt1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt1.setCycleCount(Timeline.INDEFINITE);
        pt1.setAutoReverse(false);
        pt1.play(); // Start animation
        circle1.setOnMousePressed(e -> pt1.pause());
        circle1.setOnMouseReleased(e -> pt1.play());
        Pane pane2 = new StackPane();
        Circle circle2 = new Circle(1150, 750, 1);
        circle2.setFill(Color.AZURE);
        Label label2 = new Label("******");
        label2.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label2.setTextFill(Color.CRIMSON);
        pane2.getChildren().addAll(circle2, label2);
        PathTransition pt2 = new PathTransition();
        pt2.setDuration(Duration.millis(200));
        pt2.setPath(circle2);
        pt2.setNode(label2);
        pt2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt2.setCycleCount(Timeline.INDEFINITE);
        pt2.setAutoReverse(false);
        pt2.play(); // Start animation
        circle2.setOnMousePressed(e -> pt2.pause());
        circle2.setOnMouseReleased(e -> pt2.play());
        Pane pane3 = new StackPane();
        Circle circle3 = new Circle(1150, 50, 1);
        circle3.setFill(Color.AZURE);
        Label label3 = new Label("******");
        label3.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label3.setTextFill(Color.CRIMSON);
        pane3.getChildren().addAll(circle3, label3);
        PathTransition pt3 = new PathTransition();
        pt3.setDuration(Duration.millis(200));
        pt3.setPath(circle3);
        pt3.setNode(label3);
        pt3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt3.setCycleCount(Timeline.INDEFINITE);
        pt3.setAutoReverse(false);
        pt3.play(); // Start animation
        circle3.setOnMousePressed(e -> pt3.pause());
        circle3.setOnMouseReleased(e -> pt3.play());
        Pane pane4 = new StackPane();
        Circle circle4 = new Circle(50, 750, 1);
        circle4.setFill(Color.AZURE);
        Label label4 = new Label("******");
        label4.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label4.setTextFill(Color.CRIMSON);
        pane4.getChildren().addAll(circle4, label4);
        PathTransition pt4 = new PathTransition();
        pt4.setDuration(Duration.millis(200));
        pt4.setPath(circle4);
        pt4.setNode(label4);
        pt4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt4.setCycleCount(Timeline.INDEFINITE);
        pt4.setAutoReverse(false);
        pt4.play(); // Start animation
        circle4.setOnMousePressed(e -> pt4.pause());
        circle4.setOnMouseReleased(e -> pt4.play());
        Pane paneg = new Pane();
        paneg.setStyle("-fx-background-color: ivory");
        paneg.getChildren().addAll(pane1, pane2, pane3, pane4, game_5);

        Scene scene = new Scene(paneg, 1200, 800);
        dorama_Stage5.setTitle("Dorama: Fifth Page");
        dorama_Stage5.setScene(scene); // Place the scene in the stage
        dorama_Stage5.show();


        firstdor.setOnAction(e -> {
            list.add(firstdor.getText());
            System.out.println(this.gamerName + list.toString());
            sixth(dorama_Stage5);
            action++;
            fantasy++;
            historical++;
        });
        secondDor.setOnAction(e -> {
            list.add(secondDor.getText());
            System.out.println(this.gamerName + list.toString());
            sixth(dorama_Stage5);
            mektep++;
        });
    }


    private void sixth(Stage dorama_Stage6) {
        HBox game_6 = new HBox();
        game_6.setPadding(new Insets(200, 200, 200, 200));

        VBox gameInside_1 = new VBox();
        Rectangle ramka1 = new Rectangle(400, 300);
        Image imageGame_1 = new Image("sample/img/Hwar.jpg");
        ramka1.setFill(new ImagePattern(imageGame_1));
        Button firstdor = new Button("Hwarang");
        gameInside_1.setAlignment(Pos.CENTER);
        gameInside_1.getChildren().addAll(ramka1, firstdor);

        VBox gameInside_2 = new VBox();
        Rectangle ramka2 = new Rectangle(400, 300);
        Image imageGame_2 = new Image("sample/img/strong.jpg");
        ramka2.setFill(new ImagePattern(imageGame_2));
        Button secondDor = new Button("Strong Woman");
        gameInside_2.setAlignment(Pos.CENTER);
        gameInside_2.getChildren().addAll(ramka2, secondDor);

        game_6.getChildren().addAll(gameInside_1, gameInside_2);

        Pane pane1 = new StackPane();
        Circle circle1 = new Circle(50, 50, 1);
        circle1.setFill(Color.AZURE);
        Label label1 = new Label("******");
        label1.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label1.setTextFill(Color.CRIMSON);
        pane1.getChildren().addAll(circle1, label1);
        PathTransition pt1 = new PathTransition();
        pt1.setDuration(Duration.millis(200));
        pt1.setPath(circle1);
        pt1.setNode(label1);
        pt1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt1.setCycleCount(Timeline.INDEFINITE);
        pt1.setAutoReverse(false);
        pt1.play(); // Start animation
        circle1.setOnMousePressed(e -> pt1.pause());
        circle1.setOnMouseReleased(e -> pt1.play());
        Pane pane2 = new StackPane();
        Circle circle2 = new Circle(1150, 750, 1);
        circle2.setFill(Color.AZURE);
        Label label2 = new Label("******");
        label2.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label2.setTextFill(Color.CRIMSON);
        pane2.getChildren().addAll(circle2, label2);
        PathTransition pt2 = new PathTransition();
        pt2.setDuration(Duration.millis(200));
        pt2.setPath(circle2);
        pt2.setNode(label2);
        pt2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt2.setCycleCount(Timeline.INDEFINITE);
        pt2.setAutoReverse(false);
        pt2.play(); // Start animation
        circle2.setOnMousePressed(e -> pt2.pause());
        circle2.setOnMouseReleased(e -> pt2.play());
        Pane pane3 = new StackPane();
        Circle circle3 = new Circle(1150, 50, 1);
        circle3.setFill(Color.AZURE);
        Label label3 = new Label("******");
        label3.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label3.setTextFill(Color.CRIMSON);
        pane3.getChildren().addAll(circle3, label3);
        PathTransition pt3 = new PathTransition();
        pt3.setDuration(Duration.millis(200));
        pt3.setPath(circle3);
        pt3.setNode(label3);
        pt3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt3.setCycleCount(Timeline.INDEFINITE);
        pt3.setAutoReverse(false);
        pt3.play(); // Start animation
        circle3.setOnMousePressed(e -> pt3.pause());
        circle3.setOnMouseReleased(e -> pt3.play());
        Pane pane4 = new StackPane();
        Circle circle4 = new Circle(50, 750, 1);
        circle4.setFill(Color.AZURE);
        Label label4 = new Label("******");
        label4.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label4.setTextFill(Color.CRIMSON);
        pane4.getChildren().addAll(circle4, label4);
        PathTransition pt4 = new PathTransition();
        pt4.setDuration(Duration.millis(200));
        pt4.setPath(circle4);
        pt4.setNode(label4);
        pt4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt4.setCycleCount(Timeline.INDEFINITE);
        pt4.setAutoReverse(false);
        pt4.play(); // Start animation
        circle4.setOnMousePressed(e -> pt4.pause());
        circle4.setOnMouseReleased(e -> pt4.play());
        Pane paneg = new Pane();
        paneg.setStyle("-fx-background-color: lavenderblush");
        paneg.getChildren().addAll(pane1, pane2, pane3, pane4, game_6);

        Scene scene = new Scene(paneg, 1200, 800);
        dorama_Stage6.setTitle("Dorama: Sixth Page");
        dorama_Stage6.setScene(scene); // Place the scene in the stage
        dorama_Stage6.show();


        firstdor.setOnAction(e -> {
            list.add(firstdor.getText());
            System.out.println(this.gamerName + list.toString());
            seventh(dorama_Stage6);
            action++;
            historical++;
            mektep++;

        });
        secondDor.setOnAction(e -> {
            list.add(secondDor.getText());
            System.out.println(this.gamerName + list.toString());
            seventh(dorama_Stage6);
            fantasy++;

        });
    }

    private void seventh(Stage dorama_Stage7) {
        HBox game_7 = new HBox();
        game_7.setPadding(new Insets(200, 200, 200, 200));

        VBox gameInside_1 = new VBox();
        Rectangle ramka1 = new Rectangle(400, 300);
        Image imageGame_1 = new Image("sample/img/9t.jpg");
        ramka1.setFill(new ImagePattern(imageGame_1));
        Button fname = new Button("Tale of the nine tailed");
        gameInside_1.setAlignment(Pos.CENTER);
        gameInside_1.getChildren().addAll(ramka1, fname);

        VBox gameInside_2 = new VBox();
        Rectangle ramka2 = new Rectangle(400, 300);
        Image imageGame_2 = new Image("sample/img/bok.jpg");
        ramka2.setFill(new ImagePattern(imageGame_2));
        Button sn = new Button("Weightlifting Fairy");
        gameInside_2.setAlignment(Pos.CENTER);
        gameInside_2.getChildren().addAll(ramka2, sn);

        game_7.getChildren().addAll(gameInside_1, gameInside_2);

        Pane pane1 = new StackPane();
        Circle circle1 = new Circle(50, 50, 1);
        circle1.setFill(Color.AZURE);
        Label label1 = new Label("******");
        label1.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label1.setTextFill(Color.CRIMSON);
        pane1.getChildren().addAll(circle1, label1);
        PathTransition pt1 = new PathTransition();
        pt1.setDuration(Duration.millis(200));
        pt1.setPath(circle1);
        pt1.setNode(label1);
        pt1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt1.setCycleCount(Timeline.INDEFINITE);
        pt1.setAutoReverse(false);
        pt1.play(); // Start animation
        circle1.setOnMousePressed(e -> pt1.pause());
        circle1.setOnMouseReleased(e -> pt1.play());
        Pane pane2 = new StackPane();
        Circle circle2 = new Circle(1150, 750, 1);
        circle2.setFill(Color.AZURE);
        Label label2 = new Label("******");
        label2.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label2.setTextFill(Color.CRIMSON);
        pane2.getChildren().addAll(circle2, label2);
        PathTransition pt2 = new PathTransition();
        pt2.setDuration(Duration.millis(200));
        pt2.setPath(circle2);
        pt2.setNode(label2);
        pt2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt2.setCycleCount(Timeline.INDEFINITE);
        pt2.setAutoReverse(false);
        pt2.play(); // Start animation
        circle2.setOnMousePressed(e -> pt2.pause());
        circle2.setOnMouseReleased(e -> pt2.play());
        Pane pane3 = new StackPane();
        Circle circle3 = new Circle(1150, 50, 1);
        circle3.setFill(Color.AZURE);
        Label label3 = new Label("******");
        label3.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label3.setTextFill(Color.CRIMSON);
        pane3.getChildren().addAll(circle3, label3);
        PathTransition pt3 = new PathTransition();
        pt3.setDuration(Duration.millis(200));
        pt3.setPath(circle3);
        pt3.setNode(label3);
        pt3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt3.setCycleCount(Timeline.INDEFINITE);
        pt3.setAutoReverse(false);
        pt3.play(); // Start animation
        circle3.setOnMousePressed(e -> pt3.pause());
        circle3.setOnMouseReleased(e -> pt3.play());
        Pane pane4 = new StackPane();
        Circle circle4 = new Circle(50, 750, 1);
        circle4.setFill(Color.AZURE);
        Label label4 = new Label("******");
        label4.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label4.setTextFill(Color.CRIMSON);
        pane4.getChildren().addAll(circle4, label4);
        PathTransition pt4 = new PathTransition();
        pt4.setDuration(Duration.millis(200));
        pt4.setPath(circle4);
        pt4.setNode(label4);
        pt4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt4.setCycleCount(Timeline.INDEFINITE);
        pt4.setAutoReverse(false);
        pt4.play(); // Start animation
        circle4.setOnMousePressed(e -> pt4.pause());
        circle4.setOnMouseReleased(e -> pt4.play());
        Pane paneg = new Pane();
        paneg.setStyle("-fx-background-color: lemonchiffon");
        paneg.getChildren().addAll(pane1, pane2, pane3, pane4, game_7);

        Scene scene = new Scene(paneg, 1200, 800);
        dorama_Stage7.setTitle("Seventh Page");
        dorama_Stage7.setScene(scene); // Place the scene in the stage
        dorama_Stage7.show();

        fname.setOnAction(e -> {
            list.add(fname.getText());
            System.out.println(this.gamerName + list.toString());
            ninth(dorama_Stage7);
            action++;
            fantasy++;
            historical++;

        });
        sn.setOnAction(e -> {
            list.add(sn.getText());
            System.out.println(this.gamerName + list.toString());
            ninth(dorama_Stage7);
            mektep++;
            sport++;

        });
    }


    private void ninth(Stage dorama_Stage9) {

        String name = gamerName;
        String soylem1 = ", you like watching dorama";
        String soylem2 = "\nYour selected dramas are shown below: \n";
        String soylem3 = "\nScores of doramas:\n";
        String score = "action - " + action + "\nfantasy - " + fantasy + "\nhistorical - " + historical + "\nschool - " + mektep + "\nsport - " + sport;

        int[] mas = {action, fantasy, historical, mektep, sport};
        int i;
        int max = mas[0];
        for (i = 1; i < mas.length; i++)
            if (mas[i] > max)
                max = mas[i];


        if (action == max) {
            result = "action";
        }
        if (fantasy == max) {
            result = "fantasy";
        }
        if (historical == max) {
            result = "historical";
        }
        if (mektep == max) {
            result = "about school";
        }
        if (sport == max) {
            result = "about sport";
        }

        String soylem4 = "\nBased on the test results, you like the genre of romantic drama, comedy and " + result;

        String songy1 = name + soylem1 + soylem2 + list + soylem4;
        Label lab1 = new Label(songy1);
        lab1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        lab1.setTextFill(Color.RED);
        lab1.setPadding(new Insets(250, 200, 200, 80));
        String songy2 = soylem3 + score;
        Label lab2 = new Label(songy2);
        lab2.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 18));
        lab2.setTextFill(Color.RED);
        lab2.setPadding(new Insets(325, 200, 200, 80));


        Pane pane1 = new StackPane();
        Circle circle1 = new Circle(50, 50, 1);
        circle1.setFill(Color.AZURE);
        Label label1 = new Label("******");
        label1.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label1.setTextFill(Color.CRIMSON);
        pane1.getChildren().addAll(circle1, label1);
        PathTransition pt1 = new PathTransition();
        pt1.setDuration(Duration.millis(200));
        pt1.setPath(circle1);
        pt1.setNode(label1);
        pt1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt1.setCycleCount(Timeline.INDEFINITE);
        pt1.setAutoReverse(false);
        pt1.play(); // Start animation
        circle1.setOnMousePressed(e -> pt1.pause());
        circle1.setOnMouseReleased(e -> pt1.play());
        Pane pane2 = new StackPane();
        Circle circle2 = new Circle(1150, 750, 1);
        circle2.setFill(Color.AZURE);
        Label label2 = new Label("******");
        label2.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label2.setTextFill(Color.CRIMSON);
        pane2.getChildren().addAll(circle2, label2);
        PathTransition pt2 = new PathTransition();
        pt2.setDuration(Duration.millis(200));
        pt2.setPath(circle2);
        pt2.setNode(label2);
        pt2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt2.setCycleCount(Timeline.INDEFINITE);
        pt2.setAutoReverse(false);
        pt2.play(); // Start animation
        circle2.setOnMousePressed(e -> pt2.pause());
        circle2.setOnMouseReleased(e -> pt2.play());
        Pane pane3 = new StackPane();
        Circle circle3 = new Circle(1150, 50, 1);
        circle3.setFill(Color.AZURE);
        Label label3 = new Label("******");
        label3.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label3.setTextFill(Color.CRIMSON);
        pane3.getChildren().addAll(circle3, label3);
        PathTransition pt3 = new PathTransition();
        pt3.setDuration(Duration.millis(200));
        pt3.setPath(circle3);
        pt3.setNode(label3);
        pt3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt3.setCycleCount(Timeline.INDEFINITE);
        pt3.setAutoReverse(false);
        pt3.play(); // Start animation
        circle3.setOnMousePressed(e -> pt3.pause());
        circle3.setOnMouseReleased(e -> pt3.play());
        Pane pane4 = new StackPane();
        Circle circle4 = new Circle(50, 750, 1);
        circle4.setFill(Color.AZURE);
        Label label4 = new Label("******");
        label4.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 30));
        label4.setTextFill(Color.CRIMSON);
        pane4.getChildren().addAll(circle4, label4);
        PathTransition pt4 = new PathTransition();
        pt4.setDuration(Duration.millis(200));
        pt4.setPath(circle4);
        pt4.setNode(label4);
        pt4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt4.setCycleCount(Timeline.INDEFINITE);
        pt4.setAutoReverse(false);
        pt4.play(); // Start animation
        circle4.setOnMousePressed(e -> pt4.pause());
        circle4.setOnMouseReleased(e -> pt4.play());

        Circle c1=new Circle();
        c1.setRadius(10);
        c1.setFill(Color.AQUA);
        Circle c2=new Circle();
        c2.setRadius(10);
        c2.setFill(Color.DARKRED);
        Circle c3=new Circle();
        c3.setRadius(10);
        c3.setFill(Color.GREENYELLOW);
        Circle c4=new Circle();
        c4.setRadius(10);
        c4.setFill(Color.DARKGOLDENROD);
        Circle c5=new Circle();
        c5.setRadius(10);
        c5.setFill(Color.CORNFLOWERBLUE);
        pane4.getChildren().addAll(c1, c2, c3, c4, c5);

        PathTransition a=new PathTransition(Duration.millis(2000),new Line(0,0,1000,800),c1);
        a.setCycleCount(Timeline.INDEFINITE);
        a.setAutoReverse(true);
        a.play();
        PathTransition b=new PathTransition(Duration.millis(2500),new Line(150,0,800,900),c2);
        b.setCycleCount(Timeline.INDEFINITE);
        b.setAutoReverse(true);
        b.play();
        PathTransition c=new PathTransition(Duration.millis(3000),new Line(1000,0,0,800),c3);
        c.setCycleCount(Timeline.INDEFINITE);
        c.setAutoReverse(true);
        c.play();
        PathTransition d=new PathTransition(Duration.millis(2300),new Line(250,0,150,800),c4);
        d.setCycleCount(Timeline.INDEFINITE);
        d.setAutoReverse(true);
        d.play();
        PathTransition f=new PathTransition(Duration.millis(2300),new Line(0,130,800,600),c5);
        f.setCycleCount(Timeline.INDEFINITE);
        f.setAutoReverse(true);
        f.play();

        Pane paneg = new Pane();
        paneg.setStyle("-fx-background-color: lightyellow");
        paneg.getChildren().addAll(pane1, pane2, pane3, pane4,lab1,lab2);

        Scene scene = new Scene(paneg, 1200, 800);
        dorama_Stage9.setTitle("Result");
        dorama_Stage9.setScene(scene); // Place the scene in the stage
        dorama_Stage9.show();



    }
}





