package Day6;
import java.util.Scanner; 

public class ssr {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
System.out.println("Enter key to find its Index:");
int key=sc.nextInt();
for(int i=0;i<n;i++)
{
	if(arr[i]==key)
	{
		System.out.println("The "+key+"find at index:"+1);
	}
sc.close();
}

