package OOPs;
import java.util.*;
public class localnglobal {
    public static void main(String[] args) {
        DiceRoller DR= new DiceRoller();
    }
}

class DiceRoller{
    Random rand =new Random();    //local only
    int number;
    DiceRoller(){
        roll();
        // roll(rand,number);
    }
    // void roll(Random rand,int number){
    //     number=rand.nextInt(6)+1;
    //     System.out.println(number);
    // }
     void roll(){
        number=rand.nextInt(6)+1;
        System.out.println(number);
    }
}
