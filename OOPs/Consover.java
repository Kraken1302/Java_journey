package OOPs;

public class Consover {
    public static void main(String[] args) {
        pizza x = new pizza("thicc", "olives");
        System.out.println(x.bread);
    }
}
class pizza{
    String bread;
    String toppings;
    String sauce;
    pizza(String bread, String toppings, String sauce){
        this.bread=bread;
        this.sauce=sauce;
        this.toppings= toppings;
    }
    pizza(String bread, String toppings){
        this.bread=bread;
        
        this.toppings= toppings;
    }
}
