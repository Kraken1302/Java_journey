package Day2;
import java.util.Scanner;
public class Tablemultiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no whose table you want");
        int num1= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num1*i);
        }
    }
}
