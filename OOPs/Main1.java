package OOPs;

public class Main1 {
    public static void main(String[] args) {
        Vehicle car1= new Vehicle();
        System.out.println(car1.name);
        
    }
    
}
class Vehicle{
    int tyres=4;
    String name="tata";
    String type="coupe";
    void drive(){
        System.out.println("This can auto drive");
    }
    void lock(){
        System.out.println("has autolock functionality");
    }
}
