import java.util.Scanner;

public class Program6 {

	

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int count=0;
			
			System.out.print("Enter The string:");
			String s=sc.nextLine();
			
			if(s.charAt(0)>='A'&&s.charAt(0)<='Z')
				count++;
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch==' '&&s.charAt(i+1)>='A'&&s.charAt(i+1)<='Z')
					count++;				
			}
			
			System.out.println("Words with Capital Letters Are:"+count);

		}

	}



