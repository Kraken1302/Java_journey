package ATM_project;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int[] balance = {5000, 4000, 7000};
        int pin[]= {123, 456, 789};
        System.out.println("Enter Your Account no: from(0-2)");
        int accountname= sc.nextInt();

        if(accountname<0 && accountname>2){
            System.out.println("Please Enter a no only in the range specified");
        }
        System.out.println("Enter your PIN");
        int mypin=sc.nextInt();
        if(mypin != pin[accountname]){
            System.out.println("You have entered wrong PIN!");
        }
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Your Balance is: "+balance[accountname]);
            break;
            case 2:
            System.out.println("Enter amount you want to Deposit:");
            int deposit= sc.nextInt();
            balance[accountname] += deposit;
            System.out.println("SUCCESSFUL ! New Balance is: "+ balance[accountname]);
            break;
            case 3:
            System.out.println("Enter amount you want to Withdraw:");
            int withdraw= sc.nextInt();
            if(withdraw > balance[accountname]){
                System.out.println("Insufficient balance");
            }else{
                balance[accountname] -= withdraw;
                System.out.println("SUCCESSFUL ! New Balance is: "+ balance[accountname]);
            }
            break;
            case 4:
                System.out.println("Thank you! Exiting.");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
       

