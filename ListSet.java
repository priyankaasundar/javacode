
package myProject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ListSet 
{
public static void main(String[] args) 
{
	List<Integer> l=new ArrayList();
	l.add(10);
	l.add(10);
	l.add(25);
	l.add(10);
	l.add(10);
	System.out.println(l);
	Set s=new HashSet(l);
	System.out.println(s);

}
}
