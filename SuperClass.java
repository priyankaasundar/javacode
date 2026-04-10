package myProject;

class SubClass
{
	SubClass()
	{
		System.out.println("This will be executed first");

	}
}
class SuperClass extends SubClass
{
	SuperClass()
	{
		System.out.println("This will be executed after executing parent class constructor");
	}
	public static void main(String[] args)
	{
		new SuperClass();
	}
}