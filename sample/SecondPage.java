package sample;

import java.io.File;
import java.util.ArrayList;

import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
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

public class SecondPage {
    String gamerName;
    public SecondPage(String gamerName) {
        this.gamerName = gamerName;
    }

    public void secondScene(Stage primaryStage) throws Exception {

        HBox secondPage = new HBox();
        //ANIME
        VBox anime = new VBox();
        Label animeText = new Label("Anime");
      //  File linkAnime = new File("sample/video/Anime.mp4");
        anime.setStyle("-fx-background-color: #0dc6c6");
      //  anime = setContent(anime,animeText,linkAnime);
         anime = setContent(anime,animeText);

        animeText.setOnMouseClicked(e->{
                    AnimeStage nextPane = new AnimeStage();
                    nextPane.gamerName = this.gamerName;
                    nextPane.AnimeScene1(primaryStage);
                }
        );

        //DORAMA
        VBox movie = new VBox();
        Label movieText = new Label("Movie");
        movie.setStyle("-fx-background-color: #3d44c1");
      //  File linkMovie = new File("sample/video/MovieA.mp4");
       // movie = setContent(movie,movieText,linkMovie);
        movie = setContent(movie,movieText);
        movieText.setOnMouseClicked(e->{
                    Movie nextPane = new Movie();
                    nextPane.gamerName = this.gamerName;
                    try {
                        nextPane.start(primaryStage);
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
        );
        //Movies
        VBox doram = new VBox();
        Label doramText = new Label("Dorama");
        doram.setStyle("-fx-background-color: #6b3dc1");
      //  File linkDorama = new File("sample/video/doram.mp4");
      //  doram = setContent(doram,doramText,linkDorama);
        doram = setContent(doram,doramText);
        doramText.setOnMouseClicked(e->{
                    Dorama nextPane = new Dorama();
                    nextPane.gamerName = this.gamerName;
                    nextPane.start(primaryStage);
                }
        );
        //ADDING HBOXES
        secondPage.getChildren().addAll(anime,doram,movie);

        Scene scene = new Scene(secondPage, 900, 350);
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();
    }

    private VBox setContent(VBox pane, Label text) {
        //private VBox setContent(VBox pane, Label text, File link) {
        pane.setSpacing(30);
        pane.setPadding(new Insets(20,10,20,20));
        pane.setPrefSize(300,300);
        text.setPadding(new Insets(0,0,0,60));
        text.setFont(Font.font("Times New Roman", 40));
        text.setTextFill(Color.WHITE);
        pane.getChildren().add(text);
//        MediaPlayer mPlayer = new MediaPlayer(new Media(link.toURI().toString()));
//        mPlayer.setAutoPlay(true);
//        MediaView view = new MediaView(mPlayer);
//        view.setFitWidth(250);
//        pane.getChildren().add(view);

//        Slider slVolume = new Slider();
//        slVolume.setPrefWidth(200);
//        slVolume.setMaxWidth(Region.USE_PREF_SIZE);
//        slVolume.setMinWidth(30);
//        slVolume.setValue(0);
//        mPlayer.volumeProperty().bind(slVolume.valueProperty().divide(100));
//        HBox volume = new HBox();
//        volume.getChildren().addAll(new Label("Volume"),slVolume);
//        pane.getChildren().add(volume);
        return pane;

    }


}
