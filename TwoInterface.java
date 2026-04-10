package myProject;
interface name4
{
	void add1();
}
interface name3 extends name4
{
	void add2();
}
public class TwoInterface implements name3
{

	public static void main(String[] args) 
	{
		TwoInterface b=new TwoInterface();
		b.add1();
		b.add2();
	}
	public void add1() 
	{
	System.out.println("add1 method");	
		
	}

	
	public void add2() 
	{
		
		System.out.println("add1 method");	
	}

}
