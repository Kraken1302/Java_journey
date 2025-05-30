package Day2;
import java.util.Scanner;
class Oddeven{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input a no.");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        
    }
}
