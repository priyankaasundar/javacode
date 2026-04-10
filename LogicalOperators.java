package myProject;
public class LogicalOperators {
	public static void main(String[] args)
	{
		int age=25;
		int dob=1995;	
		int salary= 25000;
		if(age>20 && dob==1995)
		{
			System.out.println("They are eligible for drivining car");		
		}
		if(age>20 || salary>35000)
		{
			System.out.println("They are eligible for tax");		
		}
if(!(age>20 && dob==1995))
{
	System.out.println("They are not eligible for driving");
}
if(!(age>20 || salary>35000))
{
	System.out.println("They are not eligible for tax");

}
	}
}
