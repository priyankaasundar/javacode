package myProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class CheckedException
{
public static void main(String[] args) throws InterruptedException, MalformedURLException
{
	
URL n=new URL("https://www.google.com/?zx=1771416007298&no_sw_cr=1");
	try {
		FileInputStream f=new FileInputStream("");
	} 
	catch (FileNotFoundException e) {
		
		System.out.println("File not found");
	}
	if(1<0)
	{
	for(int i=0;i<3;i--)
	{
		System.out.println(i);
		Thread.sleep(2000);
	}
	}
}
}
