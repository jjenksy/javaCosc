package classExercises;



/**
 * Created by jjenkins on 9/18/2016.
 */
public class playArea {
    int[][][] x = {{{5,5,5,5},{5,5,5,5}},
            {{7,7,7,7},{7,7,7,7}},
            {{8,8,8,8},{30,31,32,33}}};
    static int number2 = getValue();
    static int number1 = 10;
    static int getValue(){
        return number1;
    }

    static int doSum(){return number1+number2;}
    static int doMinus(){return number1-number2;}
    public static void main (String[] args) {

        System.out.println(doSum());
        System.out.println(doMinus());


     }



}
