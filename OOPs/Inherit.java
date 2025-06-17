package OOPs;

public class Inherit {
    public static void main(String[] args) {
        car c1 = new car("tata", 4);
        // System.out.println(c1.start());  //But when you call: System.out.println(c1.start());, you’re saying:
                                        // "Print the value returned by start()"
                                        // But start() returns nothing → it’s void → so println() gets confused.
        c1.start();
        System.out.println(c1.name);
    }
}
class vehicle{
    String name;
    int tyres;
}
class car extends vehicle{
    car(String name, int tyres){
        this.name= name;
        this.tyres= tyres;
    }
    void start(){
        System.out.println("started");
    }
}
