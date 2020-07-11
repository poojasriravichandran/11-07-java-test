import java.util.*;
public class Phone_number{
public static void main(String args[]){
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
String num=sc.nextLine();
String val;
val=num.replaceFirst("(\\d{3})(\\d{3})(\\d+)","$1-$2-$3");
System.out.println("Number using format: "+val);
}
}

