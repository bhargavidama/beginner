/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	 static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
         
        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
 
    // Driver program 
    public static void main(String args[])
    {
    	int n;
    	Scanner sc=new Scanner(System.in);
    	n=sc.nextInt();
        if (isPowerOfTwo(n))
            System.out.println("yes");
        else
            System.out.println("no");
 
   
    }
}
 

