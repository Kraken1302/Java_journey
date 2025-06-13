package Day5;
import java.util.*;
public class Implementarraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> food= new ArrayList();
        
        ArrayList<String> Indianfood= new ArrayList();
        Indianfood.add("daal");
        Indianfood.add("chawaal");
        Indianfood.add("curry");
        System.out.println(Indianfood);
        ArrayList<String> Junkfood= new ArrayList();
        Junkfood.add("burgers");
        Junkfood.add("pizza");
        Junkfood.add("frenchfries");
        System.out.println(Junkfood);
        food.add(Indianfood);
        food.add(Junkfood);
        System.out.println(food);
        System.out.println(food.get(1).get(2));
    }
}



