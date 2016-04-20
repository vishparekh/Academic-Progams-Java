import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value:");
		int a = sc.nextInt();
		System.out.println("Enter second value:");
		int b = sc.nextInt();
		System.out.println("Addition is:"+(a+b));
		System.out.println("Subtraction is:"+(a-b));
		System.out.println("Multiplication is:"+(a*b));
		System.out.println("Division is:"+(a/b));
	}

}
