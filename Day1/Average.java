import java.util.Scanner;
class Average{
public static void main (String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter Your  5 numbers");
int num1= sc.nextInt();
int num2= sc.nextInt();
int num3= sc.nextInt();
int num4= sc.nextInt();
int num5= sc.nextInt();
int sum= num1+num2+num3+num4+num5;
System.out.println("Average is:" + sum/5);
}
}