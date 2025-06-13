package Day5;
import java.util.Random;
import java.util.Scanner;
public class ImplementRandom {
    public static void main(String[] args) {
        Random rand= new Random();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter th no upto where you want to print random no");
        int y = sc.nextInt();
        int x = rand.nextInt(y)+1;
        System.out.println(x);
    }
}
