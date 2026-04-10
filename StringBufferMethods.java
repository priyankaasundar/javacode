package myProject;
public class StringBufferMethods 
{
	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("pine");
		s.append("apple");
		System.out.println(s);
		s.insert(0, "test");
		System.out.println(s);
		s.delete(0, 3);
		System.out.println(s);
		s.replace(0, 5,"sample");
		System.out.println(s);
		s.substring(0,5);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}
}
