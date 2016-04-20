import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) 
	{
		
		String s;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		s =sc.nextLine();
		int k= 0;
		try
		{
			while(s.charAt(k)!= '\0')
			{
				k++;
			}
		}
		catch(Exception e)
		{
			
		}
		for(int i = (k/2); i<k;i++)
		{
			System.out.print(""+s.charAt(i));
			
		}
		

	}

}
