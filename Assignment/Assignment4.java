
public class Assignment4 
{
	 static void min(int[][] is ) 
	 {
			int m = is[0][0];
			for(int i = 0 ; i<is.length; i++)
			{
				for(int j = 0; j < is[0].length ;j++)
				{
					if(is[i][j]<m)
						m = is[i][j];
				}
				
			}
			System.out.println("Minimum in 2-D array is:"+m);
			
	 }

	 static void max(int[][] is ) 
	 {
			int m = is[0][0];
			for(int i = 0 ; i<is.length; i++)
			{
				for(int j = 0; j < is[0].length ;j++)
				{
					if(is[i][j]>m)
						m = is[i][j];
				}
				
			}
			System.out.println("Maximum in 2-D array is:"+m);
			
	 }  
	public static void main(String [] args)
	{
		max(new int[][]{{11,21,31},{4,5,6},{7,8,9},{21,22,33}});
		min(new int[][]{{11,21,31},{4,5,6},{7,8,9},{21,22,33}});
			
	}

}
