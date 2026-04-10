package myProject;

public class StringArray 
{
public static void main(String[] args) 
{	 
	String name="Automation";
	char[] c=name.toCharArray();
	for(int k=0;k<name.length()-1;k++)
	{
		System.out.println(c[k]);
	}
}
}

