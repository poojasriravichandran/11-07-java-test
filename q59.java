import java.util.Scanner;
public class Word_newline {
public static void main(String[] args) {
System.out.println("Enter a Sentence:");
Scanner sc=new Scanner(System.in);
String str =sc.nextLine();
String wordArray[] = str.trim().split(" ");
for(int i=0;i<wordArray.length;i++) {
System.out.println(wordArray[i]);	
}
}
}
