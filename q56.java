import java.util.*;
public class Num_total{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt(); 
int digit=0;
int sum=0;
while(num!=0){
digit=num%10;
num=num/10;
sum=sum+digit;
}
System.out.println("Sum of a number is :"+ sum);
}
}

