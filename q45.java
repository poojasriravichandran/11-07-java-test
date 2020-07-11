import java.util.*;
public class Time_cal{
public static void main(String args[]){
int num=3567;
int digit=0;
int sum=0;
int start=0;
int end=0;
while(num!=0){
digit=num%10;
num=num/10;
sum=sum*10+digit;
}
end=(int)System.currentTimeMillis();
System.out.println("Reverse of a number is :"+ sum);
System.out.println(end-start);
}
}
