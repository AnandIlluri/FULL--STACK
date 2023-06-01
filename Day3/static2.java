package day12;

public class static2 {
		int rollno;
		String name;
		static String college="VIT";
		static void fun89() {
			  college="CBIT";
		}
		static2(int r,String n){
			rollno=r;
			name=n;
		}
		void display() {
			System.out.println(rollno+" "+name+" "+college);
		}
		public static void main(String args[]) {
			static2 s1=new static2(111,"anand");
			static2 s2=new static2(222,"figure");
			static2.fun89();
			s1.display();
			s2.display();
	}

}
