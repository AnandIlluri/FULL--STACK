package day15;

public class thread {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("anand");
		t.setPriority(6);
		System.out.println(t);
		}

}
