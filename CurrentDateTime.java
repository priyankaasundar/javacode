package myProject;

import java.util.Date;

public class CurrentDateTime 
{
	public static void main(String[] args) 
	{
		Date n=new Date();
		long time=n.getTime();
		System.out.println(time);
		Date y=new Date(n.getTime());
		System.out.println(y);
		String date=y.toString();
		String n1=date.substring(3,10);
		System.out.println(n1);
		String n2=date.substring(date.length()-10);
		System.out.println(n2);
		
	}
}
