package OOPs;

public class Superkey {
    public static void main(String[] args) {
        hero h1 = new hero("Batman", 40, "$$$");
        System.out.println(h1.tostring());
    }
}
public class person{
    int age;
    String name;
    person(String name, int age){
        this.name=name;
        this.age =age;
    }
    String tostring(){
        return this.name +"\n"+this.age;
    }
}
public class hero extends person{
    String power;
    hero(String name, int age, String power){
        super(name,age);
        this.power=power;
    }
    String tostring(){
        return super.tostring()+"\n"+this.power;
    }
}
