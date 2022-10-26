import java.util.*;
abstract class Shape
{
int length=0;
int height=0;
public abstract void printArea();
}
class Rectangle extends Shape
{
int area=0;
public void printArea()
{
System.out.println("\n Rectangle\n_____");
Scanner input=new Scanner(System.in);
System.out.printf("enter Lenght of Rectangle :");
this.length=input.nextInt();
System.out.printf("enter Breath of Rectangle:");
this.height=input.nextInt();
this.area=this.length*this.height;
System.out.println("Area of the Rectangle is :"+ this.area);
}
}
class Triangle extends Shape
{
double area=0.0;
public void printArea()
{
System.out.println("\n Triangle\n____");
Scanner input=new Scanner(System.in);
System.out.printf("enter Lenght of Triangle :");
this.length=input.nextInt();
System.out.printf("enter Height of Triangle");
this.height=input.nextInt();
this.area=0.5*this.length*this.height;
System.out.printf("Area of the Triangle is :" + this.area);
}
}
class Circle extends Shape
{
double area=0.0;
public void printArea()
{
System.out.println("\n Circle\n----");
Scanner input=new Scanner(System.in);
System.out.printf("enter Radius of Circle:");
this.length=input.nextInt();
this.area=Math.PI*this.length*this.length;
System.out.println("Area of the Circle is :"+ this.area);
}
}
class Absclass
{
public static void main(String[] args)
{
System.out.println("\n-----\nFinding Area \n----");
Shape rt=new Rectangle();
rt.printArea();
Shape tr=new Triangle();
tr.printArea();
Shape cr=new Circle();
cr.printArea();
}
}



