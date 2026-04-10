package myProject;

public class ThisClass 
{
	int age=20;
	void user(int age)
	{		
		this.age=age;
	}
public static void main(String[] args) 
{
	ThisClass c=new ThisClass();
	c.user(27);
	System.out.println(c.age);
}
}
