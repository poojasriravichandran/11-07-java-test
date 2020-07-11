import java.util.*;
public class Word_count{
public static void main (String[] args) {
System.out.println("Enter a Sentence:");
Scanner sc=new Scanner(System.in);
String str =sc.nextLine();
String wordArray[] = str.trim().split(" ");
int wordCount = wordArray.length;
System.out.println("input sentence:"+str);
System.out.println("Word count: " + wordCount+" words");
}
}
