package myProject;
class Class1
{
	void Class1(int age)
	{
		System.out.println("This is parent class"+age);
	}
}

public class MethodOverride89 extends Class1
{
  MethodOverride89()
{
	super.Class1(25);
	System.out.println("This is child class");
}
public static void main(String[] args)
{
	
MethodOverride89 b=new MethodOverride89();

}
}
