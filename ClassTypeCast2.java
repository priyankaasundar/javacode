package myProject;
class ClassNew2
{ 
	int a=10;
	void add()
	{
		System.out.println(a);
	}
}

public class ClassTypeCast2 extends ClassNew2
{

	public static void main(String[] args) 
	{
		ClassNew2 v=(ClassNew2)new ClassTypeCast2();
		ClassTypeCast2 b=(ClassTypeCast2)v;
	v.add();
		
	}

}
