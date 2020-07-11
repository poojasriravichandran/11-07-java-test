import java.util.*;
public class Random_function{
public static void main(String args[]){
for(int i=0;i<10;i++){
	Random rand=new Random(5);
	System.out.println(rand.nextInt());
}
}
}

