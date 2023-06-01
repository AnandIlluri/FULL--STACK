package day13;
import java.util.ArrayList;
public class Arraylist {
public static void main(String[] args) {
        ArrayList object=new ArrayList();
		object.add("Suresh");
		object.add("Anand");
        object.add("Reddy");
		object.add("Tharun");
		System.out.println(object);
		ArrayList object1=new ArrayList();
		object1.add(11);
		object1.add(2.1);
		object.remove("Suresh");
		object.addAll(object1);
		System.out.println(object);
		System.out.println(object.size());
}
}