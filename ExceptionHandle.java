package myProject;
import java.util.Arrays;
import java.util.Scanner;
public class ExceptionHandle 
{
 public static void main(String[] args)
 {	
	 int a=10;
	 int b=0;
	 try
	 {
		 int c=a/b;
		 System.out.println(c);
	 }
	 catch(ArithmeticException a1)
	 {
		System.out.println("anything divide by zero is not applicable"); 
	 }
	 
	 try

	 { 
		 Scanner a1=new Scanner(System.in);
		 int array1=a1.nextInt();
	
		 int[] array= new int[array1]; 
		 array[0]=1;
		 array[1]=2;
		 array[2]=3;
		 System.out.println(Arrays.toString(array));	 
	 }
	 catch(ArrayIndexOutOfBoundsException b1)
	 {
		System.out.println("Array size only2"); 
	 }

}
	
}
