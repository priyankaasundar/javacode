package myProject;
 class parent  
{
	public static void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(+c);
	}
}
 public class SingleInheritance extends parent
 {
 	public static void sub()
 	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(+c);	
 	}
 	public static void main(String[] args)
 	{
 add();
 sub();
     }
 }
