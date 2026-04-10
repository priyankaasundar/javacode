package myProject;
import java.util.Scanner;
public class Calculator 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println("Enter operator");
	 char character = s.next().charAt(0);
	switch(character)
	{
	case '+':
		int c=a+b;
		System.out.println("Addition"+c);
		break;
	case '-':
		 c=a-b;
		System.out.println("Subtraction"+c);
		break;
	case '*':
		c=a*b;
		System.out.println("Multiply"+c);
		break;
	case '/':
		c=a/b;
		System.out.println("Division"+c);
		break;
		default:
			System.out.println("invalid character");
}
}
}
