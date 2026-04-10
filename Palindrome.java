package myProject;
public class Palindrome
{
	public static void main(String[] args) 
	{		
		String text="sir";
		
		String rever="";
		for(int i=text.length()-1;i>=0;i--)
		{
			char c=text.charAt(i);
			 rever=rever+c;
		}		
		if(text.equals(rever)==true)
		{
			System.out.println("This is Palindrome");
		}
		else
		{
			System.out.println("This is not Palindrome");		
		}
	}
}
