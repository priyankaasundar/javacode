package myProject;
class second
{
	public  void add()
	{
		System.out.println("This is parent class");
	}
}
public class SuperKeyword extends second
{
	public  void add()
	{		
		super.add();
		System.out.println("This is child class");
	}
	public static void main(String[] args)
	{
 
		SuperKeyword c=new SuperKeyword();
		c.add();
	}
}
