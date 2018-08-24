/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a ;
int b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
a = a ^ b; // XOR operation
b = a ^ b; // XOR operation
a = a ^ b; // XOR operation
System.out.println( a+" "+b);

	}
}
