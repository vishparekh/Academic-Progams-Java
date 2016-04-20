
	public class Program21 extends Exception
	{

			public Program21(String message)
			{
				super(message);
			}
	}


	 class Test
	{
		 public static void testException(String string) throws Program21
		 {
		       if(string == null)
		 	    throw new Program21("The String value is null");
		 }
		 
		 
	    public static void main(String[] args)
	    {
		try
	        {
		      testException(null);
	        }
	        catch (Program21 e)
	        {
		      e.printStackTrace();
	        }
	    }
			
	    
	}


