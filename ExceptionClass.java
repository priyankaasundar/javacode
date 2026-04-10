package myProject;

import java.util.InputMismatchException;
import java.util.Scanner;



public class ExceptionClass 
{
public static void main(String[] args)
{
	int a=10;
	try
	{
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	System.out.println(a);
	}
	catch(InputMismatchException b)
	{
		System.out.println("Enter only integer values");
	}
}
}
