/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num=10;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<num;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println(min);
	}
}
