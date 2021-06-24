package basiccoreprogram;

import java.util.Scanner;

public class Basiccore 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("enter a number");
	       Scanner s=new Scanner(System.in);
	       int n= s.nextInt();
	       if(n%2==0)
	       {
	    	   System.out.println("number is even");
	       }
		  else
		  {
			  System.out.println("number is odd");

	}
	       
	}
	
}