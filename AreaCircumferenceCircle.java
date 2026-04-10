package myProject;

import java.util.Scanner;

public class AreaCircumferenceCircle {
	
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		AreaCircumferenceCircle.area();
		AreaCircumferenceCircle.circumference();
		
	}

public static void area()
{
	Scanner a=new Scanner(System.in);
	System.out.println("Enter radius of circle");
	int r=a.nextInt();
	double area=Math.PI*r*r;
	System.out.println("Area of circle is"+area);
		
}
public static void circumference()
{
	Scanner a=new Scanner(System.in);
	System.out.println("Enter radius of circle");
	int r=a.nextInt();
	double area=Math.PI*r*r;
	System.out.println("Circumference of circle is"+area);
}
}