import java.util.Scanner;
public class Vowel_count{
public static void main(String[] args) {
System.out.println("What is your name?");
Scanner sc=new Scanner(System.in);
String  str=sc.nextLine();
int count=0,count1=0;
for(int i=0;i<str.length();i++) {
char ch=str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
count++;
}
else {
count1++;
}
}
System.out.println(str+" ,your name has "+count+" vowels");
}
}




