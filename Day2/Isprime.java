// package Day2;

// import java.util.Scanner;

// public class Isprime {
//     public static void main(String[] arg){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Input a no.");
//         int num=sc.nextInt();
//         if (num <= 1) {
//             System.out.println(num + " is NOT Prime");
//             return;
//         }
//         for (int i = 2; i < num; i++) {
//             if(num%i==0){
//               System.out.println("Not Pirme");
//               return;  
//             }
//         }
//         System.out.println("Prime");
//     }
// }
package Day2;
import java.util.Scanner;
public class Isprime{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input a no.");
        int num=sc.nextInt();
        boolean prime=true;
        if (num <= 1) {
            prime=false;
        }else{
            for (int i=2;i<num/2;i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
            }
        }
          if (prime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is NOT Prime");
        }
    }  
}
