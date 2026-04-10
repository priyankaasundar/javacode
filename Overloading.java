package myProject;

public class Overloading 
{
public static void main(String[] args)
{
	Overloading.add();	
	Overloading.add(10,10);
Overloading v=new Overloading();
Overloading v1=new Overloading(10,20);
v1.sub();
v1.sub(25, 40);
}
Overloading()
{
	System.out.println("This is constructor and can be called once object is created");
}
Overloading(int a,int b)
{
	System.out.println(a+b);
}
public static void add()
{
	int a=10;
	int b=40;
	int c=a+b;
	System.out.println(c);
}
public static void add(int a,int b)
{

	int c=a+b;
	System.out.println(c);
}

public void sub() 
{
	int a=10;
	int b=20;
	int c=a-b;
	System.out.println(c);
}	
public void sub(int a,int b) 
{

	int c=a-b;
	System.out.println(c);
}
}
