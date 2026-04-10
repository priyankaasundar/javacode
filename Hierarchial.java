package myProject;
class vehicle
{
	static void add() 
	{
		System.out.println("Addition");
	}
}
class bus extends vehicle
{
	static void sub()
	{
		System.out.println("subtraction");
	}	
}
public class Hierarchial extends vehicle
{
public static void main(String[] args)
{	
	add();
	bus b=new bus();
	b.sub();
}
}

