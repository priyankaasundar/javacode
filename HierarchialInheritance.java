package myProject;
class HierarchialInheritance 
{
	static void test()
	{
		System.out.println("Area");
	}
}

class child1 extends HierarchialInheritance
{	
	static void area1()
{
	System.out.println("Area1");
}
	}
class child2 extends HierarchialInheritance
{
	static void area2()
{
	System.out.println("Area2");
}	
}
class app
{
	public static void main(String[] args)
	{
		HierarchialInheritance c=new HierarchialInheritance();
		c.test();
		child2 c1=new child2();
		c1.test();
	}
}


