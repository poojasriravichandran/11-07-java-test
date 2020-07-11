import java.util.*;
public class Set_seed{
public static void main(String args[]){
Random rand=new Random();
 val=35;
rand.setSeed(val);
System.out.println(rand.nextInt());
}
}
