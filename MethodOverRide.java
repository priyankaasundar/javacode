package myProject;
class TestParent
{	
void add()
	{
		System.out.println("Test");
	}
}
public class MethodOverRide extends TestParent
{
	 void add()
	{		
		System.out.println("Sample");
		super.add();
	}
	public static void main(String[] args)
	{		
		MethodOverRide m=new MethodOverRide();
		m.add();		
	}
}