import java.util.Arrays;

public class Employee_hour{
public static void insert(int arr[]){
int min=arr[0],temp=0;
for(int i=0;i<7;i++){
for(int j=i+1;j<7;j++){
if(arr[i]>arr[j]){
temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}
}
}
for(int i=0;i<7;i++){
System.out.println(arr[i]);
}
}
public static void main(String args[]){
int arr[]= {2,4,3,4,5,8,8};
int arr1[]={7,3,4,3,3,4,4};
insert(arr);
insert(arr1);
System.out.println("employee1 :"+ Arrays.toString(arr));
System.out.println("employee2 :"+ Arrays.toString(arr1));
}
} 
