package OOPs;

public class AbsTraction {
    public static void main(String[] args) {
        car c1= new car();
        // System.out.println(c1.go());  System.out.println(c1.go());
// This expects go() to return something (like a String or int), because:
// System.out.println(...) tries to print whatever is returned.
        c1.go();
    }
}
public abstract class  Vehicle{
    abstract void go();
}
public class car extends Vehicle{
    void go(){
        System.out.println("started");
    }
}
