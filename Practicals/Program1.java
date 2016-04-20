import java.util.Scanner;

public class Program1 {
	public static void main(String [] args)
	{
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount in Rupees:");
		int r = sc.nextInt();
		System.out.println("Amount in Dollars is:"+(r/60));
		
	}

}
