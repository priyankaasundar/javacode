package myProject;

public class charAt
{

	public static void main(String[] args)
	{
		String s="hello world";
		String p="hello world";
		String c=new String("hello world");
		System.out.println(s.substring(1,3));
		System.out.println(s.equals(c));
		System.out.println(s.charAt(6));
		System.out.println(s.trim());
		System.out.println(s.replace('h','e'));
	}
}
