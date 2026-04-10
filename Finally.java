package myProject;
import java.util.Arrays;
import java.util.Scanner;
public class Finally 
{
public static void main(String[] args) 
{
	try
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter array size");
	int b=s.nextInt();
	int[] a=new int[b];
	for(int i=0;i<b;i++)
	{
		a[i]=s.nextInt();
	}	
	System.out.println(Arrays.toString(a));
}
catch(NegativeArraySizeException s)
{
	System.out.println("Do not enter negative value");
}
	finally {
		System.out.println("This line will always execute irrespective of try and catch block");
	}
}
}
