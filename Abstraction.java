package myProject;
interface name2
{
	void method3();
	void method4();
}
abstract class name1 implements name2
{
	abstract void method1();
	void method2()
	{
		System.out.println("This is concrete method");
	}
}
public class Abstraction extends name1
{
public static void main(String[] args) 
{
	Abstraction m=new Abstraction();
	m.method1();
	m.method2();
	m.method3();
	m.method4();
}
void method1()
{
	System.out.println("This is method inside concrete class");
}
public void method3()
{	System.out.println("method3");
	
}
public void method4()
{
		System.out.println("method4");	
}
}
