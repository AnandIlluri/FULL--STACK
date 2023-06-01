package day15;

import java.util.Scanner;

class assigement extends Thread{
	public void run() {
		System.out.println("student started");
		System.out.println("assign the assignment");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	try {
		Thread.sleep(3000);	
	}
	catch(Exception E) {
		
	}
	System.out.println("the assignment");
	}}
class print extends Thread{
	public void run() {
		
		for(int i=0;i<=4;i++) {
			System.out.println("cbit");
		try {
			Thread.sleep(2000);
			
		}
		catch(Exception E) {
	}
}
}
}
class multiee extends Thread{
	public void run() {
		int a=10;
		int b=20;
		try {
			Thread.sleep(5000);
			
		}
		catch(Exception E) {
		}
			System.out.println(a*b);
	}
}

public class singThr{
	public static void main(String[] args) {
		assigement a=new assigement();
		print p=new print();
		multiee m=new multiee();
		a.start();
		p.start();
		m.start();
		
	}
}
