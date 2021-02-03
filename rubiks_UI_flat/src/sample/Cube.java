package sample;

public class Cube {

    public Side white;
    public Side yellow;
    public Side blue;
    public Side green;
    public Side red;
    public Side orange;

    public Cube(){
        white = new Side('W');
        yellow = new Side('Y');
        blue = new Side('B');
        green = new Side('G');
        red = new Side('R');
        orange = new Side('O');

        white.setAdjacents(red, orange, blue, green);
        red.setAdjacents(white, yellow, green, blue);
        yellow.setAdjacents(orange, red, blue, green);
        orange.setAdjacents(white, yellow, blue, green);
        blue.setAdjacents(white, yellow, red, orange);
        green.setAdjacents(white, yellow, orange, red);
    }

    public void rotateSide(Side side){
        char[] temp1 = new char[3];
        char[] temp2 = new char[3];
        char[] temp3 = new char[3];
        for(int i=2; i>=0; i--){
            temp1[2-i] = side.colors[i][0];
            temp2[2-i] = side.colors[i][1];
            temp3[2-i] = side.colors[i][2];
        }
        System.arraycopy(temp1, 0, side.colors[0], 0, 3);
        System.arraycopy(temp2, 0, side.colors[1], 0, 3);
        System.arraycopy(temp3, 0, side.colors[2], 0, 3);
    }

    public void rotatePrime(Side side){
        char[] temp1 = new char[3];
        char[] temp2 = new char[3];
        char[] temp3 = new char[3];
        for(int i=0; i<3; i++){
            temp1[i] = side.colors[i][0];
            temp2[i] = side.colors[i][1];
            temp3[i] = side.colors[i][2];
        }
        System.arraycopy(temp3, 0, side.colors[0], 0, 3);
        System.arraycopy(temp2, 0, side.colors[1], 0, 3);
        System.arraycopy(temp1, 0, side.colors[2], 0, 3);
    }

    public void whiteTurn(){
        char[] temp = new char[3];
        System.arraycopy(white.up.colors[0], 0, temp, 0, 3);
        System.arraycopy(white.left.colors[0], 0, white.up.colors[0], 0, 3);
        System.arraycopy(white.down.colors[0], 0, white.left.colors[0], 0, 3);
        System.arraycopy(white.right.colors[0], 0, white.down.colors[0], 0, 3);
        System.arraycopy(temp, 0, white.right.colors[0], 0, 3);
        rotateSide(white);
    }

    public void whitePrime(){
        char[] temp = new char[3];
        System.arraycopy(white.up.colors[0], 0, temp, 0, 3);
        System.arraycopy(white.right.colors[0], 0, white.up.colors[0], 0, 3);
        System.arraycopy(white.down.colors[0], 0, white.right.colors[0], 0, 3);
        System.arraycopy(white.left.colors[0], 0, white.down.colors[0], 0, 3);
        System.arraycopy(temp, 0, white.left.colors[0], 0, 3);
        rotatePrime(white);
    }

    public void yellowTurn(){
        char[] temp = new char[3];
        System.arraycopy(yellow.down.colors[2], 0, temp, 0, 3);
        System.arraycopy(yellow.right.colors[2], 0, yellow.down.colors[2], 0, 3);
        System.arraycopy(yellow.up.colors[2], 0, yellow.right.colors[2], 0, 3);
        System.arraycopy(yellow.left.colors[2], 0, yellow.up.colors[2], 0, 3);
        System.arraycopy(temp, 0, yellow.left.colors[2], 0, 3);
        rotateSide(yellow);
    }

    public void yellowPrime(){
        char[] temp = new char[3];
        System.arraycopy(yellow.down.colors[2], 0, temp, 0, 3);
        System.arraycopy(yellow.left.colors[2], 0, yellow.down.colors[2], 0, 3);
        System.arraycopy(yellow.up.colors[2], 0, yellow.left.colors[2], 0, 3);
        System.arraycopy(yellow.right.colors[2], 0, yellow.up.colors[2], 0, 3);
        System.arraycopy(temp, 0, yellow.right.colors[2], 0, 3);
        rotatePrime(yellow);
    }

    public void redTurn(){
        char[] temp1 = new char[3];
        char[] temp2 = new char[3];
        for(int i=0; i<3; i++){
            temp1[i] = red.right.colors[i][0];
            temp2[i] = red.left.colors[i][2];

            red.right.colors[i][0] = red.up.colors[0][2-i];
            red.left.colors[i][2] = red.down.colors[2][2-i];
        }
        System.arraycopy(temp1, 0, red.down.colors[2], 0, 3);
        System.arraycopy(temp2, 0, red.up.colors[0], 0, 3);
        rotateSide(red);
    }

