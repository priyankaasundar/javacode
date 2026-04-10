package myProject;
import java.util.Arrays;
public class StringAnagram
{
public static void main(String[] args)
{
String s1="saw";
String s2="aws";
if(s1.length()!=s2.length())
{
	System.out.println("This is not Anagram");
	
}
else
{
	char[] m=s1.toCharArray();
	System.out.println(Arrays.toString(m));
	char[] n=s2.toCharArray();
	System.out.println(Arrays.toString(n));
	Arrays.sort(m);
	Arrays.sort(n);
	System.out.println(m);
	System.out.println(n);
	if(Arrays.equals(m,n))
	{
		System.out.println("anagram");
	}
	else
	{
		System.out.println("Not anagram");
	}
	
}
}
}
