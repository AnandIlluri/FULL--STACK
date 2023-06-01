package day15;
import java.util.Scanner;
class a extends Thread {
public void run() {
  
System.out.println("this thread is internally called by start/run()");
}
}
class threading{
public static void main(String[] args) {
	Thread t=Thread.currentThread();
for(int i=0;i<=5;i++)
{

	System.out.println("Im main thread");
	try {
		Thread.sleep(5000);
	}catch(InteruptedException E)
		}
		//maink m=new maink()
		//.run();
	}
}
