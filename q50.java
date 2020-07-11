import java.util.*;
public class Total_days{
public static int numberOfDaysInAYear(int year){
int val=0;
if (year % 4 == 0) {
if (year % 100 == 0) {
if (year % 400 == 0)
val=366;
else
val=365;
} 
else
val=366;
} 
else
val=365;
return val;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
for(int i=2000;i<=2010;i++) {
System.out.println("Number of days in a year :"+numberOfDaysInAYear(i));
}
}
}

