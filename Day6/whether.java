import java.util.Scanner;
public class whether{
public static void main(String[]args)
{
Scanner sc=new Scanner (System.in);
System.out.println("enter the temp:");
int a=sc.nextInt();
if(a>=45)
{
System.out.println("summer");
}
else if(a<=41)
{
System.out.println("either summer or winter");
}
else
{
System.out.println("winter");
}
}
}