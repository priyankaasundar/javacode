package myProject;
import java.util.Arrays;
public class Anagram 
{
	public static void main(String[] args) 
	{
		String one="saw";
		String two="was";
		if(one.length()!=two.length())
		{
			System.out.println("This is not anagram");
		}
		else
		{
		char[]c=one.toCharArray();
		System.out.println(Arrays.toString(c));
		char[]c1=two.toCharArray();
		System.out.println(Arrays.toString(c1));
		Arrays.sort(c);
		Arrays.sort(c1);
		System.out.println(c);
		System.out.println(c1);
		if(Arrays.equals(c,c1))
		{
			System.out.println("This is Anagram");
		}
		else
		{
			System.out.println("This is not anagram");
		}
		}
	}
}
