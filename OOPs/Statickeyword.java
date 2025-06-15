package OOPs;

public class Statickeyword {
    public static void main(String[] args) {
        food f1 = new food("pizza");
        food f2 = new food("buurguur");
        System.out.println(f1.count);
        System.out.println(f2.count);
    }
}
class food{
    String name;
    static int count=1;
    food(String name){
        this.name = name;
        count++;
    }
}
