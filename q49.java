import java.util.*;
public class Can_cal{
public static void main(String args[]){
int can=6;
double litter=0.355;
double total=can*litter;
double ind_amt=100.00;
double total_ind_amt=total*ind_amt;
double doll=total_ind_amt/70.00;
double cents=(total_ind_amt/70.00)/100;
System.out.println("Dollar :"+doll);
System.out.println("Cents :"+cents);
}
}
