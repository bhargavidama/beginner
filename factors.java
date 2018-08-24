/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int Number, i;
	Scanner	sc = new Scanner(System.in);
		
	
		Number = sc.nextInt();
		
		for(i = 1; i <= Number; i++) {
			if(Number%i == 0) {
				System.out.format(" %d  ", i);
	}
}
}
}
