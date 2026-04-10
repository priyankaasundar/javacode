package myProject;
import java.util.Scanner;
public class AdditionOfStudents 
{
public static void main(String[] args)
{
	Scanner v=new Scanner(System.in);
	for(int i=1;i<=10;i++)
	{
	System.out.println("Student"+i);
	System.out.println("Enter num1");
	int a=v.nextInt();
	System.out.println("Enter num2");
	int b=v.nextInt();
	int c= a+b;
	System.out.println("sum of two numbers"+" "+c);
	
   }
	v.close();
}	

}
