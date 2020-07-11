import java.util.*;
public class Intrest{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double num=sc.nextDouble();
double inst=0.07;
double val=0.0;
double time=1.0;
double amt=0.0;
val=num*inst;
double range=(inst/val);
amt=num*(Math.pow((1.0+range),(val*time)));
System.out.println(amt);
}
}

