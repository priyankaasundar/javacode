package myProject;
class ClassNew1
{ 
	int a=10;
	void add()
	{
		System.out.println(a);
	}
}
public class ClassTypeCast1 extends ClassNew1
{

	public static void main(String[] args)
	{	
		ClassNew1 v=(ClassNew1)new ClassTypeCast1();
		//ClassNew1 v=new ClassTypeCast1();
		v.add();
		System.out.println(v.a);
	}


}
