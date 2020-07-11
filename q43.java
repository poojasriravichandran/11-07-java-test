import java.util.*;
public class Balance{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double total_amount=sc.nextDouble();
double paidamount=sc.nextDouble();
double inst=sc.nextDouble();
double balance=0.0;
balance=paidamount*((1-Math.pow((1+inst),(1-total_amount)))/inst);
System.out.println("Balance amount is :"+balance);
}
}
