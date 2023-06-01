package Day1;

public class InstanceArr {
public static void main(String args[])
{
		    String originalInt = "1,2,3,4,5";
		    String reverseInt = "";
		    String percentage ="15%";
		    System.out.println("Original Int: " + originalInt);
		        for (int i = 0; i < originalInt.length(); i++) {
		      reverseInt = originalInt.charAt(i) + reverseInt;
		    }
		     System.out.println("Reverse Int: "+ reverseInt);
		  }
}

