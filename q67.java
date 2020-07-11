import java.util.*;
import java.lang.Math;
public class Guess{
public static void main(String args[]){
Random rand=new Random();
int head=1;
int tail=0;
int guess=rand.nextInt();
if(guess==head||guess==tail){
System.out.println("correct");
}
else{
System.out.println("incorrect");
}
}
}

