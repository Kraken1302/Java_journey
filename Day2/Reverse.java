package Day2;
import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int num= sc.nextInt();
        int ans=0;
        while(num!=0){
            int r=num%10;
            ans= ans*10 + r;
            num /= 10;
        }
        System.out.println(ans);

    }
}
