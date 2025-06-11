package CollectionFramework;
import java.util.*;

public class List {
    
    public static void main(String[] args){
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        for(int i =0;i<food.size(); i++){
            System.out.println(food.get(i));
        }
        food.set(0,"sushi");
        for(int i =0;i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
