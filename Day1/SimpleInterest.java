import java.util.Scanner;
class SimpleInterest{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter principle");
int num1=sc.nextInt();
System.out.println("Enter rate");
int num2=sc.nextInt();
System.out.println("Enter time");
int num3=sc.nextInt();
System.out.println("SI is"+((num1*num2*num3)/100));
}
}