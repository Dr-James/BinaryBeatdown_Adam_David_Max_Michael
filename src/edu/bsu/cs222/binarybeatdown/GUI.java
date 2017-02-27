package edu.bsu.cs222.binarybeatdown;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.scene.text.FontWeight.BOLD;

public class GUI extends Application {
    private Scene battleScene, menuScene;
    private Stage thestage;
    private Button startButton, firstAttackButton, secondAttackButton, thirdAttackButton, fourthAttackButton;
    private Rectangle attackOutline, screenBorder, textOutput, userStats, enemyStats, battleBorder, innerScreenBorder, MenuScreenBorder;
    private Canvas menuCanvas;
    private TextArea battleOutput;


    @Override
    public void start(Stage battleStage) {


        Pane menuPane = new Pane();
        Pane battlePane = new Pane();
        thestage=battleStage;

        configureButton();
        configureRectangle();
        configureGraphicContext();

        String userName = "USER";
        String enemyName = "ENEMY";

        Text userVersusEnemy = new Text("vs.");
        userVersusEnemy.setX(430);
        userVersusEnemy.setY(280);

        Text userNamePlacement = new Text(userName);
        userNamePlacement.setX(420);
        userNamePlacement.setY(260);

        Text enemyNamePlacement = new Text(enemyName);
        enemyNamePlacement.setX(420);
        enemyNamePlacement.setY(300);

        Canvas battleCanvas = new Canvas(800, 400);

        battleOutput = new TextArea();
        battleOutput.setEditable(false);
        battleOutput.setPrefSize(754, 64);
        battleOutput.setLayoutX(23);
        battleOutput.setLayoutY(313);
        battleOutput.setStyle("-fx-text-area-background: gray;");

        battlePane.getChildren().addAll(battleCanvas);
        battlePane.getChildren().addAll(battleBorder, attackOutline, screenBorder, textOutput, userStats, enemyStats, userVersusEnemy);
        battlePane.getChildren().addAll(firstAttackButton, secondAttackButton, thirdAttackButton, fourthAttackButton, battleOutput);
        battlePane.setStyle("-fx-background-color: gray;");

        menuPane.setStyle("-fx-background-color: gray;-fx-padding: 10px;");
        battlePane.setStyle("-fx-background-color: gray;-fx-padding: 10px;");


        menuPane.getChildren().addAll(menuCanvas, startButton, MenuScreenBorder, innerScreenBorder);

        menuScene = new Scene(menuPane, 800, 400);
        battleScene = new Scene(battlePane, 800, 400);

        battleStage.setTitle("B I N A R Y   B E A T D O W N");
        battleStage.setScene(menuScene);
        battleStage.show();








    }


    private void configureButton(){

        firstAttackButton = new Button("Attack 1");
        firstAttackButton.setStyle("-fx-border-color: #550000; -fx-border-width: 2px;");
        firstAttackButton.setLayoutX(30);
        firstAttackButton.setLayoutY(30);
        firstAttackButton.setOnAction(this::attackButtonClicked);

        secondAttackButton = new Button("Attack 2");
        secondAttackButton.setStyle("-fx-border-color: #550000; -fx-border-width: 2px;");
        secondAttackButton.setLayoutX(30);
        secondAttackButton.setLayoutY(100);
        secondAttackButton.setOnAction(this::attackButtonClicked);

        thirdAttackButton = new Button("Attack 3");
        thirdAttackButton.setStyle("-fx-border-color: #550000; -fx-border-width: 2px;");
        thirdAttackButton.setLayoutX(30);
        thirdAttackButton.setLayoutY(170);
        thirdAttackButton.setOnAction(this::attackButtonClicked);

        fourthAttackButton = new Button("Attack 4");
        fourthAttackButton.setOnAction(this::attackButtonClicked);
        fourthAttackButton.setStyle("-fx-border-color: #550000; -fx-border-width: 2px;");
        fourthAttackButton.setLayoutX(30);
        fourthAttackButton.setLayoutY(240);

        startButton=new Button("                              ");
        startButton.setOnAction(this::StartButtonClicked);
        startButton.setLayoutX(300);
        startButton.setStyle("-fx-background-color: transparent");
        startButton.setLayoutY(280);
    }





