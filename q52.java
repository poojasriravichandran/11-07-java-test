import java.util.*;
public class Palin_prime{
public static int palin(int num){
int digit=0;
int rev=0;
while(num!=0){
digit=num%10;
num=num/10;
rev=rev*10+digit;
}
return rev;
}
public static int prime(int num){
int val=0;
boolean flag=false;
for(int i = 2; i <= num/2; ++i)
{
if(num % i == 0)
{
flag = true;
break;
}
}
if (!flag)
val=num;
else
val=0;
return val;
}
public static void main(String args[]) {
for(int i=2;i<=1000;i++) {
if(i==palin(i)&&i==prime(i)) {
System.out.println(i);
}
}	
}
}
