package OOPs;

public class Arrayobj {
    public static void main(String[] args) {
        food[] refigerator=new food[3];
        food f1= new food("dhaniya");
        food f2= new food("kaanda");
        refigerator[0]=f1;
        refigerator[1]=f2;
       
            System.out.println(refigerator[0].name);
    }
}
class food{
    String name;
    food(String name){
        this.name= name;
    }
}
