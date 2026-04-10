package myProject;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class UncheckedException
{
    public static void main(String[] args)
    {
        int a;
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter value of a:");
            a = s.nextInt();
            System.out.println(a);
        }
        catch(InputMismatchException c)
        {
            System.out.println("Enter only int value");
            s.nextLine();   
        }
        try 
        {
        	int l=s.nextInt();
            int[] v = new int[l];
            System.out.println("Enter 2 array values:");

            for(int i = 0; i < l; i++)
            {
                v[i] = s.nextInt();
            }
            System.out.println(Arrays.toString(v));
        }
        catch(InputMismatchException n)
        {
            System.out.println("Enter only integer values for array");
        }
        s.close();
    }
}
