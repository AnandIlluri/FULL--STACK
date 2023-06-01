package day13;
import java.util.ArrayList;
import java.util.Iterator;
public class iterate {
	public static void main(String[] args) {
		ArrayList <String> a=new ArrayList<String>();
    a.add("vinod");
	a.add("tejashwini");
	a.add("arpita");
	a.add("kiran");
	System.out.println(a);
		Iterator i=a.iterator();
		while(i.hasNext()){
				if(i.next().equals("vinod"))
				{
					i.remove();
				}
			}
			System.out.println(a);
		}
	}