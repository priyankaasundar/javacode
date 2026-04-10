package myProject;

import java.util.Scanner;

public class AreaCircumferenceTriangle {

	
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		AreaCircumferenceTriangle.area();
		AreaCircumferenceTriangle.circumference();
		
	}
	public static void area()
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter breadth");
		int b= s.nextInt();
		System.out.println("Enter height");
		int h= s.nextInt();
		int area=(b*h)/2;
		System.out.println("Area is"+ area);
	}
	public static void circumference()
	{
		
		Scanner v = new Scanner(System.in);
		System.out.println("Enter side1");
		int a= v.nextInt();
		System.out.println("Enter side2");
		int b= v.nextInt();
		System.out.println("Enter side3");
		int c=v.nextInt();
		int cir= a+b+c;
		System.out.println("Circumference of Triangle is"+cir);
	}
}
