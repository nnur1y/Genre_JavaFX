package sample;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;


public class AnimeStage {
    ArrayList<String> gamerAnswer = new ArrayList<String>();
    public String gamerName;
    int school =0;
    int romantika=0;
    int drama =0;
    int meha=0;
    int comedy =0;
    int shounen =0;
    int sport =0;
    int adventure=0;
    int fantasy=0;
    int povsednevnost = 0;


    public AnimeStage(){
        this.gamerName="not found";
    }
    private VBox setContent(VBox pane, Image image, Button btn) {
            pane.getChildren().add(new ImageView(image));
            pane.setAlignment(Pos.CENTER);
            pane.getChildren().add(btn);
            pane.setSpacing(15);
        return pane;
    }
    public void AnimeScene1(Stage gameStage){
        VBox gameInside_1 = new VBox();
        Image imageGame_1 = new Image("sample/img/log_horizon.jpg");
        Button btn1 =new Button("Log Horizon");
        gameInside_1 = setContent(gameInside_1,imageGame_1,btn1);

        VBox gameInside_2 = new VBox();
        Image imageGame_2 = new Image("sample/img/haikuu.jpg");
        Button btn2 =new Button("haikuu");
        gameInside_2=setContent(gameInside_2,imageGame_2,btn2);


        HBox game_1 = new HBox();
        game_1.setPadding(new Insets(10, 100, 100, 100));
        game_1.getChildren().add(gameInside_1);
        game_1.getChildren().add(gameInside_2);
        game_1.setStyle("-fx-background-color: #dbffda");

        Scene gameScene = new Scene(game_1, 800, 500);
        gameStage.setScene(gameScene); // Place the scene in the stage
        gameStage.show();

        btn1.setOnAction(e->{
            gamerAnswer.add(btn1.getText());
            fantasy++;
            adventure++;
            AnimeScene2(gameStage);
        });
        btn2.setOnAction(e->{
            gamerAnswer.add(btn2.getText());
            sport++;
            shounen++;
            school++;
            comedy++;
            AnimeScene2(gameStage);
        });
    }