    private void configureRectangle(){

        MenuScreenBorder = new Rectangle(5, 5, 790, 390);
        MenuScreenBorder.setStroke(Paint.valueOf("Black"));
        MenuScreenBorder.setFill(null);
        MenuScreenBorder.setStrokeWidth(5);

        innerScreenBorder = new Rectangle(12, 12, 776, 376);
        innerScreenBorder.setStroke(Paint.valueOf("Black"));
        innerScreenBorder.setFill(null);
        innerScreenBorder.setStrokeWidth(1);

        attackOutline = new Rectangle(20, 20, 95, 280);
        attackOutline.setStroke(Paint.valueOf("Black"));
        attackOutline.setFill(Color.LIGHTGRAY);
        attackOutline.setStrokeWidth(2);

        screenBorder = new Rectangle(5, 5, 790, 390);
        screenBorder.setStroke(Paint.valueOf("Black"));
        screenBorder.setFill(null);
        screenBorder.setStrokeWidth(5);

        textOutput = new Rectangle(20, 310, 760, 70);
        textOutput.setStroke(Paint.valueOf("Black"));
        textOutput.setFill(Color.LIGHTGRAY);
        textOutput.setStrokeWidth(4);

        userStats = new Rectangle(125, 250, 250, 50);
        userStats.setStroke(Paint.valueOf("Black"));
        userStats.setFill(Color.LIGHTGRAY);
        userStats.setStrokeWidth(2);

        enemyStats = new Rectangle(510, 250, 270, 50);
        enemyStats.setStroke(Paint.valueOf("Black"));
        enemyStats.setFill(Color.LIGHTGRAY);
        enemyStats.setStrokeWidth(2);

        battleBorder = new Rectangle(125, 20, 655, 220);
        battleBorder.setStroke(Paint.valueOf("Black"));
        battleBorder.setFill(Color.LIGHTGRAY);
        battleBorder.setStrokeWidth(4);

    }





    private void configureGraphicContext(){
        menuCanvas = new Canvas(800, 400);


        GraphicsContext background = menuCanvas.getGraphicsContext2D();
        background.setFill(Paint.valueOf("Transparent"));
        background.setStroke(Paint.valueOf("Black"));
        background.setLineWidth(1);
        Font backFont = Font.font("Times New Roman", BOLD, 56 );
        background.setFont(backFont);
        background.fillText("B I N A R Y   B E A T D O W N", 20, 202);
        background.strokeText("B I N A R Y   B E A T D O W N", 20, 202);

        GraphicsContext title = menuCanvas.getGraphicsContext2D();
        title.setFill(Paint.valueOf("Red"));
        title.setStroke(Paint.valueOf("Black"));
        title.setLineWidth(1);
        Font titleFont = Font.font("Times New Roman", BOLD, 40);
        title.setFont(titleFont);
        title.fillText("B I N A R Y   B E A T D O W N", 130, 200);
        title.strokeText("B I N A R Y   B E A T D O W N", 130, 200);

        GraphicsContext subtitle = menuCanvas.getGraphicsContext2D();
        subtitle.setFill(Paint.valueOf("Red"));
        subtitle.setStroke(Paint.valueOf("Black"));
        subtitle.setLineWidth(1);
        Font subtitleFont = Font.font("Times New Roman", BOLD, 15);
        subtitle.setFont(subtitleFont);
        subtitle.fillText("YOU  CAN  BE  A  ZERO,  OR  YOU  CAN  BE  THE  ONE.", 200, 230);
        subtitle.strokeText("YOU  CAN  BE  A  ZERO,  OR  YOU  CAN  BE  THE  ONE", 200, 230);

        GraphicsContext copyright = menuCanvas.getGraphicsContext2D();
        copyright.setFill(Paint.valueOf("Transparent"));
        copyright.setStroke(Paint.valueOf("Black"));
        copyright.setLineWidth(1);
        Font copyrightFont = Font.font("Times New Roman", 8);
        copyright.setFont(copyrightFont);
        subtitle.fillText("C R E A T E D   B Y   M . A . D . M .   G A M I N G   C O O R P O R A T I O N", 260, 380);
        subtitle.strokeText("C R E A T E D   B Y   M . A . D . M .   G A M I N G   C O O R P O R A T I O N", 260, 380);

        GraphicsContext start = menuCanvas.getGraphicsContext2D();
        start.setFill(Paint.valueOf("Red"));
        start.setStroke(Paint.valueOf("Black"));
        start.setLineWidth(1);
        Font startFont = Font.font("Times New Roman", BOLD, 25);
        start.setFont(startFont);
        start.fillText("S T A R T", 330, 300);
        start.strokeText("S T A R T", 330, 300);


    }



    private void attackButtonClicked(ActionEvent e) {
        if (e.getSource()==firstAttackButton){
            System.out.println("It worked!");}
        if (e.getSource()==secondAttackButton){
            System.out.println("It worked!");}
        if (e.getSource()==thirdAttackButton){
            System.out.println("It worked!");}
        if (e.getSource()==fourthAttackButton){
            System.out.println("It worked!");}


    }

    private void StartButtonClicked(ActionEvent e)
    {
        if (e.getSource()==startButton)
            thestage.setScene(battleScene);
        else
            System.out.println("hello");

    }

}


