import java.util.*;
public class Pay_back{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double per1=sc.nextDouble();
double per2=sc.nextDouble();
double inst1=0.25/100;
double inst2=0.50/100;
double inst3=0.75/100;
double inst4=1.0/100;
double pay1=0.0,pay2=0.0;
if(per1<=500 || per2<=500){
pay1=inst1*per1;
pay2=inst1*per2;
}
else if((per1>500 || per1 <=1500) || (per2>500|| per2<=1500)){
pay1=inst2*per1;
pay2=inst2*per2;
}
else if((per1>1500 || per1 <=2500) || (per2>1500|| per2<=2500)){
pay1=inst3*per1;
pay2=inst3*per2;
}
else{
pay1=inst4*per1;
pay2=inst4*per2;
}
System.out.println("Pay person 1:"+pay1+"\nPay person 2:"+pay2);
}
}