    public void AnimeScene2(Stage gameStage){
        VBox gameInside_1 = new VBox();
        Image imageGame_1 = new Image("sample/img/The Irregular.jpg");
        Button btn1 =new Button("The Irregular");
        gameInside_1 = setContent(gameInside_1,imageGame_1,btn1);

        VBox gameInside_2 = new VBox();
        Image imageGame_2 = new Image("sample/img/arifureta.jpg");
        Button btn2 =new Button("Arifureta");
        gameInside_2 = setContent(gameInside_2,imageGame_2,btn2);


        HBox game_1 = new HBox();
        game_1.setPadding(new Insets(10, 100, 100, 100));
        game_1.getChildren().add(gameInside_1);
        game_1.getChildren().add(gameInside_2);
        game_1.setStyle("-fx-background-color: #dcfdfa");
        Scene gameScene = new Scene(game_1, 800, 500);
        gameStage.setScene(gameScene); // Place the scene in the stage
        gameStage.show();

        btn1.setOnAction(e->{
            gamerAnswer.add(btn1.getText());
            school++;
            shounen++;
            fantasy++;
            adventure++;
            AnimeScene3(gameStage);
        });
        btn2.setOnAction(e->{
            gamerAnswer.add(btn2.getText());
            adventure++;
            fantasy++;
            AnimeScene3(gameStage);
        });
    }
    public void AnimeScene3(Stage gameStage){
        VBox gameInside_1 = new VBox();
        Image imageGame_1 = new Image("sample/img/kami.jpg");
        Button btn1 =new Button("By the Grace of the Gods");
        gameInside_1 = setContent(gameInside_1,imageGame_1,btn1);

        VBox gameInside_2 = new VBox();
        Image imageGame_2 = new Image("sample/img/Weathering with You.jpg");
        Button btn2 =new Button("Weathering with You");
        gameInside_2 = setContent(gameInside_2,imageGame_2,btn2);


        HBox game_1 = new HBox();
        game_1.setPadding(new Insets(10, 100, 100, 100));
        game_1.getChildren().add(gameInside_1);
        game_1.getChildren().add(gameInside_2);
        game_1.setStyle("-fx-background-color: #e5ffe3");

        Scene gameScene = new Scene(game_1, 800, 500);
        gameStage.setScene(gameScene); // Place the scene in the stage
        gameStage.show();

        btn1.setOnAction(e->{
            gamerAnswer.add(btn1.getText());
            povsednevnost++;
            fantasy++;
            AnimeScene4(gameStage);
        });
        btn2.setOnAction(e->{
            gamerAnswer.add(btn2.getText());
            drama++;
            povsednevnost++;
            romantika++;
            fantasy++;
            AnimeScene4(gameStage);
        });
    }
    public void AnimeScene4(Stage gameStage){
        VBox gameInside_1 = new VBox();
        Image imageGame_1 = new Image("sample/img/Fairy Tail.jpg");
        Button btn1 =new Button("Fairy Tail");
        gameInside_1 = setContent(gameInside_1,imageGame_1,btn1);

        VBox gameInside_2 = new VBox();
        Image imageGame_2 = new Image("sample/img/Hyouka.jpg");
        Button btn2 =new Button("Hyouka");
        gameInside_2 = setContent(gameInside_2,imageGame_2,btn2);


        HBox game_1 = new HBox();
        game_1.setPadding(new Insets(10, 100, 100, 100));
        game_1.getChildren().add(gameInside_1);
        game_1.getChildren().add(gameInside_2);
        game_1.setStyle("-fx-background-color: #e2dafc");
        Scene gameScene = new Scene(game_1, 800, 500);
        gameStage.setScene(gameScene); // Place the scene in the stage
        gameStage.show();

        btn1.setOnAction(e->{
            gamerAnswer.add(btn1.getText());
            adventure++;
            comedy++;
            shounen++;
            fantasy++;
            AnimeScene5(gameStage);
        });
        btn2.setOnAction(e->{
            gamerAnswer.add(btn2.getText());
            povsednevnost++;
            romantika++;
            AnimeScene5(gameStage);
        });
    }
    public void AnimeScene5(Stage gameStage){
        VBox gameInside_1 = new VBox();
        Image imageGame_1 = new Image("sample/img/Blade of Demon Destruction.jpg");
        Button btn1 =new Button("Blade of Demon Destruction");
        gameInside_1 = setContent(gameInside_1,imageGame_1,btn1);

        VBox gameInside_2 = new VBox();
        Image imageGame_2 = new Image("sample/img/Mirai Nikki.jpg");
        Button btn2 =new Button("Mirai Nikki");
        gameInside_2 = setContent(gameInside_2,imageGame_2,btn2);


        HBox game_1 = new HBox();
        game_1.setPadding(new Insets(10, 100, 100, 100));
        game_1.getChildren().add(gameInside_1);
        game_1.getChildren().add(gameInside_2);
        game_1.setStyle("-fx-background-color: #d2dcfd");
        Scene gameScene = new Scene(game_1, 800, 500);
        gameStage.setScene(gameScene); // Place the scene in the stage
        gameStage.show();

        btn1.setOnAction(e->{
            gamerAnswer.add(btn1.getText());
            adventure++;
            shounen++;
            fantasy++;
            AnimeScene6(gameStage);
        });
        btn2.setOnAction(e->{
            gamerAnswer.add(btn2.getText());
            drama++;
            AnimeScene6(gameStage);
        });
    }