    public void redPrime(){
        char[] temp1 = new char[3];
        char[] temp2 = new char[3];
        for(int i=0; i<3; i++){
            temp1[2-i] = red.right.colors[i][0];
            temp2[2-i] = red.left.colors[i][2];

            red.right.colors[i][0] = red.down.colors[2][i];
            red.left.colors[i][2] = red.up.colors[0][i];
        }
        System.arraycopy(temp1, 0, red.up.colors[0], 0, 3);
        System.arraycopy(temp2, 0, red.down.colors[2], 0, 3);
        rotatePrime(red);
    }

    public void orangeTurn(){
        char[] temp1 = new char[3];
        char[] temp2 = new char[3];
        for(int i=2; i>=0; i--){
            temp1[2-i] = orange.left.colors[i][2];
            temp2[2-i] = orange.right.colors[i][0];

            orange.left.colors[i][2] = orange.down.colors[0][i];
            orange.right.colors[i][0] = orange.up.colors[2][i];
        }
        System.arraycopy(temp1, 0, orange.up.colors[2], 0, 3);
        System.arraycopy(temp2, 0, orange.down.colors[0], 0, 3);
        rotateSide(orange);
    }

    public void orangePrime(){
        char[] temp1 = new char[3];
        char[] temp2 = new char[3];
        for(int i=0; i<3; i++){
            temp1[i] = orange.left.colors[i][2];
            temp2[i] = orange.right.colors[i][0];

            orange.left.colors[i][2] = orange.up.colors[2][2-i];
            orange.right.colors[i][0] = orange.down.colors[0][2-i];
        }
        System.arraycopy(temp1, 0, orange.down.colors[0], 0, 3);
        System.arraycopy(temp2, 0, orange.up.colors[2], 0, 3);
        rotatePrime(orange);
    }

    public void blueTurn(){
        char temp;
        for(int i=0; i<3; i++){
            temp = blue.up.colors[i][0];
            blue.up.colors[i][0] = blue.left.colors[2-i][2];
            blue.left.colors[2-i][2] = blue.down.colors[i][0];
            blue.down.colors[i][0] = blue.right.colors[i][0];
            blue.right.colors[i][0] = temp;
        }
        rotateSide(blue);
    }

    public void bluePrime(){
        char temp;
        for(int i=0; i<3; i++){
            temp = blue.up.colors[i][0];
            blue.up.colors[i][0] = blue.right.colors[i][0];
            blue.right.colors[i][0] = blue.down.colors[i][0];
            blue.down.colors[i][0] = blue.left.colors[2-i][2];
            blue.left.colors[2-i][2] = temp;
        }
        rotatePrime(blue);
    }

    public void greenTurn(){
        char temp;
        for(int i=0; i<3; i++){
            temp = green.up.colors[i][2];
            green.up.colors[i][2] = green.left.colors[i][2];
            green.left.colors[i][2] = green.down.colors[i][2];
            green.down.colors[i][2] = green.right.colors[2-i][0];
            green.right.colors[2-i][0] = temp;
        }
        rotateSide(green);
    }

    public void greenPrime(){
        char temp;
        for(int i=0; i<3; i++){
            temp = green.up.colors[i][2];
            green.up.colors[i][2] = green.right.colors[2-i][0];
            green.right.colors[2-i][0] = green.down.colors[i][2];
            green.down.colors[i][2] = green.left.colors[i][2];
            green.left.colors[i][2] = temp;
        }
        rotatePrime(green);
    }



    @Override
    public String toString() {
        String str = "";
        str = str + white.toString() + "\n";
        str = str + orange.toString() + "\n";
        str = str + green.toString() + "\n";
        str = str + red.toString() + "\n";
        str = str + blue.toString() + "\n";
        str = str + yellow.toString() + "\n";
        return str;
    }

    public static void main(String[] args){
       Cube cube = new Cube();
       cube.redPrime();
       cube.greenTurn();
       cube.whiteTurn();
       cube.yellowPrime();
       System.out.println(cube.toString());
//       System.out.println("==================================");
//       cube.greenTurn();
//       System.out.println(cube.toString());
//       System.out.println("==================================");
//       cube.greenPrime();
//       System.out.println(cube.toString());
    }
}
