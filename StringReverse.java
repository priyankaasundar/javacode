package myProject;

public class StringReverse
{
	public static void main(String[] args)
	{
		
		String name="Priyankaa";
		String rever="";
		for(int i=name.length()-1;i>=0;i--)
		{
			
			char c=name.charAt(i);
			rever=rever+c;
		}
		
		System.out.println("reverse string is"+" "+rever);
	}


	}


