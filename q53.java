import java.util.*;
public class Snake_eye{
public static void main(String args[]){
int count=0;
for(int i=0;i<100;i++){
count++;
int val1=(int)(Math.random()*6)+1;
int val2=(int)(Math.random()*6)+1;
if(val1==1&&val2==1){
break;
}
else{
continue;
}
}
System.out.println("total counts:"+count);
}
}

