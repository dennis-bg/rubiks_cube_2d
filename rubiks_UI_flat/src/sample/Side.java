package sample;

public class Side {

    public char[][] colors= new char[3][3];
    String center_color_string;
    String center_color;
    Side up = null;
    Side down = null;
    Side right = null;
    Side left = null;

    public Side(char color){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                colors[i][j] = color;
            }
        }
        switch(color){
            case 'W':
                center_color = "FFFFFF";
                center_color_string = "White";
                break;
            case 'Y':
                center_color = "#ffff14";
                center_color_string = "Yellow";
                break;
            case 'B':
                center_color = "#152eff";
                center_color_string = "Blue";
                break;
            case 'G':
                center_color = "#2fef10";
                center_color_string = "Green";
                break;
            case 'R':
                center_color = "#f70d1a";
                center_color_string = "Red";
                break;
            case 'O':
                center_color = "#ffab0f";
                center_color = "Orange";
                break;
            default: break;

        }
    }


    public void test(){
        colors[0][0] = 'a';
        colors[0][1] = 'a';
        colors[0][2] = 'a';
        colors[1][0] = 'b';
        colors[1][1] = 'b';
        colors[1][2] = 'b';
        colors[2][0] = 'c';
        colors[2][1] = 'c';
        colors[2][2] = 'c';
    }

    public void test2(){
        colors[0][0] = '1';
        colors[0][1] = '2';
        colors[0][2] = '3';
        colors[1][0] = '1';
        colors[1][1] = '2';
        colors[1][2] = '3';
        colors[2][0] = '1';
        colors[2][1] = '2';
        colors[2][2] = '3';
    }

    public void setAdjacents(Side up, Side down, Side left, Side right){
        this.up = up;
        this.down = down;
        this.right = right;
        this.left = left;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(center_color_string + " Side\n");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                str.append(colors[i][j]).append("\t");
            }
            str.append("\n");
        }
        return str + "\n";
    }
}
