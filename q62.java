import java.util.Scanner;
public class Use_de{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
str.useDelimiter("\\s");
while(str.hasNext()){  
System.out.println(str.next());  
}  
str.close();
}
}
