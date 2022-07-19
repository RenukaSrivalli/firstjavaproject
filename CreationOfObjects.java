import java.util.Scanner;
class Code
{
int j=1;
public string names(String name)
{
System.out.println(j +"."+name);
j=j+1;
}
}
class CreationOfObjects
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter strength of class :");
int s=sc.nextInt() ;

for(int i=1;i<=s;i++)
{
   System.out.println("rollno :"+i);
String name=sc.nextLine() ;                        
Code obj=new Code();
obj.names(name)
}
