package myProject;
public class MethodOverrideAvoid

{
	final void add() //final keyword is used hence method overriding will be avoided
	{
		System.out.println("This is A");
	}
public static void main(String[] args)
{
	MethodOverrideAvoid n=new MethodOverrideAvoid();
	n.add();
	Sample.add();
		
}
}
class Sample
{
	 static void add()
	{
		System.out.println("This is B");
	}
}