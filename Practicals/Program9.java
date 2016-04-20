import java.util.Scanner;
public class Program9 {

	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the string: ");
			String s=sc.nextLine();
			
			for(int i=0;i<s.length();i++)
			{
				for(int j=s.length()-1;j>i;j--)
					System.out.print(" ");
				for(int j=0;j<=i;j++)
					System.out.print(s.charAt(j)+" ");
				System.out.println();
			}

		}

	}



