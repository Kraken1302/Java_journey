package OOPs;

public class ConsMaina {
    public static void main(String[] args) {
        Vehicle car1= new Vehicle(4,"Ferrari","suv");
        System.out.println(car1.name);
    }
    
}
class Vehicle{
    int tyres;
    String name;
    String type;
    Vehicle(int tyres, String name, String type){
        this.tyres=tyres;
        
        this.name= name;
        this.type=type;
    }
    void drive(){
        System.out.println("This can auto drive");
    }
    void lock(){
        System.out.println("has autolock functionality");
    }
}


