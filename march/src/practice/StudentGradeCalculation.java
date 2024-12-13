package practice;

import java.util.Scanner;

public class StudentGradeCalculation 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		float sum=0,avg;
		
		int[] marks = new int[5];
		
		System.out.println("Enter the marks obtained in the subjects");
		
		for(int i=0;i<5;i++)
		{
			marks[i]= sc.nextInt();
			sum=sum+marks[i];
		}
		System.out.println("total marks obtained in all subs: "+sum);
		
		avg=sum/5;
		
		System.out.println("avg of all the subjects is: "+avg);
		
		System.out.println("your grade is");
		if(avg>80)
		{
			System.out.println("A");
		}
		else if(avg>60 && avg<80)
		{
			System.out.println("B");
		}
		else if(avg>40 && avg<60)
		{
			System.out.println("C");
		}
		
	}

}