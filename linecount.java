/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s;
		int word=0;
		
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)=='.')
			{
				word++;
			}
			
		}
		System.out.print(word+1);
		
		
		
	}
}
