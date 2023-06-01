package day12;
interface infe{
	public void name();
	public void details();
}
class class1 implements infe{
	public void name() {
		String name="sunny";
		System.out.println(name);
	}
	public void details() {
		String name="reddy";
		int age=21;
		String collage="CBIT";
		System.out.println(name);
		System.out.println(age);
		System.out.println(collage);
	}
	
}
class class2 implements infe{
	public void name() {
		String name="Anand";
		System.out.println(name);
	}
	public void details() {
		String name="Suresh";
		int age=21;
		String collage="CBIT";
		System.out.println(name);
		System.out.println(age);
		System.out.println(collage);
	}
}

public class inter {

	public static void main(String[] args) {
		class1 obj1=new class1();
		obj1.name();
		obj1.details();
		class2 obj2=new class2();
		obj2.name();
		obj2.details();
	}

}