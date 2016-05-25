package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.List;
import java.util.Random;

import static java.lang.Math.*;

/**
 * Created by Ekaterina on 15.05.2016.
 */
public class FlyKiller extends Application {


    private int windowWidth = 600;
    private int windowHeight = 600;
    private int disappear = 300;
    private Group root;

    private int labelWidth = 100;
    private int labelHeight = 50;
    private static  double destX;
    private static  double destY;
    private static int count = 0;
    private static Scene scene;
    private Timeline mainTimaline;
    private Stage mainStage;





    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("FlyKiller");
        Group root = new Group();
        Button button = new Button("Start");
        button.setMinHeight(100);
        button.setMinWidth(200);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    primaryStage.close();
                    startGame();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        root.getChildren().add(button);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void startGame() throws InterruptedException {
        mainStage = new Stage();
        root = new Group();
        mainStage.setScene(createScene());
        Canvas canvas = new Canvas(512, 512);
        root.getChildren().add(canvas);
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//        Image fon = new Image("/sample/soup.jpg");
//        gc.drawImage(fon, 0, 0);

        mainStage.setTitle("FlyKiller");
        mainStage.show();
        startAnimation();
    }


    public void startAnimation() throws InterruptedException {

        List<Node> nodeList = scene.getRoot().getChildrenUnmodifiable();
         mainTimaline  = new Timeline(
                new KeyFrame(
                        Duration.millis(2000),
                        ae -> {
                            for(Node node: nodeList){
                                SequentialTransition st = new SequentialTransition();
                                destX = random.nextInt(windowWidth - 50) - node.getLayoutX();
                                destY = random.nextInt(windowHeight - 50) - node.getLayoutY();
                                RotateTransition rt1 = new RotateTransition(Duration.millis(200), node);
                                rt1.setByAngle(setAngle());
                                st.getChildren().add(rt1);
                                TranslateTransition translateTransition = new TranslateTransition(Duration.millis(1500), node);
                                translateTransition.setToX(destX);
                                translateTransition.setToY(destY);
                                translateTransition.setAutoReverse(true);
                                st.getChildren().add(translateTransition);
                                RotateTransition rt2 = new RotateTransition(Duration.millis(200), node);
                                rt2.setToAngle(0);
                                st.getChildren().add(rt2);
                                st.play();

                            }
                        }
                )
        );

        mainTimaline.setCycleCount(Timeline.INDEFINITE);
        mainTimaline.play();
    }

    private Random random = new Random(); // нам нужен рандом!!

    private Label createLabel() {
        Label label = new Label();    // создание билдера для Label
        label.setMinWidth(labelWidth);                // возможная ширинаlabel.setMinHeight(labelHeight);                // возможная высота
        label.setAlignment(Pos.CENTER);         // выравнивание содержимого по центру
        label.setLayoutX(random.nextInt(windowWidth - 100)); // задание  коорд. Х
        label.setLayoutY(random.nextInt(windowHeight - 50));  // задание  коорд. Y
        Image image = new Image(getClass().getResourceAsStream("muha.png"));
        label.setGraphic(new ImageView(image));
        addTranslateListener(label);
        return label;
    }

    private Scene createScene() {

        for (int i = 0; i < 5; i++) {
            count++;
            root.getChildren().add(createLabel());
        }

         scene = new Scene(root, windowWidth, windowHeight);
        scene.getStylesheets().add("sample/style.css");
        return scene;

    }



    private void addTranslateListener(final Node node) {
        node.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                if (event.getButton() == MouseButton.PRIMARY) {

                    count --;
                    ParallelTransition parallelTransition = new ParallelTransition();
                    FadeTransition fadeTransition = new FadeTransition(Duration.millis(disappear), node);
                    fadeTransition.setFromValue(1.0f);
                    fadeTransition.setToValue(0);
                    parallelTransition.getChildren().add(fadeTransition);



                    parallelTransition.play();
                    Timeline timeline1 = new Timeline(
                            new KeyFrame(
                                    Duration.millis(disappear),
                                    ae -> {
                                        root.getChildren().remove(node);
                                    }
                            )
                    );
                    timeline1.play();
                    if (count == 0){
                        System.out.println("You win");
                        mainTimaline.stop();
                        mainStage.close();
                        Stage stage = new Stage();
                        stage.setTitle("");
                        Label label = new Label("Congratulations! You win!\n Start new game?");
                        label.setMinWidth(200);
                        label.setMinHeight(100);
                        label.setTextAlignment(TextAlignment.CENTER);
                        Group group = new Group();
                        Button button1 = new Button("Yes");
                        button1.setMinHeight(100);
                        button1.setMinWidth(200);
                        button1.setLayoutY(100);
                        button1.setOnAction(event1 -> {
                            try {

                                stage.close();
                                startGame();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        });

                        Button button2 = new Button("No");
                        button2.setMinHeight(100);
                        button2.setMinWidth(200);
                        button2.setLayoutY(200);
                        button2.setOnAction(event1 -> {
                            stage.close();
                        });
                        group.getChildren().add(label);
                        group.getChildren().add(button1);
                        group.getChildren().add(button2);
                        stage.setScene(new Scene(group, 200, 300));
                        stage.show();


                    }
                }

            }
        });




    };

    private double setAngle() {
        double dx1 = destX;
        double dy1 = destY;
        double l = Math.sqrt(dx1 * dx1 + dy1 * dy1);
        dx1 /= l; // нормализация
        dy1 /= l; // вектора

        double angle = PI / 2; // за второй вектор было взято
        double dx2 = sin(angle);      // единичный вектор,
        double dy2 = cos(angle);      // который повернутый на 90 градусов

        double cosA = dx1 * dx2 + dy1 * dy2;
        angle = acos(cosA);

        if (dy1 < 0) angle = PI - angle;
        return angle / PI * 180; //в градусы
    }

}
