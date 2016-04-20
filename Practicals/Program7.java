import java.util.Scanner;

public class Program7 {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int flag=1;
		int j=0;
		System.out.println("Enter a string or Number:");
		String s=sc.nextLine();
		char s1[] = new char[s.length()];
			
		for(int i=(s.length()-1);i>=0;i--)
		{
			s1[j] = s.charAt(i);
			j++;
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s1[i])
				flag=0;
		}
		
		
		if(flag==1)
			System.out.println("It is Palindrome..!!");
		else
			System.out.println("*Not a Palindrome.");

	}


}
