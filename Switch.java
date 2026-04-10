package myProject;

import java.util.Scanner;

public class Switch 
{
public static void main(String[] args) {
	int a=10;
	int b=15;
	String Operator;
	Scanner s=new Scanner(System.in);
	Operator=s.next();
	switch(Operator)
	{
	case "+":
		int c=a+b;
		System.out.println(c);
		break;
	case "-":
		int d=a-b;
		System.out.println(d);
		break;
		default:
			System.out.println("out");
			break;
	}
}
}
