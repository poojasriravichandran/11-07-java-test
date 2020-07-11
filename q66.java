import java.util.*;
public class Circle{
double dx;
double dy;
double dRadius;
Circle(){
System.out.println("find area of circle");
}
Circle(double dx,double dy,double dRadius){
this.dx=dx;
this.dy=dy;
this.dRadius=dRadius;

}
double Area() {
double area=(22.0/7.0)*dRadius;
return area;
}
public String toString() {
return dx+" "+dy+" "+dRadius;
}
public static void main(String args[]){
Circle c=new Circle(2,3,4);
System.out.println(c);
System.out.println(c.Area());
} 
}

