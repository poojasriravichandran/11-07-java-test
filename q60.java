import java.util.Scanner;
public class Input_type{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String num7=sc.nextLine();
int num1=sc.nextInt();
long num2=sc.nextLong();
double num3=sc.nextDouble();
short num4=sc.nextShort();
float num5=sc.nextFloat();
char num6=sc.next().charAt(0);
System.out.println("num1 :"+num1+"\nnum2 :"+num2+"\nnum3 :"+num3+"\nnum4 :"+num4+" \nnum5 :"+num5+"\nnum6 :"+num6+"\nnum7 :"+num7);
}
}

