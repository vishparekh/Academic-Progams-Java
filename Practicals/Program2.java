import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 6 subject out of 100:");
		int a[] = new int[6];
		double sum = 0;
		for(int i = 0 ; i<6 ; i++ )
		{
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		sum = (sum/600)*100;
		
		System.out.println("Percentage is:"+sum);
		

	}

}
