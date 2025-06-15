package Day5;

public class Overloading {
    public static void main(String[] args) {
        // int x;
        // int y;
        // int z;
        int sum= add(10,5);
        int sum =add(1,2,3);
        System.out.println(sum);
    }
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
