/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[10];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int k=a[i];
					a[i]=a[j];
					a[j]=k;
				}
			}
		}
	/*	for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}*/
		int m=n/2;
		System.out.println(a[m]);
	}
}