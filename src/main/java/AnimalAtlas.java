import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class AnimalAtlas extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Top

        Font font = Font.font("Times New Roman", FontWeight.BOLD, 40);
        // System.out.println(Font.getFamilies());
        Color color = Color.web("#CC0050"); //hex color

        Label label = new Label("Animal Atlas");
        label.setLayoutX(10);
        label.setLayoutY(35);
        label.setFont(font);
        label.setTextFill(color);
        label.setMaxWidth(300);
        label.setWrapText(true);
        label.setRotate(0);

        // Left
        Button anaconda = new Button("Anaconda");
        Button bear = new Button("Bear");
        Button cat = new Button("Cat");
        Button donkey = new Button("Donkey");

        VBox vBox = new VBox();
        vBox.getChildren().add(anaconda);
        vBox.getChildren().add(bear);
        vBox.getChildren().add(cat);
        vBox.getChildren().add(donkey);

        // Pictures

        Image anakondaobrazek = new Image("anakonda.png");
        Image bearobrazek = new Image("bear.png");
        Image catobrazek = new Image("cat.png");
        Image donkeyobrazek = new Image("donkey.png");

        ImageView imageView = new ImageView(anakondaobrazek);
        imageView.setFitHeight(120);
        imageView.setFitWidth(120);

        ImageView imageView1 = new ImageView(bearobrazek);
        imageView1.setFitHeight(150);
        imageView1.setFitWidth(200);

        ImageView imageView2 = new ImageView(catobrazek);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(100);

        ImageView imageView3 = new ImageView(donkeyobrazek);
        imageView3.setFitHeight(150);
        imageView3.setFitWidth(200);

        // Przyciski

        anaconda.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                anaconda.setGraphic(imageView);


            }
        });

        bear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                bear.setGraphic(imageView1);
            }
        });

        cat.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cat.setGraphic(imageView2);
            }
        });

        donkey.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                donkey.setGraphic(imageView3);
            }
        });







        // BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(label);
        borderPane.setLeft(vBox);
        // borderPane.setCenter(catobrazek);




        //Group
        //Group group = new Group();
        //group.getChildren().add(label);



        Scene scene = new Scene(borderPane, 900, 700);

        primaryStage.setScene(scene);
        primaryStage.setTitle("AnimalAtlas");
        primaryStage.show();

    }
}
