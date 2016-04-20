
import java.io.*;
import java.lang.*;
import java.sql.*;



public class Program23 {

	
	


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Program23 a= new Program23();
		

		try{  
			   int i=25/5;  
			   System.out.println(i);  
			  }  
			  catch(NullPointerException e){System.out.println(e);
			  }  
			  finally{System.out.println("finally block is always executed");
			  }  
		
		a.method();
		a.methodOne();
		try
        {
	      testException(null);
        }
        catch (MyException e)
        {
	      e.printStackTrace();
        }
	}
		
		
		    void method() throws Exception
		    {
		    	try{
		        Exception e = new Exception();	
		        throw e;}catch(Exception e){}
		    	System.out.println("Throwing Exception with Throw");
		    }
		    
		    void methodOne() throws ArrayIndexOutOfBoundsException
		    {
		    	
		        System.out.println("This will Throw if found any ArrayIndexoutofBound Exception with Throws");
		    }
		    public static void testException(String string) throws MyException
			 {
			       if(string == null)
			 	    throw new MyException("The String value is null(Using Throwable)");
			 } 
		    
		    
		
		
	

}


class MyException extends Throwable
{

		public MyException(String message)
		{
			super(message);
		}
}