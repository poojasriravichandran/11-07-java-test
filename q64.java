import java.util.Scanner;
public class Mth_inst{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int amt=sc.nextInt();
double inst=5.0/100;
double mth_inst=inst/12;
int mth=sc.nextInt();
double total=0.0;
for(int i=1;i<=mth;i++){
total=(total+amt)*(1+mth_inst);
System.out.println("Total amount during "+i+" is "+total);
}
}
}
