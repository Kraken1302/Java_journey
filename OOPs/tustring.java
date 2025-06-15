package OOPs;

public class tustring {
    public static void main(String[] args) {
     car car1=new car();
     System.out.println(car1);   
     System.out.println(car1.toString()); 
    }    
}
public class car{
    int tyres;
    String name;
    public String toString(){
        return tyres+name;
    }
}