package myProject;

import java.util.Scanner;

public class AreaCircumferenceRectangle {
	
	
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		int l=a.nextInt();
		System.out.println("Enter breadth of rectangle");
		int b=a.nextInt();
		int area=l*b;
		System.out.println("Area of rectangle is"+area);
		int circumference= 2*(l*b);
		System.out.println("Circumference of rectangle is"+circumference);
	}
	

}
