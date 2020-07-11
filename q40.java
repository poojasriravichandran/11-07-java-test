import java.util.*;
public class Fan{
private int speed=1;
private boolean on=false;
private double radius=5;
String color="blue";
Fan(){
	System.out.println("features of fan");
}
Fan(int speed,boolean on,double radius,String color){
this.speed=speed;
this.on=on;
this.radius=radius;
this.color=color;
}
public String toString(){
return speed+" "+on+" "+radius+" "+color; 
}
public static void main(String args[]){
Fan f1=new Fan(10,true,10.0,"yellow");
Fan f2=new Fan(12,false,5.0,"blue");
System.out.println(f1);
System.out.println(f2);
}
}

