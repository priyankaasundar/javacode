package myProject;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListProgram6 
{
        public static void main(String[] args) 
        {
                ArrayList<String> a1=new ArrayList<String>();
                a1.add("Ankit");
                a1.add("Shiva");
                a1.add("Amit");
                a1.add("Anu");
                a1.add("Zubair");
                a1.add("Manish");
                System.out.println(a1);
                
                Iterator<String> i1=        a1.iterator();
                //hasnext->boolean, next=>object, remove
               /*while(i1.hasNext())
               {
            	   System.out.println(i1.next());
               }
            	   
                
                //hasnext->boolean, next->object, remove,hasprevious->boolean,previous->object and set*/
                ListIterator<String> i2=a1.listIterator();
                while(i2.previous() != null)
                {
             	   System.out.println(i2.previous());
                }
             	  
                
        }
}
