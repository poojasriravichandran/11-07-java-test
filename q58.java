import java.util.*;
public class Calculator{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int val=sc.nextInt();
int res=0;
switch(val){
case 1:
res=a+b;
break;
case 2:
res=a-b;
break;
case 3:
res=a*b;
break;
case 4:
res=a/b;
break;
case 5:
res=a%b;
break;
default:
}
System.out.println("Calculated value :"+res);
}
}
