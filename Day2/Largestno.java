package Day2;
import java.util.Scanner;
public class Largestno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your 1 no");
        int num1= sc.nextInt();
        System.out.println("Enter your 2 no");
        int num2= sc.nextInt();
        if(num1>num2){
            System.out.println(num1 + " is larger");
        } 
        else if(num1==num2){
            System.out.println("Both are equal");
        }
        else{
            System.out.println(num2 + " is larger");
        }
    }
}
