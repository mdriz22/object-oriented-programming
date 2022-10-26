import java.util.*;
import java.io.*;
class Employee
{
int id;
float grosssalary,netsalary,bpay;
String name,address,mail,mno;
Scanner get=new Scanner(System.in);
Employee()
{
System.out.println("Enter name of the Employee:");
name=get.next();
System.out.println("Enter id:");
id=get.nextInt();
System.out.println("Enter address of Employee:");
address=get.next();
System.out.println("Enter mailid of Employee:");
mail=get.next();
System.out.println("Enter mobile no of Employee:");
mno=get.next();
}
void salary()
{
grosssalary=(0.97f*bpay)+(0.10f*bpay)+(0.12f*bpay)+(0.001f*bpay)+bpay;
netsalary=grosssalary-((0.12f*bpay)+(0.001f*bpay));
}
void display()
{
System.out.println("Employee Name:"+name);
System.out.println("ID:"+id);
System.out.println("Mail ID:"+mail);
System.out.println("Address:"+address);
System.out.println("Mobile No:"+mno);
System.out.println("Grosssalary:"+grosssalary);
System.out.println("Netsalary:"+netsalary);
}
}
class Programmer extends Employee
{
Programmer()
{
System.out.println("Enter Basic pay:");
bpay=get.nextFloat();
salary();
}
void display() 
{
System.out.println("\n....\n Programmer\n....\n");
super.display();
}
}
class AssistantProfessor extends Employee
{
AssistantProfessor()
{
System.out.println("Enter Basic pay:");
bpay=get.nextFloat();
salary();
}
void display()
{
System.out.println("....\n AssistantProfessor\n....\n");
super.display();
}
}
class AssociateProfessor extends Employee
{
AssociateProfessor()
{
System.out.println("Enter Basic pay:");
bpay=get.nextFloat();
salary();
}
void display()
{
System.out.println("....\n AssociateProfessor\n....\n");
super.display();
}
}
class Professor extends Employee
{
Professor()
{
System.out.println("Enter Basic pay:");
bpay=get.nextFloat();
salary();
}
void display()
{
System.out.println("....\n Professor\n....\n");
super.display();
}
}
class Employees
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("....\n PAY SLIPS\n....\n 1.Professor\n2.AssociateProfessor\n3.AssistantProfessor\n4.Programmer");
System.out.println("\n choose the type of Employee");
int choice=Integer.parseInt(br.readLine());
switch(choice)
{
case 1:
System.out.println("\n....\n Enter Professor Details\n...."+"\n");
Professor ob1=new Professor();
ob1.display();
break;
case 2:
System.out.println("....\n Enter AssociateProfessor Details\n...."+"\n");
AssociateProfessor ob2=new AssociateProfessor();
ob2.display();
break;
case 3:
System.out.println("....\n Enter AssistantProfessor Details\n...."+"\n");
AssistantProfessor ob3=new AssistantProfessor();
ob3.display();
break;
case 4: 
System.out.println("\n....\n Enter Programmer Details\n...."+"\n");
Programmer ob4=new Programmer();
ob4.display();
break;
default:
System.out.println("\n....\n Enter correct choice:");
break;
}
}
}










































































