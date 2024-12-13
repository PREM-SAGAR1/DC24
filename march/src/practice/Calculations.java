package practice;

import java.util.Scanner;

public class Calculations 
{
	public static void main(String[] args)
	{
		float a,b,res;
		char choice;
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("1.Addition");
			System.out.println("2.Subtration");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit\n\n");
			
			System.out.println("Enter your choice");
			choice =scan.next().charAt(0);
			switch(choice)
			{
			case '1': System.out.println("Enter the two numbers");
			    a= scan.nextFloat();
			    b=scan.nextFloat();
			    res=a+b;
			    System.out.println("Result = "+res);
			    break;
			    
			case '2': System.out.println("Enter the two numbers");
		    a= scan.nextFloat();
		    b=scan.nextFloat();
		    res=a-b;
		    
		    System.out.println("Result = "+res);
		    break;

			case '3': System.out.println("Enter the two numbers");
		    a= scan.nextFloat();
		    b=scan.nextFloat();
		    res=a*b;
		    System.out.println("Result = "+res);
		    break;

			case '4': System.out.println("Enter the two numbers");
		    a= scan.nextFloat();
		    b=scan.nextFloat();
		    res=a/b;
		    System.out.println("Result = "+res);
		    break;

		    
			case '5' : System.exit(0);
		    break;

			
			default: System.out.println("Wrong choice.....");
		    break;

			
			
			}
			System.out.println("\n............\n");

		}
		while(choice !=5);
			
		
	}

}