    public void AnimeScene6(Stage gameStage){
        VBox gameInside_1 = new VBox();
        Image imageGame_1 = new Image("sample/img/Special A.jpg");
        Button btn1 =new Button(" Special A");
        gameInside_1 = setContent(gameInside_1,imageGame_1,btn1);

        VBox gameInside_2 = new VBox();
        Image imageGame_2 = new Image("sample/img/Fullmetal Alchemist.jpg");
        Button btn2 =new Button(" Fullmetal Alchemist");
        gameInside_2 = setContent(gameInside_2,imageGame_2,btn2);


        HBox game_1 = new HBox();
        game_1.setPadding(new Insets(10, 100, 100, 100));
        game_1.getChildren().add(gameInside_1);
        game_1.getChildren().add(gameInside_2);
        game_1.setStyle("-fx-background-color: #ffe6e6");
        Scene gameScene = new Scene(game_1, 800, 500);
        gameStage.setScene(gameScene); // Place the scene in the stage
        gameStage.show();

        btn1.setOnAction(e->{
            gamerAnswer.add(btn1.getText());
            adventure++;
            fantasy++;
            AnimeScene7(gameStage);
        });
        btn2.setOnAction(e->{
            gamerAnswer.add(btn2.getText());
            drama++;
            AnimeScene7(gameStage);
        });
    }

    public void AnimeScene7(Stage gameStage){
        VBox gameInside_1 = new VBox();
        Image imageGame_1 = new Image("sample/img/Aldnoah.Zero.png");
        Button btn1 =new Button("Aldnoah.Zero");
        gameInside_1 = setContent(gameInside_1,imageGame_1,btn1);

        VBox gameInside_2 = new VBox();
        Image imageGame_2 = new Image("sample/img/Koe no Katachi.jpg");
        Button btn2 =new Button("Koe no Katachi ");
        gameInside_2 = setContent(gameInside_2,imageGame_2,btn2);


        HBox game_1 = new HBox();
        game_1.setPadding(new Insets(10, 100, 100, 100));
        game_1.getChildren().add(gameInside_1);
        game_1.getChildren().add(gameInside_2);
        game_1.setStyle("-fx-background-color: #f9ffdd");
        Scene gameScene = new Scene(game_1, 800, 500);
        gameStage.setScene(gameScene); // Place the scene in the stage
        gameStage.show();

        btn1.setOnAction(e->{
            gamerAnswer.add(btn1.getText());
            meha++;
            adventure++;
            fantasy++;
            AnimeScene8(gameStage);
        });
        btn2.setOnAction(e->{
            gamerAnswer.add(btn2.getText());
            drama++;
            school++;
            AnimeScene8(gameStage);
        });
    }

    public void AnimeScene8(Stage gameStage){
        VBox gameInside_1 = new VBox();
        Image imageGame_1 = new Image("sample/img/Attack on Titan.jpg");
        Button btn1 =new Button("Attack on Titan");
        gameInside_1 = setContent(gameInside_1,imageGame_1,btn1);

        VBox gameInside_2 = new VBox();
        Image imageGame_2 = new Image("sample/img/Maid-sama!.jpg");
        Button btn2 =new Button("Maid-sama!");
        gameInside_2 = setContent(gameInside_2,imageGame_2,btn2);


        HBox game_1 = new HBox();
        game_1.setPadding(new Insets(10, 100, 100, 100));
        game_1.getChildren().add(gameInside_1);
        game_1.getChildren().add(gameInside_2);
        game_1.setStyle("-fx-background-color: #c4fff7");
        Scene gameScene = new Scene(game_1, 800, 500);
        gameStage.setScene(gameScene); // Place the scene in the stage
        gameStage.show();

        btn1.setOnAction(e->{
            gamerAnswer.add(btn1.getText());
            drama++;
            adventure++;
            fantasy++;

        });
        btn2.setOnAction(e->{
            gamerAnswer.add(btn2.getText());
            drama++;
            school++;
        });
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(school);
        res.add(romantika);
        res.add(drama);
        res.add(meha);
        res.add(comedy);
        res.add(shounen);
        res.add(sport);
        res.add(adventure);
        res.add(fantasy);
        res.add(povsednevnost);
        /*
        int school =0;
        int romantika=0;
        int drama =0;
        int meha=0;
        int comedy =0;
        int shounen =0;
        int sport =0;
        int adventure=0;
        int fantasy=0;
        int povsednevnost = 0;*/
        System.out.println(res.toString());
    }
    public void result(Stage stage){

    }

}
