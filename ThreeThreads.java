import java.util.*;
class even implements Runnable
{
public int X;
public even(int X)
{
this.X=X;
}
public void run()
{
System.out.println("Thread-2:"+X+" is EVEN and Square of "+X+" is:"+X*X);
}
}
class odd implements Runnable
{
public int X;
public odd(int X)
{
this.X=X;
}
public void run()
{
System.out.println("Thread -3:"+X+" is ODD and Cube of "+X+" is:"+X*X*X);
}
}
class A extends Thread
{
public void run()
{
int num=0;
Random r=new Random();
try
{
for(int i=0;i<5;i++)
{
num=r.nextInt(100);
System.out.println("Thread-1: Generated Number is " +num);
if(num%2==0)
{
Thread t1=new Thread(new even(num));
t1.start();
}
else
{
Thread t2=new Thread(new odd(num));
t2.start();
}
//Thread.sleep(1000);
System.out.println(" ");
}
}
catch (Exception ex)
{
System.out.println(ex.getMessage());
}
}
}
public class ThreeThreads
{
public static void main(String[]args)
{
A a=new A();
a.start();
}
}
  
