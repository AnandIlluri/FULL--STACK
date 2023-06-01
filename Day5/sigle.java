package day15;

public class sigle {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		for(int i=0;i<=5;i++){
		try {
		Thread.sleep();
		}
		catch(Exception E) {
			System.out.println("single Thread");
		}
		}
	}
}
	


