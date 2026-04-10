package myProject;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray
{
public static void main(String[] args)
{
	int[] a1=new int[3];
	int[] a2=new int[3];
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter first array value");
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=s1.nextInt();	
	}
	System.out.println("Values of first array"+Arrays.toString(a1));
	System.out.println("Reverse value of first array");
	for(int i=0,j=a1.length-1;i<a2.length;j--,i++)
	{
		a2[i]=a1[j];
	}
	System.out.println(Arrays.toString(a2));
}
}
