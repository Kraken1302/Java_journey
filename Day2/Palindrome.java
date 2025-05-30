package Day2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int num = sc.nextInt();
        int originalNum = num; // store the original number

        int ans = 0;
        while(num != 0){
            int r = num % 10;
            ans = ans * 10 + r;
            num /= 10;
        }

        // compare with originalNum instead of num
        if (originalNum == ans) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
