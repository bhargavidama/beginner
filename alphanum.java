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
		char ch;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int len=str.length();
		int k=0,l=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				k=1;
			}
			else if(str.charAt(i)>=48&&str.charAt(i)<=57)
			{
				l=1;
			}
		}
		if(k==1&&l==1)
		{
			System.out.println("Yes");
		}
		else
		{
	
		
		System.out.println("No");
		}
			}
}
			
			
			
		
