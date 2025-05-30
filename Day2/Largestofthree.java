//  package Day2;
// import java.util.Scanner;
// public class Largestofthree {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter your 1 no");
//         int num1= sc.nextInt();
//         System.out.println("Enter your 2 no");
//         int num2= sc.nextInt();
//         System.out.println("Enter your 3 no");
//         int num3= sc.nextInt();
//         if(num1>num2){
//             if(num1>num3){
//                 System.out.println(num1 + " is larger");
//             }
//             else{
//                 System.out.println(num3 + " is larger");
//             }
//         } 
//         else if(num1<num2){
//             if(num2>num3){
//                 System.out.println(num2 + " is larger");
//             }
//             else{
//                 System.out.println(num3 + " is larger");
//             }
            
//         }
//     }
// }

package Day2;
import java.util.Scanner;
public class Largestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1 no");
        int num1 = sc.nextInt();
        System.out.println("Enter your 2 no");
        int num2 = sc.nextInt();
        System.out.println("Enter your 3 no");
        int num3 = sc.nextInt();

        // Using if-else if ladder
        if(num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is largest");
        }
        else if(num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is largest");
        }
        else {
            System.out.println(num3 + " is largest");
        }
    }
}
