package com.sisirchhetri;

public class Pattern1 {

	public static void main(String[] args) {
//		Pattern:-  INEURON
		
		System.out.println("INEURON");
		
		int n =10;
		
		for(int i =0; i< n; i++) {
			//I
			for(int j=0; j< n; j++) {
				
				if(i==0) System.out.print("*");
				
				else if(j==(n-1)/2 )        System.out.print("*");
				else if(i==n-1)             System.out.print("*");	
				else                        System.out.print(" ");
		     }
			//N
			System.out.print("  ");
			for(int j=0; j< n; j++) {
				
				if(j==0)                  System.out.print("*");
				else if(i==j)             System.out.print("*");	
				else if(j==n-1)           System.out.print("*");	
				else                      System.out.print(" ");
			}
			//E
	
			System.out.print("  ");
			for(int j=0; j< n; j++) {
				
				if(j==0 || i==0)          System.out.print("*");
				else if(i==(n-1)/2)       System.out.print("*");	
				else if(i==n-1)           System.out.print("*");	
				else                      System.out.print(" ");
			}
			System.out.print("  ");
			
			//U
			for(int j=0; j< n; j++) {
				
				if(j==0 || i==n-1 || j==n-1)System.out.print("*");	
				else                        System.out.print(" ");
			}
			
           System.out.print("  ");
			
						//R
			for(int j=0; j< n; j++) {
				
				if(j==0 || i==0 || i==(n-1)/2 || (i<=(n-1)/2 && j==n-1) ||
						( i-j==n/2 -1 ) ) System.out.print("*");	
				
				
				else                           System.out.print(" ");
			}
					
			 System.out.print("  ");
				
				//O
				for(int j=0; j< n; j++) {
					
					if(j==0 || i==0 || i==(n-1) ||  j==n-1 ) System.out.print("*");	
					
					
					else                           System.out.print(" ");
				}
				//N
				System.out.print("  ");
				for(int j=0; j< n; j++) {
					
					if(j==0 || i==j || j==n-1)                System.out.print("*");
					else                                      System.out.print(" ");
				}
				System.out.println();
		}
	}
}
