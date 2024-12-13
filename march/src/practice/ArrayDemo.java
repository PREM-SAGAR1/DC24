package practice;

import java.util.Scanner;

public class ArrayDemo
{
	public static void main(String[] args) 
	{
		
	Scanner sc = new Scanner(System.in);
  
	System.out.println("Enter the size of the array");
	
	int asize = sc.nextInt();
	
	int [] a = new  int [asize];
	
	int sum = 0;
	
	System.out.println("enter the elements of the array");
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		System.out.println("a["+i+"]="+a[i]);
		sum=sum+a[i];
	}
	System.out.println("sum of the array is "+sum);
	

}}