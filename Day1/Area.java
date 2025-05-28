import java.util.Scanner;
class Area{
public static void main (String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter length");
int num1= sc.nextInt();
System.out.println("Enter width");
int num2= sc.nextInt();
System.out.println("Area is:" + num1*num2);
}
}