package myProject;

public class MultiLevelInheritance
{
	static void  multi() 
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(+c);
	}
}
class MultiLevelInheritance1 extends  MultiLevelInheritance
{
	static void div()
	{
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println(+c);
	}
}
class MultiLevelInheritance2 extends  MultiLevelInheritance1
{
	public static void main(String[] args)
	{

		MultiLevelInheritance1 m1=new MultiLevelInheritance1();
		m1.div();
		m1.multi();
		
	}
}