package myProject;
public class AccessSpecifierMethod1 
{
	static int a=50;
	static int b=10;
	
/*public static void main(String[] args)
{
add();
sub();
mul();
div();

}*/
public static void add()
{
	int add=a+b;
	System.out.println(add);
}
protected static  void sub()
{
	int sub=a-b;
	System.out.println(sub);
}
static void mul()
{
	  int mul=a*b;
	  System.out.println(mul);
}
 private static  void div()
 {
	 int div=a/b;
	 System.out.println(div);
 }
}
