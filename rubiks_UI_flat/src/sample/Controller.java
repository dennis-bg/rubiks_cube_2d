package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    private static final String WHITE = "#FFFFFF";
    private static final String YELLOW = "#ffff14";
    private static final String RED = "#f70d1a";
    private static final String ORANGE = "#ffab0f";
    private static final String BLUE = "#152eff";
    private static final String GREEN = "#2fef10";
    private static final String BLACK = "#000000";

    @FXML
    private Button whiteTurn;
    @FXML
    private Button whitePrime;
    @FXML
    private Button yellowTurn;
    @FXML
    private Button yellowPrime;
    @FXML
    private Button redTurn;
    @FXML
    private Button redPrime;
    @FXML
    private Button orangeTurn;
    @FXML
    private Button orangePrime;
    @FXML
    private Button blueTurn;
    @FXML
    private Button bluePrime;
    @FXML
    private Button greenTurn;
    @FXML
    private Button greenPrime;
    @FXML
    private Label white1;
    @FXML
    private Label white2;
    @FXML
    private Label white3;
    @FXML
    private Label white4;
    @FXML
    private Label white5;
    @FXML
    private Label white6;
    @FXML
    private Label white7;
    @FXML
    private Label white8;
    @FXML
    private Label white9;
    @FXML
    private Label yellow1;
    @FXML
    private Label yellow2;
    @FXML
    private Label yellow3;
    @FXML
    private Label yellow4;
    @FXML
    private Label yellow5;
    @FXML
    private Label yellow6;
    @FXML
    private Label yellow7;
    @FXML
    private Label yellow8;
    @FXML
    private Label yellow9;
    @FXML
    private Label red1;
    @FXML
    private Label red2;
    @FXML
    private Label red3;
    @FXML
    private Label red4;
    @FXML
    private Label red5;
    @FXML
    private Label red6;
    @FXML
    private Label red7;
    @FXML
    private Label red8;
    @FXML
    private Label red9;
    @FXML
    private Label blue1;
    @FXML
    private Label blue2;
    @FXML
    private Label blue3;
    @FXML
    private Label blue4;
    @FXML
    private Label blue5;
    @FXML
    private Label blue6;
    @FXML
    private Label blue7;
    @FXML
    private Label blue8;
    @FXML
    private Label blue9;
    @FXML
    private Label orange1;
    @FXML
    private Label orange2;
    @FXML
    private Label orange3;
    @FXML
    private Label orange4;
    @FXML
    private Label orange5;
    @FXML
    private Label orange6;
    @FXML
    private Label orange7;
    @FXML
    private Label orange8;
    @FXML
    private Label orange9;
    @FXML
    private Label green1;
    @FXML
    private Label green2;
    @FXML
    private Label green3;
    @FXML
    private Label green4;
    @FXML
    private Label green5;
    @FXML
    private Label green6;
    @FXML
    private Label green7;
    @FXML
    private Label green8;
    @FXML
    private Label green9;
    @FXML
    private Label whiteTopLeft;
    @FXML
    private Label whiteTopCenter;
    @FXML
    private Label whiteTopRight;
    @FXML
    private Label whiteLeftTop;
    @FXML
    private Label whiteLeftCenter;
    @FXML
    private Label whiteLeftBottom;
    @FXML
    private Label whiteBottomLeft;
    @FXML
    private Label whiteBottomCenter;
    @FXML
    private Label whiteBottomRight;
    @FXML
    private Label whiteRightTop;
    @FXML
    private Label whiteRightCenter;
    @FXML
    private Label whiteRightBottom;
    @FXML
    private Label redTopLeft;
    @FXML
    private Label redTopCenter;
    @FXML
    private Label redTopRight;
    @FXML
    private Label redLeftTop;
    @FXML
    private Label redLeftCenter;
    @FXML
    private Label redLeftBottom;
    @FXML
    private Label redBottomLeft;
    @FXML
    private Label redBottomCenter;
    @FXML
    private Label redBottomRight;
    @FXML
    private Label redRightTop;
    @FXML
    private Label redRightCenter;
    @FXML
    private Label redRightBottom;
    @FXML
    private Label yellowTopLeft;
    @FXML
    private Label yellowTopCenter;
    @FXML
    private Label yellowTopRight;
    @FXML
    private Label yellowLeftTop;
    @FXML
    private Label yellowLeftCenter;
    @FXML
    private Label yellowLeftBottom;
    @FXML
    private Label yellowBottomLeft;
    @FXML
    private Label yellowBottomCenter;
    @FXML
    private Label yellowBottomRight;
    @FXML
    private Label yellowRightTop;
    @FXML
    private Label yellowRightCenter;
    @FXML
    private Label yellowRightBottom;
    @FXML
    private Label blueTopLeft;
    @FXML
    private Label blueTopCenter;
    @FXML
    private Label blueTopRight;
    @FXML
    private Label blueLeftTop;
    @FXML
    private Label blueLeftCenter;
    @FXML
    private Label blueLeftBottom;
    @FXML
    private Label blueBottomLeft;
    @FXML
    private Label blueBottomCenter;
    @FXML
    private Label blueBottomRight;
    @FXML
    private Label blueRightTop;
    @FXML
    private Label blueRightCenter;
    @FXML
    private Label blueRightBottom;
    @FXML
    private Label greenTopLeft;
    @FXML
    private Label greenTopCenter;
    @FXML
    private Label greenTopRight;
    @FXML
    private Label greenLeftTop;
    @FXML
    private Label greenLeftCenter;
    @FXML
    private Label greenLeftBottom;
    @FXML
    private Label greenBottomLeft;
    @FXML
    private Label greenBottomCenter;
    @FXML
    private Label greenBottomRight;
    @FXML
    private Label greenRightTop;
    @FXML
    private Label greenRightCenter;
    @FXML
    private Label greenRightBottom;
    @FXML
    private Label orangeTopLeft;
    @FXML
    private Label orangeTopCenter;
    @FXML
    private Label orangeTopRight;
    @FXML
    private Label orangeLeftTop;
    @FXML
    private Label orangeLeftCenter;
    @FXML
    private Label orangeLeftBottom;
    @FXML
    private Label orangeBottomLeft;
    @FXML
    private Label orangeBottomCenter;
    @FXML
    private Label orangeBottomRight;
    @FXML
    private Label orangeRightTop;
    @FXML
    private Label orangeRightCenter;
    @FXML
    private Label orangeRightBottom;



    Cube cube;


    public void initialize(){
        cube = new Cube();
        setColors();
    }

    public void turnClick(ActionEvent e){
        if (e.getSource().equals(whiteTurn)) cube.whiteTurn();
        else if (e.getSource().equals(whitePrime)) cube.whitePrime();
        else if (e.getSource().equals(yellowTurn)) cube.yellowTurn();
        else if (e.getSource().equals(yellowPrime)) cube.yellowPrime();
        else if (e.getSource().equals(redTurn)) cube.redTurn();
        else if (e.getSource().equals(redPrime)) cube.redPrime();
        else if (e.getSource().equals(orangeTurn)) cube.orangeTurn();
        else if (e.getSource().equals(orangePrime)) cube.orangePrime();
        else if (e.getSource().equals(blueTurn)) cube.blueTurn();
        else if (e.getSource().equals(bluePrime)) cube.bluePrime();
        else if (e.getSource().equals(greenTurn)) cube.greenTurn();
        else if (e.getSource().equals(greenPrime)) cube.greenPrime();
        setColors();
    }

    public void setSideStyle(Label cubie, char color){
        switch(color) {
            case 'W':
                cubie.setStyle("-fx-border-color: white; -fx-background-color: " + WHITE);
                break;
            case 'Y':
                cubie.setStyle("-fx-border-color: white; -fx-background-color: " + YELLOW);
                break;
            case 'B':
                cubie.setStyle("-fx-border-color: white; -fx-background-color: " + BLUE);
                break;
            case 'G':
                cubie.setStyle("-fx-border-color: white; -fx-background-color: " + GREEN);
                break;
            case 'R':
                cubie.setStyle("-fx-border-color: white; -fx-background-color: " + RED);
                break;
            case 'O':
                cubie.setStyle("-fx-border-color: white; -fx-background-color: " + ORANGE);
                break;
            default:
                break;
        }
    }

    private void setTopEdges(Label edge, char color, boolean center, String centerColor){
        if(!center){
            switch(color) {
                case 'W':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLACK + " " + WHITE + " " + BLACK);
                    break;
                case 'Y':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLACK + " " + YELLOW + " " + BLACK);
                    break;
                case 'B':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLACK + " " + BLUE + " " + BLACK);
                    break;
                case 'G':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLACK + " " + GREEN + " " + BLACK);
                    break;
                case 'R':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLACK + " " + RED + " " + BLACK);
                    break;
                case 'O':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLACK + " " + ORANGE + " " + BLACK);
                    break;
                default:
                    break;
            }
        }
        else{
            switch(color) {
                case 'W':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + centerColor + " " + BLACK + " " + WHITE + " " + BLACK);
                    break;
                case 'Y':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + centerColor + " " + BLACK + " " + YELLOW + " " + BLACK);
                    break;
                case 'B':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + centerColor + " " + BLACK + " " + BLUE + " " + BLACK);
                    break;
                case 'G':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + centerColor + " " + BLACK + " " + GREEN + " " + BLACK);
                    break;
                case 'R':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + centerColor + " " + BLACK + " " + RED + " " + BLACK);
                    break;
                case 'O':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + centerColor + " " + BLACK + " " + ORANGE + " " + BLACK);
                    break;
                default:
                    break;
            }
        }
    }

    private void setLeftEdges(Label edge, char color, boolean center, String centerColor){
        if(!center){
            switch(color) {
                case 'W':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + WHITE + " " + BLACK + " " + BLACK);
                    break;
                case 'Y':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + YELLOW + " " + BLACK + " " + BLACK);
                    break;
                case 'B':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLUE + " " + BLACK + " " + BLACK);
                    break;
                case 'G':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + GREEN + " " + BLACK + " " + BLACK);
                    break;
                case 'R':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + RED + " " + BLACK + " " + BLACK);
                    break;
                case 'O':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + ORANGE + " " + BLACK + " " + BLACK);
                    break;
                default:
                    break;
            }
        }
        else{
            switch(color) {
                case 'W':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + WHITE + " " + BLACK + " " + centerColor);
                    break;
                case 'Y':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + YELLOW + " " + BLACK + " " + centerColor);
                    break;
                case 'B':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLUE + " " + BLACK + " " + centerColor);
                    break;
                case 'G':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + GREEN + " " + BLACK + " " + centerColor);
                    break;
                case 'R':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + RED + " " + BLACK + " " + centerColor);
                    break;
                case 'O':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + ORANGE + " " + BLACK + " " + centerColor);
                    break;
                default:
                    break;
            }
        }
    }

    private void setBottomEdges(Label edge, char color, boolean center, String centerColor){
        if(!center){
            switch(color) {
                case 'W':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + WHITE + " " + BLACK + " " + BLACK + " " + BLACK);
                    break;
                case 'Y':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + YELLOW + " " + BLACK + " " + BLACK + " " + BLACK);
                    break;
                case 'B':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLUE + " " + BLACK + " " + BLACK + " " + BLACK);
                    break;
                case 'G':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + GREEN + " " + BLACK + " " + BLACK + " " + BLACK);
                    break;
                case 'R':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + RED + " " + BLACK + " " + BLACK + " " + BLACK);
                    break;
                case 'O':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + ORANGE + " " + BLACK + " " + BLACK + " " + BLACK);
                    break;
                default:
                    break;
            }
        }
        else{
            switch(color) {
                case 'W':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + WHITE + " " + BLACK + " " + centerColor + " " + BLACK);
                    break;
                case 'Y':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + YELLOW + " " + BLACK + " " + centerColor + " " + BLACK);
                    break;
                case 'B':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLUE + " " + BLACK + " " + centerColor + " " + BLACK);
                    break;
                case 'G':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + GREEN + " " + BLACK + " " + centerColor + " " + BLACK);
                    break;
                case 'R':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + RED + " " + BLACK + " " + centerColor + " " + BLACK);
                    break;
                case 'O':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + ORANGE + " " + BLACK + " " + centerColor + " " + BLACK);
                    break;
                default:
                    break;
            }
        }
    }

    private void setRightEdges(Label edge, char color, boolean center, String centerColor){
        if(!center){
            switch(color) {
                case 'W':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLACK + " " + BLACK + " " + WHITE);
                    break;
                case 'Y':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLACK + " " + BLACK + " " + YELLOW);
                    break;
                case 'B':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLACK + " " + BLACK + " " + BLUE);
                    break;
                case 'G':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLACK + " " + BLACK + " " + GREEN);
                    break;
                case 'R':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLACK + " " + BLACK + " " + RED);
                    break;
                case 'O':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + BLACK + " " + BLACK + " " + ORANGE);
                    break;
                default:
                    break;
            }
        }
        else{
            switch(color) {
                case 'W':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + centerColor + " " + BLACK + " " + WHITE);
                    break;
                case 'Y':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + centerColor + " " + BLACK + " " + YELLOW);
                    break;
                case 'B':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + centerColor + " " + BLACK + " " + BLUE);
                    break;
                case 'G':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + centerColor + " " + BLACK + " " + GREEN);
                    break;
                case 'R':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + centerColor + " " + BLACK + " " + RED);
                    break;
                case 'O':
                    edge.setStyle("-fx-border-style: solid; -fx-border-width: 5; -fx-border-color: " + BLACK + " " + centerColor + " " + BLACK + " " + ORANGE);
                    break;
                default:
                    break;
            }
        }
    }

    public void setWhiteSide(){
        setSideStyle(white1, cube.white.colors[0][0]);
        setSideStyle(white2, cube.white.colors[0][1]);
        setSideStyle(white3, cube.white.colors[0][2]);
        setSideStyle(white4, cube.white.colors[1][0]);
        setSideStyle(white5, cube.white.colors[1][1]);
        setSideStyle(white6, cube.white.colors[1][2]);
        setSideStyle(white7, cube.white.colors[2][0]);
        setSideStyle(white8, cube.white.colors[2][1]);
        setSideStyle(white9, cube.white.colors[2][2]);
    }

    public void setWhiteEdges(){
        setTopEdges(whiteTopLeft, cube.white.up.colors[0][2], false, cube.white.up.center_color);
        setTopEdges(whiteTopCenter, cube.white.up.colors[0][1], true,cube.white.up.center_color);
        setTopEdges(whiteTopRight, cube.white.up.colors[0][0], false, cube.white.up.center_color);

        setLeftEdges(whiteLeftTop, cube.white.left.colors[0][0], false, cube.white.left.center_color);
        setLeftEdges(whiteLeftCenter, cube.white.left.colors[0][1], true, cube.white.left.center_color);
        setLeftEdges(whiteLeftBottom, cube.white.left.colors[0][2], false, cube.white.left.center_color);

        setBottomEdges(whiteBottomLeft, cube.white.down.colors[0][0], false, cube.white.down.center_color);
        setBottomEdges(whiteBottomCenter, cube.white.down.colors[0][1], true, cube.white.down.center_color);
        setBottomEdges(whiteBottomRight, cube.white.down.colors[0][2], false, cube.white.down.center_color);

        setRightEdges(whiteRightTop, cube.white.right.colors[0][2], false, cube.white.right.center_color);
        setRightEdges(whiteRightCenter, cube.white.right.colors[0][1], true, cube.white.right.center_color);
        setRightEdges(whiteRightBottom, cube.white.right.colors[0][0], false, cube.white.right.center_color);
    }

    public void setYellowSide(){
        setSideStyle(yellow1, cube.yellow.colors[0][0]);
        setSideStyle(yellow2, cube.yellow.colors[0][1]);
        setSideStyle(yellow3, cube.yellow.colors[0][2]);
        setSideStyle(yellow4, cube.yellow.colors[1][0]);
        setSideStyle(yellow5, cube.yellow.colors[1][1]);
        setSideStyle(yellow6, cube.yellow.colors[1][2]);
        setSideStyle(yellow7, cube.yellow.colors[2][0]);
        setSideStyle(yellow8, cube.yellow.colors[2][1]);
        setSideStyle(yellow9, cube.yellow.colors[2][2]);
    }

    private void setYellowEdges(){
        setTopEdges(yellowTopLeft, cube.yellow.up.colors[2][0], false, cube.yellow.up.center_color);
        setTopEdges(yellowTopCenter, cube.yellow.up.colors[2][1], true, cube.yellow.up.center_color);
        setTopEdges(yellowTopRight, cube.yellow.up.colors[2][2],false, cube.yellow.up.center_color);

        setLeftEdges(yellowLeftTop, cube.yellow.left.colors[2][2], false, cube.yellow.left.center_color);
        setLeftEdges(yellowLeftCenter, cube.yellow.left.colors[2][1], true, cube.yellow.left.center_color);
        setLeftEdges(yellowLeftBottom, cube.yellow.left.colors[2][0], false, cube.yellow.left.center_color);

        setBottomEdges(yellowBottomLeft, cube.yellow.down.colors[2][2], false, cube.yellow.down.center_color);
        setBottomEdges(yellowBottomCenter, cube.yellow.down.colors[2][1], true, cube.yellow.down.center_color);
        setBottomEdges(yellowBottomRight, cube.yellow.down.colors[2][0], false, cube.yellow.down.center_color);

        setRightEdges(yellowRightTop, cube.yellow.right.colors[2][0], false, cube.yellow.right.center_color);
        setRightEdges(yellowRightCenter, cube.yellow.right.colors[2][1], true, cube.yellow.right.center_color);
        setRightEdges(yellowRightBottom, cube.yellow.right.colors[2][2], false, cube.yellow.right.center_color);

    }

    public void setRedSide(){
        setSideStyle(red1, cube.red.colors[0][0]);
        setSideStyle(red2, cube.red.colors[0][1]);
        setSideStyle(red3, cube.red.colors[0][2]);
        setSideStyle(red4, cube.red.colors[1][0]);
        setSideStyle(red5, cube.red.colors[1][1]);
        setSideStyle(red6, cube.red.colors[1][2]);
        setSideStyle(red7, cube.red.colors[2][0]);
        setSideStyle(red8, cube.red.colors[2][1]);
        setSideStyle(red9, cube.red.colors[2][2]);
    }

    private void setRedEdges(){
        setTopEdges(redTopLeft, cube.red.up.colors[0][2], false, cube.red.up.center_color);
        setTopEdges(redTopCenter, cube.red.up.colors[0][1], true, cube.red.up.center_color);
        setTopEdges(redTopRight, cube.red.up.colors[0][0], false, cube.red.up.center_color);

        setLeftEdges(redLeftTop, cube.red.left.colors[0][2], false, cube.red.left.center_color);
        setLeftEdges(redLeftCenter, cube.red.left.colors[1][2], true, cube.red.left.center_color);
        setLeftEdges(redLeftBottom, cube.red.left.colors[2][2], false, cube.red.left.center_color);

        setBottomEdges(redBottomLeft, cube.red.down.colors[2][2], false, cube.red.down.center_color);
        setBottomEdges(redBottomCenter, cube.red.down.colors[2][1], true, cube.red.down.center_color);
        setBottomEdges(redBottomRight, cube.red.down.colors[2][0], false, cube.red.down.center_color);

        setRightEdges(redRightTop, cube.red.right.colors[0][0], false, cube.red.right.center_color);
        setRightEdges(redRightCenter, cube.red.right.colors[1][0], true, cube.red.right.center_color);
        setRightEdges(redRightBottom, cube.red.right.colors[2][0], false, cube.red.right.center_color);
    }

    public void setOrangeSide(){
        setSideStyle(orange1, cube.orange.colors[0][0]);
        setSideStyle(orange2, cube.orange.colors[0][1]);
        setSideStyle(orange3, cube.orange.colors[0][2]);
        setSideStyle(orange4, cube.orange.colors[1][0]);
        setSideStyle(orange5, cube.orange.colors[1][1]);
        setSideStyle(orange6, cube.orange.colors[1][2]);
        setSideStyle(orange7, cube.orange.colors[2][0]);
        setSideStyle(orange8, cube.orange.colors[2][1]);
        setSideStyle(orange9, cube.orange.colors[2][2]);
    }

    private void setOrangeEdges(){
        setTopEdges(orangeTopLeft, cube.orange.up.colors[2][0], false, cube.orange.up.center_color);
        setTopEdges(orangeTopCenter, cube.orange.up.colors[2][1], true, cube.orange.up.center_color);
        setTopEdges(orangeTopRight, cube.orange.up.colors[2][2], false, cube.orange.up.center_color);

        setLeftEdges(orangeLeftTop, cube.orange.left.colors[0][2], false, cube.orange.left.center_color);
        setLeftEdges(orangeLeftCenter, cube.orange.left.colors[1][2], true, cube.orange.left.center_color);
        setLeftEdges(orangeLeftBottom, cube.orange.left.colors[2][2], false, cube.orange.left.center_color);

        setBottomEdges(orangeBottomLeft, cube.orange.down.colors[0][0], false, cube.orange.down.center_color);
        setBottomEdges(orangeBottomCenter, cube.orange.down.colors[0][1], true, cube.orange.down.center_color);
        setBottomEdges(orangeBottomRight, cube.orange.down.colors[0][2], false, cube.orange.down.center_color);

        setRightEdges(orangeRightTop, cube.orange.right.colors[0][0], false, cube.orange.right.center_color);
        setRightEdges(orangeRightCenter, cube.orange.right.colors[1][0], true, cube.orange.right.center_color);
        setRightEdges(orangeRightBottom, cube.orange.right.colors[2][0], false, cube.orange.right.center_color);
    }

    public void setBlueSide(){
        setSideStyle(blue1, cube.blue.colors[0][0]);
        setSideStyle(blue2, cube.blue.colors[0][1]);
        setSideStyle(blue3, cube.blue.colors[0][2]);
        setSideStyle(blue4, cube.blue.colors[1][0]);
        setSideStyle(blue5, cube.blue.colors[1][1]);
        setSideStyle(blue6, cube.blue.colors[1][2]);
        setSideStyle(blue7, cube.blue.colors[2][0]);
        setSideStyle(blue8, cube.blue.colors[2][1]);
        setSideStyle(blue9, cube.blue.colors[2][2]);
    }

    private void setBlueEdges(){
        setTopEdges(blueTopLeft, cube.blue.up.colors[0][0], false, cube.blue.up.center_color);
        setTopEdges(blueTopCenter, cube.blue.up.colors[1][0], true, cube.blue.up.center_color);
        setTopEdges(blueTopRight, cube.blue.up.colors[2][0], false, cube.blue.up.center_color);

        setLeftEdges(blueLeftTop, cube.blue.left.colors[0][2], false, cube.blue.left.center_color);
        setLeftEdges(blueLeftCenter, cube.blue.left.colors[1][2], true, cube.blue.left.center_color);
        setLeftEdges(blueLeftBottom, cube.blue.left.colors[2][2], false, cube.blue.left.center_color);

        setBottomEdges(blueBottomLeft, cube.blue.down.colors[2][0], false, cube.blue.down.center_color);
        setBottomEdges(blueBottomCenter, cube.blue.down.colors[1][0], true, cube.blue.down.center_color);
        setBottomEdges(blueBottomRight, cube.blue.down.colors[0][0], false, cube.blue.down.center_color);

        setRightEdges(blueRightTop, cube.blue.right.colors[0][0], false, cube.blue.right.center_color);
        setRightEdges(blueRightCenter, cube.blue.right.colors[1][0], true, cube.blue.right.center_color);
        setRightEdges(blueRightBottom, cube.blue.right.colors[2][0], false, cube.blue.right.center_color);
    }

    public void setGreenSide(){
        setSideStyle(green1, cube.green.colors[0][0]);
        setSideStyle(green2, cube.green.colors[0][1]);
        setSideStyle(green3, cube.green.colors[0][2]);
        setSideStyle(green4, cube.green.colors[1][0]);
        setSideStyle(green5, cube.green.colors[1][1]);
        setSideStyle(green6, cube.green.colors[1][2]);
        setSideStyle(green7, cube.green.colors[2][0]);
        setSideStyle(green8, cube.green.colors[2][1]);
        setSideStyle(green9, cube.green.colors[2][2]);
    }

    private void setGreenEdges(){
        setTopEdges(greenTopLeft, cube.green.up.colors[2][2], false, cube.green.up.center_color);
        setTopEdges(greenTopCenter, cube.green.up.colors[1][2], true, cube.green.up.center_color);
        setTopEdges(greenTopRight, cube.green.up.colors[0][2], false, cube.green.up.center_color);

        setLeftEdges(greenLeftTop, cube.green.left.colors[0][2], false, cube.green.left.center_color);
        setLeftEdges(greenLeftCenter, cube.green.left.colors[1][2], true, cube.green.left.center_color);
        setLeftEdges(greenLeftBottom, cube.green.left.colors[2][2], false, cube.green.left.center_color);

        setBottomEdges(greenBottomLeft, cube.green.down.colors[0][2], false, cube.green.down.center_color);
        setBottomEdges(greenBottomCenter, cube.green.down.colors[1][2], true, cube.green.down.center_color);
        setBottomEdges(greenBottomRight, cube.green.down.colors[2][2], false, cube.green.down.center_color);

        setRightEdges(greenRightTop, cube.green.right.colors[0][0], false, cube.green.right.center_color);
        setRightEdges(greenRightCenter, cube.green.right.colors[1][0], true, cube.green.right.center_color);
        setRightEdges(greenRightBottom, cube.green.right.colors[2][0], false, cube.green.right.center_color);
    }

    public void setColors(){

        setWhiteSide();
        setWhiteEdges();

        setYellowSide();
        setYellowEdges();

        setRedSide();
        setRedEdges();

        setOrangeSide();
        setOrangeEdges();

        setBlueSide();
        setBlueEdges();

        setGreenSide();
        setGreenEdges();
    }

}





























