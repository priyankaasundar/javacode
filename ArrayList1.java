package myProject;
import java.util.ArrayList;
public class ArrayList1
{
public static void main(String[] args) 
{
	ArrayList a=new ArrayList();
	a.add(100);
	a.add(200);
	System.out.println(a);
	ArrayList b=new ArrayList();
	b.add(300);
	b.add(400);
	System.out.println(b);
	boolean t=a.equals(b);
	System.out.println(t);
	a.addAll(2, b);
	System.out.println(a);
	a.add(b);
	System.out.println(a);
	boolean s=a.containsAll(b);
	System.out.println(s);
}
}
