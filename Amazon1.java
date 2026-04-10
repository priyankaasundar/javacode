package myProject;

class Amazon2
{
	void add()
	{
		System.out.println("Implementation is different");
	}
}
public class Amazon1 extends Amazon2
{
	 static
		{
			int a=10;
			System.out.println(a);
			//super.add();
		}
public static void main(String[] args) 
{
	Amazon1 a= new Amazon1();
	a.add();
}
}
