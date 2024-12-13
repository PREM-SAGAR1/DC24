package practice;

public class Array2D1 {

	public static void main(String[] args) 
	{
		
		int [][] a = { 
				       {10,20,30},
				       {45,56},
				       {45,89,100,96}
		                             };
		
		    for(int i=0;i<a.length;i++)
		    {
		    	for(int j=0;j<a[i].length;j++)
		    	{
		    		System.out.print(a[i][j]+"  ");
		    	}
		    	System.out.println();
		    }
		    
		    System.out.println("///////////////////////");
              
		    for(int p[]:a)
		    {
		    	for(int q:p)
		    	{
		    		System.out.print(q+ "  ");
		    	}
		    	System.out.println();
		    	
		    }
		}

	}

