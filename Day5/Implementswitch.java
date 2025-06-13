package Day5;
import java.util.Scanner;
public class Implementswitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int digit =sc.nextInt();
        switch (digit) {
            case 1 :System.out.println("your no is one");
                break;
                case 2 :System.out.println("your no is one");
                break;
                case 3 :System.out.println("your no is one");
                break;
            default:
                throw new AssertionError();
        }
    }
}
