public class Assignment2
{
	 static void min(int[] is ) 
	 {
			int m = is[0];
			for(int j = 1; j < is.length ;j++)
			{
				if(is[j]<m)
					m = is[j];
			}
			System.out.println("Minimum in 1-D array is:"+m);
			
	 }

	 static void max(int[] is) 
	 {
		 int m = is[0];
			for(int j = 1; j < is.length ;j++)
			{
				if(is[j]>m)
					m = is[j];
			}
			System.out.println("Maximum in 1-D array is:"+m);
			
	 }
		  
	public static void main(String [] args)
	{
		max(new int[]{1,2,3,4,5});
		min(new int[]{12,2,3,4,5});
			
	}

	
}
