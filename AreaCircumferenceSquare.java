package myProject;

import java.util.Scanner;

public class AreaCircumferenceSquare {
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a value");
		int a1=a.nextInt();
		int area=a1*a1;
		System.out.println("Area of circle is"+area);
		int circumference=4*a1;
		System.out.println("Circumference of circle is"+circumference);
	
	}
}
