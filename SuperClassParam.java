package myProject;
class testclass
{
	testclass(int a)
	{
		System.out.println(a);
	}
	
}
public class SuperClassParam extends testclass
{

	SuperClassParam()
	{
		super(10);
		System.out.println("This is second statement");

	}

	public static void main(String[] args) 
	{
		new SuperClassParam();
	}
	
}
