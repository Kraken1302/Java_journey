package Day2;
import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no whose factorial you want");
        int num1= sc.nextInt();
        int fact=1;
        for(int i=1;i<=num1;i++){
            fact *=i;
        }
        System.out.println(fact);
    }
}
