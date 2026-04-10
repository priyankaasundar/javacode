package myProject;

public class StaticMethod {
	 static void add()
		{
			int a=10;
			int b=120;
			System.out.println(a+b);
		}

	public static void main(String[] args)
	{
		System.out.println("Calling Static method in main method");

	add();	
	}

}
