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
		int c=0;
		char num;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		for(int i=0;i<str.length();i++){
			
			num=str.charAt(i);
			if(Character.isDigit(num)){
			c++;	
			
			
			}
			
		}
		System.out.print(c);
	}
}
