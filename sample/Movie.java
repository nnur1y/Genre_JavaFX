package sample;

import java.util.ArrayList;

import javafx.animation.ParallelTransition;
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
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.paint.ImagePattern;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class Movie {
    ArrayList<String> list = new ArrayList<String>();
    String gamerName;
    int comedy;
    int action;
    int melodrama;
    int historical;
    int fantasy;
    int horror;
    String result;
    public Movie(){
        this.gamerName="not found";
    }
    public void start(Stage primaryStage) throws Exception {
        HBox film1 = new HBox();
        film1.setSpacing(30);
        film1.setPadding(new Insets(50, 100, 100, 100));
        VBox movie1 = new VBox();
        movie1.setSpacing(15);

        Image imagemov1 = new Image("sample/img/316px-Titanic_3D_Poster (1).jpg", 500, 550, false, false);

        movie1.getChildren().add(new ImageView(imagemov1));
        Button btnT = new Button("Titanic!");
        movie1.setAlignment(Pos.CENTER);
        movie1.getChildren().add(btnT);

        VBox movie2 = new VBox();
        movie2.setSpacing(15);

        Image imagemov2 = new Image("sample/img/images.jpg", 500, 550, false, false);
        movie2.getChildren().add(new ImageView(imagemov2));
        Button btnA = new Button("Mr. & Mrs. Smith!");
        movie2.setAlignment(Pos.CENTER);
        movie2.getChildren().add(btnA);
        film1.getChildren().add(movie1);
        film1.getChildren().add(movie2);
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
        Pane paneall = new Pane();
        paneall.setStyle("-fx-background-color: GRAY  ");
        paneall.getChildren().addAll(pane1, pane2, pane3, pane4, film1);

        Scene gameScene = new Scene(paneall, 1200, 800);
        primaryStage.setTitle("Movie");
        primaryStage.setScene(gameScene); // Place the scene in the stage
        primaryStage.show();

        btnT.setOnAction(e -> {
            list.add(btnT.getText());
            System.out.println(gamerName + list.toString());
            met_1(primaryStage);
            melodrama++;
        });
        btnA.setOnAction(e -> {
            list.add(btnA.getText());
            System.out.println(gamerName + list.toString());
            met_1(primaryStage);
            action++;
        });
    }
      public void met_1(Stage filmStage) {
          HBox film1 = new HBox();
          film1.setSpacing(30);
          film1.setPadding(new Insets(50, 100, 100, 100));
          VBox movie1 = new VBox();
          movie1.setSpacing(15);

          Image imagemov1 = new Image("sample/img/Me_Before_You_(film).jpg", 500, 550, false, false);

          movie1.getChildren().add(new ImageView(imagemov1));
          Button btnT = new Button("Me Before You!");
          movie1.setAlignment(Pos.CENTER);
          movie1.getChildren().add(btnT);

          VBox movie2 = new VBox();
          movie2.setSpacing(15);

          Image imagemov2 = new Image("sample/img/It_(2017)_poster.jpg", 500, 550, false, false);
          movie2.getChildren().add(new ImageView(imagemov2));
          Button btnA = new Button("It!");
          movie2.setAlignment(Pos.CENTER);
          movie2.getChildren().add(btnA);
          film1.getChildren().add(movie1);
          film1.getChildren().add(movie2);
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
          Pane paneall = new Pane();
          paneall.setStyle("-fx-background-color:beige ");
          paneall.getChildren().addAll(pane1, pane2, pane3, pane4, film1);

          Scene gameScene = new Scene(paneall, 1200, 800);
          filmStage.setTitle("Movie");
          filmStage.setScene(gameScene); // Place the scene in the stage
          filmStage.show();

          btnT.setOnAction(e -> {
              list.add(btnT.getText());
              System.out.println(gamerName + list.toString());
              met_2(filmStage);
              melodrama++;

          });
          btnA.setOnAction(e -> {
              list.add(btnA.getText());
              System.out.println(gamerName + list.toString());
              met_2(filmStage);
              horror++;
          });
      }

            private void met_2(Stage filmStage){
                HBox film1 = new HBox();
                film1.setSpacing(30);
                film1.setPadding(new Insets(50, 100, 100, 100));
                VBox movie1 = new VBox();
                movie1.setSpacing(15);

                Image imagemov1 = new Image("sample/img/hustle.jpg", 500, 550, false, false);

                movie1.getChildren().add(new ImageView(imagemov1));
                Button btnT = new Button("The Hustle!");
                movie1.setAlignment(Pos.CENTER);
                movie1.getChildren().add(btnT);

                VBox movie2 = new VBox();
                movie2.setSpacing(15);

                Image imagemov2 = new Image("sample/img/Gla.jpg", 500, 550, false, false);
                movie2.getChildren().add(new ImageView(imagemov2));
                Button btnA = new Button("Gladiator!");
                movie2.setAlignment(Pos.CENTER);
                movie2.getChildren().add(btnA);
                film1.getChildren().add(movie1);
                film1.getChildren().add(movie2);
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
                Pane paneall = new Pane();
                paneall.setStyle("-fx-background-color: BLANCHEDALMOND ");
                paneall.getChildren().addAll(pane1, pane2, pane3, pane4, film1);

                Scene gameScene = new Scene(paneall, 1200, 800);
                filmStage.setTitle("Movie");
                filmStage.setScene(gameScene); // Place the scene in the stage
                filmStage.show();

                btnT.setOnAction(e -> {
                    list.add(btnT.getText());
                    System.out.println(gamerName + list.toString());
                    met_3(filmStage);
                    comedy++;
                });
                btnA.setOnAction(e -> {
                    list.add(btnA.getText());
                    System.out.println(gamerName + list.toString());
                    met_3(filmStage);
                    historical++;
                });
            }
            private void met_3(Stage filmStage) {
                HBox film1 = new HBox();
                film1.setSpacing(30);
                film1.setPadding(new Insets(50, 100, 100, 100));
                VBox movie1 = new VBox();
                movie1.setSpacing(15);

                Image imagemov1 = new Image("sample/img/tomiris-photo-relaxposter.jpg", 500, 550, false, false);

                movie1.getChildren().add(new ImageView(imagemov1));
                Button btnT = new Button("Tomiris!");
                movie1.setAlignment(Pos.CENTER);
                movie1.getChildren().add(btnT);

                VBox movie2 = new VBox();
                movie2.setSpacing(15);

                Image imagemov2 = new Image("sample/img/biznes.jpg", 500, 550, false, false);
                movie2.getChildren().add(new ImageView(imagemov2));
                Button btnA = new Button("Biznes po kazakhski!");
                movie2.setAlignment(Pos.CENTER);
                movie2.getChildren().add(btnA);
                film1.getChildren().add(movie1);
                film1.getChildren().add(movie2);
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
                Pane paneall = new Pane();
                paneall.setStyle("-fx-background-color: cadetblue");
                paneall.getChildren().addAll(pane1, pane2, pane3, pane4, film1);

                Scene gameScene = new Scene(paneall, 1200, 800);
                filmStage.setTitle("Movie");
                filmStage.setScene(gameScene); // Place the scene in the stage
                filmStage.show();


                btnT.setOnAction(e -> {
                    list.add(btnT.getText());
                    System.out.println(gamerName + list.toString());
                    met_4(filmStage);
                    historical++;
                });
                btnA.setOnAction(e -> {
                    list.add(btnA.getText());
                    System.out.println(gamerName + list.toString());
                    met_4(filmStage);
                    comedy++;
                });
            }
            private void met_4(Stage filmStage){
            HBox film1 = new HBox();
            film1.setSpacing(30);
            film1.setPadding(new Insets(50, 100, 100, 100));
            VBox movie1 = new VBox();
            movie1.setSpacing(15);

            Image imagemov1 = new Image("sample/img/home.jpg", 500, 550, false, false);

            movie1.getChildren().add(new ImageView(imagemov1));
            Button btnT = new Button("Home Alone!");
            movie1.setAlignment(Pos.CENTER);
            movie1.getChildren().add(btnT);

            VBox movie2 = new VBox();
            movie2.setSpacing(15);

            Image imagemov2 = new Image("sample/img/Deathly_Hallows_1_poster.jpg", 500, 550, false, false);
            movie2.getChildren().add(new ImageView(imagemov2));
            Button btnA = new Button("Harry Potter!");
            movie2.setAlignment(Pos.CENTER);
            movie2.getChildren().add(btnA);
            film1.getChildren().add(movie1);
            film1.getChildren().add(movie2);
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
                Pane paneall = new Pane();
                paneall.setStyle("-fx-background-color: burlywood ");
                paneall.getChildren().addAll(pane1, pane2, pane3, pane4, film1);

                Scene gameScene = new Scene(paneall, 1200, 800);
                filmStage.setTitle("Movie");
                filmStage.setScene(gameScene); // Place the scene in the stage
                filmStage.show();

                btnT.setOnAction(e -> {
            list.add(btnT.getText());
            System.out.println(gamerName + list.toString());
            met_5(filmStage);
            comedy++;
        });
            btnA.setOnAction(e -> {
            list.add(btnA.getText());
            System.out.println(gamerName + list.toString());
            met_5(filmStage);
            fantasy++;
        });

    }
         private void met_5(Stage filmStage){
             HBox film1 = new HBox();
             film1.setSpacing(30);
             film1.setPadding(new Insets(50, 100, 100, 100));
             VBox movie1 = new VBox();
             movie1.setSpacing(15);

             Image imagemov1 = new Image("sample/img/Final.jpg", 500, 550, false, false);

             movie1.getChildren().add(new ImageView(imagemov1));
             Button btnT = new Button("Final Destination");
             movie1.setAlignment(Pos.CENTER);
             movie1.getChildren().add(btnT);

             VBox movie2 = new VBox();
             movie2.setSpacing(15);

             Image imagemov2 = new Image("sample/img/Avatar-Teaser-Poster.jpg", 500, 550, false, false);
             movie2.getChildren().add(new ImageView(imagemov2));
             Button btnA = new Button("Avatar");
             movie2.setAlignment(Pos.CENTER);
             movie2.getChildren().add(btnA);
             film1.getChildren().add(movie1);
             film1.getChildren().add(movie2);
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
             Pane paneall = new Pane();
             paneall.setStyle("-fx-background-color:  dimgray ");
             paneall.getChildren().addAll(pane1, pane2, pane3, pane4, film1);

             Scene gameScene = new Scene(paneall, 1200, 800);
             filmStage.setTitle("Movie");
             filmStage.setScene(gameScene); // Place the scene in the stage
             filmStage.show();


             btnT.setOnAction(e -> {
                 list.add(btnT.getText());
                 System.out.println(gamerName + list.toString());
                 met_6(filmStage);
                 horror++;
             });
             btnA.setOnAction(e -> {
                 list.add(btnA.getText());
                 System.out.println(gamerName + list.toString());
                 met_6(filmStage);
                 fantasy++;
             });

         }
    private void met_6(Stage filmStage){
        HBox film1 = new HBox();
        film1.setSpacing(30);
        film1.setPadding(new Insets(50, 100, 100, 100));
        VBox movie1 = new VBox();
        movie1.setSpacing(15);

        Image imagemov1 = new Image("sample/img/divergent.jpg", 500, 550, false, false);

        movie1.getChildren().add(new ImageView(imagemov1));
        Button btnT = new Button("Divergent!");
        movie1.setAlignment(Pos.CENTER);
        movie1.getChildren().add(btnT);

        VBox movie2 = new VBox();
        movie2.setSpacing(15);

        Image imagemov2 = new Image("sample/img/pride.jpg", 500, 550, false, false);
        movie2.getChildren().add(new ImageView(imagemov2));
        Button btnA = new Button("Pride and Prejudice!");
        movie2.setAlignment(Pos.CENTER);
        movie2.getChildren().add(btnA);
        film1.getChildren().add(movie1);
        film1.getChildren().add(movie2);
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
        Pane paneall = new Pane();
        paneall.setStyle("-fx-background-color: FLORALWHITE");
        paneall.getChildren().addAll(pane1, pane2, pane3, pane4, film1);

        Scene gameScene = new Scene(paneall, 1200, 800);
        filmStage.setTitle("Movie");
        filmStage.setScene(gameScene); // Place the scene in the stage
        filmStage.show();
        btnT.setOnAction(e -> {
            list.add(btnT.getText());
            System.out.println(gamerName + list.toString());
            met_7(filmStage);
            action++;
        });
        btnA.setOnAction(e -> {
            list.add(btnA.getText());
            System.out.println(gamerName + list.toString());
            met_7(filmStage);
            melodrama++;
        });

    }
    private void met_7(Stage film){
        int[] mas = {action, fantasy,historical,comedy,melodrama,horror};
        int i;
        int max= mas[0];
        for(i=1; i<mas.length;i++)
            if(mas[i]>max)
                max=mas[i];


        if(action==max){
            result = "action";}
        if(fantasy==max){
            result = "fantasy"; }
        if(historical==max){
            result = "historical"; }
        if(comedy==max){
            result = "comedy"; }
        if(melodrama==max){
            result = "melodrama"; }
        if(horror==max){
            result="horror";  }
        Pane pane1 = new StackPane();
        Circle circle1 = new Circle(50, 50, 1);
        circle1.setFill(Color.AZURE);
        Label label1 = new Label("******");
        label1.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 18));
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
                FontWeight.BOLD, FontPosture.ITALIC, 18));
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
        Pane paneall = new Pane();
        String name=this.gamerName;
        Label l1=new Label(name+", you like watching movie!");
        l1.setFont(Font.font("Times New Roman", FontWeight.EXTRA_LIGHT,FontPosture.ITALIC,40));
        l1.setPadding(new Insets(250,400,200,400));
        paneall.getChildren().add(l1);
        Label l=new Label(name+" you are a lover of "+result+"!");
        l.setFont(Font.font("Times New Roman", FontWeight.EXTRA_LIGHT,FontPosture.ITALIC,40));
        BackgroundImage last = new BackgroundImage(new Image("sample/img/52d2c3dc77dccbf34d5e17dda50f0c6a (1).jpg"),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                new BackgroundSize(1.0, 1.0, true, true, false, false));
        l.setPadding(new Insets(300,400,200,400));
        paneall.getChildren().add(l);
        String s2="\nScores of movies:\n";
        String s3="comedy-"+comedy + "" + "\naction-"+action + "\nmelodrama-"+melodrama + "" + "\nhistorical-"+historical + "\nfantasy-"+fantasy + "\nhorror-"+horror;
        Label las=new Label(s2+s3);
        las.setFont(Font.font("Times New Roman", FontWeight.EXTRA_LIGHT,FontPosture.ITALIC,25));
        las.setPadding(new Insets(330,400,200,400));
        paneall.getChildren().add(las);
        paneall.setBackground(new Background(last));
        paneall.getChildren().addAll(pane1, pane2, pane3, pane4);
        Scene gameScene = new Scene(paneall, 1200, 800);
        film.setScene(gameScene);
        film.show();

    }
}

