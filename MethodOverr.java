package myProject;
class class1
{
	void add(int a,int b)
	{
		
		System.out.println("this is parent class");
	}
}

public class MethodOverr extends class1
{
public static void main(String[] args)
{
	class1 m=new MethodOverr();
	m.add(10, 20);
}
void add(int a,int b)
{
int c=a+b;
System.out.println("this is child clss"+c);	
//super.add(10,20);
}
}
