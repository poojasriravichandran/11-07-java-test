import java.util.*;
public class Dice_rollnum{
public static void main(String args[]){
int val=(int)(Math.random()*6)+1;
int count=0;
for(int i=0;i<100;i++){
count++;
if(i==val){
break;
}
else{
continue;
}
}
System.out.println("num on dice:"+val+"\ntotal roll:"+count);
}
}

