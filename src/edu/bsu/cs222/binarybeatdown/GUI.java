package edu.bsu.cs222.binarybeatdown;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.stage.Stage;

import static edu.bsu.cs222.binarybeatdown.CharacterCreator.initializeDave;
import static edu.bsu.cs222.binarybeatdown.CharacterCreator.initializeUser;

public class GUI extends Application {

//    Scanner in = new Scanner(System.in);
//        System.out.println("What is your name?");
//    String userName = in.nextLine();
//    CharacterCreator user = userSystemOut(userName);
//    CharacterCreator dave = daveSystemOut();
//        System.out.println("************************FIGHT!*********************\n");
//    battle(user, dave);

    @Override

    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Binary Beatdown");

        Button firstAttackButton = new Button("Attack 1");
        Button secondAttackButton = new Button("Attack 2");
        Button thirdAttackButton = new Button("Attack 3");
        Button fourthAttackButton = new Button("Attack 4");

        Pane battleScreen = new Pane();

        firstAttackButton.setLayoutX(30);
        firstAttackButton.setLayoutY(30);

        secondAttackButton.setLayoutX(30);
        secondAttackButton.setLayoutY(100);

        thirdAttackButton.setLayoutX(30);
        thirdAttackButton.setLayoutY(170);

        fourthAttackButton.setLayoutX(30);
        fourthAttackButton.setLayoutY(240);

        Rectangle attackOutline = new Rectangle(20, 20, 95, 280);
        attackOutline.setStroke(Paint.valueOf("Black"));
        attackOutline.setFill(null);
        attackOutline.setStrokeWidth(2);

        Rectangle screenBorder = new Rectangle(5, 5, 790, 390);
        screenBorder.setStroke(Paint.valueOf("Black"));
        screenBorder.setFill(null);
        screenBorder.setStrokeWidth(5);
        Rectangle textOutput = new Rectangle(20, 310, 760, 70);
        textOutput.setStroke(Paint.valueOf("Black"));
        textOutput.setFill(null);
        textOutput.setStrokeWidth(4);

        Rectangle userStats = new Rectangle(125, 250, 250, 50);
        userStats.setStroke(Paint.valueOf("Black"));
        userStats.setFill(null);
        userStats.setStrokeWidth(2);

        Rectangle enemyStats = new Rectangle(510, 250, 270, 50);
        enemyStats.setStroke(Paint.valueOf("Black"));
        enemyStats.setFill(null);
        enemyStats.setStrokeWidth(2);

        Rectangle battleBorder = new Rectangle(128, 20, 650, 220);
        battleBorder.setStroke(Paint.valueOf("Black"));
        battleBorder.setFill(null);
        battleBorder.setStrokeWidth(4);

        String userName = "USER";
        String enemyName = "ENEMY";

        Text userVersusEnemy = new Text(userName + " vs " + enemyName);
        userVersusEnemy.setX(392);
        userVersusEnemy.setY(280);

        battleScreen.getChildren().addAll(battleBorder, attackOutline, screenBorder, textOutput, userStats, enemyStats, userVersusEnemy);
        battleScreen.getChildren().addAll(firstAttackButton, secondAttackButton, thirdAttackButton, fourthAttackButton);
        primaryStage.setScene(new Scene(battleScreen, 800, 400));
        primaryStage.show();

//        private static CharacterCreator userSystemOut(String userName){
//            CharacterCreator user = initializeUser(userName);
//            System.out.println(user.getIntro());
//            System.out.println("Your known moves are: " + user.getMoveSet()[0].getMoveName() + ", "+ user.getMoveSet()[1].getMoveName() +
//                    ", "+ user.getMoveSet()[2].getMoveName() + ", and "+ user.getMoveSet()[3].getMoveName() + "!\n");
//            return user;
//        }
//
//        private static CharacterCreator daveSystemOut() {
//            CharacterCreator Dave = initializeDave();
//            System.out.println(Dave.getIntro());
//            System.out.println("Dave's known moves are: " + Dave.getMoveSet()[0].getMoveName() + ", "+ Dave.getMoveSet()[1].getMoveName() +
//                    ", "+ Dave.getMoveSet()[2].getMoveName() + ", and "+ Dave.getMoveSet()[3].getMoveName() + "!\n");
//            return Dave;
//        }

    }


}