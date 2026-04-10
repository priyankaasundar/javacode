package myProject;
abstract class name
{
	abstract void add();
	void sub()
	{
		System.out.println("This is concrete method inside abstract class");
	}
}
 class AbstractConcrete extends name
 {
	 public static void main(String[] args) 
	 {
		AbstractConcrete a=new AbstractConcrete();
		a.add();
	a.sub();
	}
	 void add()
	 {
		 System.out.println("This is concreate method");
	 } 
 }

