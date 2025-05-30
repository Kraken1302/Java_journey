package Day2;
import java.util.Scanner;
public class Sumdigit {
    public static void main(String[] args) {
        System.out.println("Enetr a two Digit no");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;
        while(num!=0){
            int r =num%10;
            sum+=r;
            num /=10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
