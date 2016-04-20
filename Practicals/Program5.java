import java.util.Scanner;

public class Program5 {


		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int vow=0,con=0;
			
			System.out.print("Enter the string: ");
			String s=sc.nextLine();
			
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
					vow++;
				else
					con++;
			}
			
			System.out.println("Consonants: "+con);
			System.out.println("Vowels: "+vow);

		}

	}


