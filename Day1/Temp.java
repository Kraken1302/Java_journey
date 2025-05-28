import java.util.Scanner;
class Temp{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter temp in Celcius");
int num1=sc.nextInt();
System.out.println("Temp in Farenheit is"+((num1*9/5)+32));
}
}