/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str;
		int k;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		k=sc.nextInt();
		for(int i=0;i<k;i++)
		{
			System.out.print(str.charAt(i));

		}
	}
}
