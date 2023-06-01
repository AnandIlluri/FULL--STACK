import java.util.Scanner;
public class second{
public static void main (String []args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the age:");
int age=sc.nextInt();
if(age>=18)
{
System.out.println("Eligible to vote");
}
else if(age>18)
{
System.out.println("Also eligible to vote");
}
else
{
System.out.println("Not Eligible to vote");
}
}
}
