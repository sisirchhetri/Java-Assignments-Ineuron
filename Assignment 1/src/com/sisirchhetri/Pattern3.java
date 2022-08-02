package com.sisirchhetri;

public class Pattern3 {

	public static void main(String[] args) {
/*       Pattern 3
		**************
		****** *******
		*****   ******
		****     *****
		***       ****
		**         ***
		*           **
		*            *
		*            *
		*            *
		*            *
		*            *
		*            *
		**************	
*/

		int n = 14;	
		for(int i=0; i<14; i++) {
			for(int j=0; j<14; j++) {
				
				if(i== 0 || i==(n-1) || j==0 || j==n-1 
						 || i+j <=(n-1)/2    || j-i >=(n-1)/2  )
					System.out.print("*");	
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
