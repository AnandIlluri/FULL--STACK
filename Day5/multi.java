package day15;
import java.util.Scanner;
public class multi {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	try {
		int c=a/b;
	}
	catch(ArithmeticException E) {
		
	System.out.println("b is grater than a");
	}
}

}
