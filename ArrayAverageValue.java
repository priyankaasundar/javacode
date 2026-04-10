package myProject;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayAverageValue 
{
public static void main(String[] args) 
{
int []	array=new int[5];
int sum=0;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the values of an array");
for(int i=0;i<5;i++)
{    array[i]=s1.nextInt();
	 sum=array[i]+sum;	
}
System.out.println("This is the array"+Arrays.toString(array));
System.out.println(sum);
double average=sum/array.length;
System.out.println("Average if the given array"+average);
}
}
