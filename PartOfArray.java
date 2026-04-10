package myProject;
import java.util.Scanner;

public class PartOfArray 
{
public static void main(String[] args) 
{
	int[] a=new int[2];
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number which you want to find in the array");
	int numtocheck=s.nextInt();	
	System.out.println("Enter the array values");
	for(int i=0;i<=1;i++)		
	{
		a[i]=s.nextInt();	
		if(numtocheck==a[i])
		{
			System.out.println("value is present");
		}
		else
		{
			System.out.println("value is not present");
		}
	}
	s.close();	
}
}
