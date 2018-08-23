

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int num1, num2, swap;
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
		
        swap = num1;
        num1 = num2;
        num2 = swap;
         System.out.print(num1+" "+num2);
        
	}
}
	
