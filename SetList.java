package myProject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetList 
{
public static void main(String[] args) 
{
	Set s=new HashSet();
	s.add(23);
	s.add(44);
	s.add(44);
	s.add(224);
	System.out.println(s);
	List l=new ArrayList(s);
	System.out.println(s);
}
}
