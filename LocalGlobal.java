package myProject;
public class LocalGlobal 
{
	 int a;
	String c;
	final byte d=10;
	
	public static void main(String[] args)
	{
		final int b=100;
		System.out.println(b);
	//	b=200; cannot be updated as the local variable is marked as final
		System.out.println(b);
		LocalGlobal j=new LocalGlobal();
		j.sum();	
	}
	void sum()
	{
		a=550;
		System.out.println(a); //int default value is 0
		System.out.println(c); //string default value is
		System.out.println(d);
		// d=110; cannot be updated as the global variable is marked as final
		//System.out.println(b);  local variable cannot be used in another method
	}
}
