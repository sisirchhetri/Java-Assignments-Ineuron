package in.sisirchhetri;
import java.util.Scanner;

public class S2_TryWithMultipleCatch {


	public static void main(String[] args) {
		
		//try with multiple catch blocks
		try
		{
		System.out.println("Welcome to Exception Handling Training  ");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first Number to divide");
        int a=scan.nextInt();
        System.out.println("Enter the second number");
        int b=scan.nextInt();
        int res=a/b;
        System.out.println("The result is "+ res);
         
        System.out.println("Please enter size of an array");
        int size=scan.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter the elem to be added in ar");
        int elem=scan.nextInt();
        System.out.println("Enter the position at which elem has to be inserted");
        int pos=scan.nextInt();
        ar[pos]=elem;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Please enter non zero second number");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Size should be a positive naturnal number");
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
			System.out.println("Give index within the array size -1 ");
		}//generic exception catch block should be at last.
		catch(Exception e)
		{
			System.out.println("Please give proper input");
		}
		
               
		 System.out.println("Thank you for using our application"); 
		 
		 
        

	}

}
