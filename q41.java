import java.util.*;
public class Tictac_toe{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int arr[][]=new int[n][m];
int val=sc.nextInt();
int count=0,count1=0;
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
arr[i][j]=sc.nextInt();
}
}
for(int i=0;i<n;i++) {
for(int j=0;j<m;j++) {
if(i==val || j==val) {
if(arr[i][j]==1) {
count++;
}
else {
count1++;
}
}
}
}
System.out.println(count);
}
}
