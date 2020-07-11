import java.util.*;
public class Reverse_num{
public static void reverse(int num){
int digit=0;
int sum=0;
while(num!=0){
digit=num%10;
num=num/10;
sum=sum*10+digit;
}
System.out.println("Reverse of a number is :"+ sum);
}
public static void main(String args[]){
reverse(3456);
}
}

