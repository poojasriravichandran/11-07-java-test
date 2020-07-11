import java.util.*;
public class Convert_method{
public static double celsiusToFahrenheit(double celsius){
double num=9.0/5;
double fahren=num*celsius+32;
//System.out.println(fahren);
return fahren;
}
public static double fahrenheitToCelsius(double fahrenheit){
double num=9.0/5;
double celsius=(fahrenheit-32)/num;
//System.out.println(celsius);
return celsius;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double val1=sc.nextDouble();
double val2=sc.nextDouble();
System.out.println(celsiusToFahrenheit(val1));
System.out.println(fahrenheitToCelsius(val2));
}
}

