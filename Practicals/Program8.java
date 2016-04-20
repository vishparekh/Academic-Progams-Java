import java.util.Scanner;
public class Program8 {
	



		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int a=0,e=0,i=0,o=0,u=0;
			
			System.out.println("Enter a String: ");
			String s=sc.nextLine();
			
			do{
				int a1=0,e1=0,i1=0,o1=0,u1=0;
				for(int j=0;j<s.length();j++)
				{
					
					if(s.charAt(j)=='a'||s.charAt(j)=='A')
						{a++;a1++;}
					if(s.charAt(j)=='e'||s.charAt(j)=='E')
						{e++;e1++;}
					if(s.charAt(j)=='i'||s.charAt(j)=='I')
						{i++;i1++;}
					if(s.charAt(j)=='o'||s.charAt(j)=='O')
						{o++;o1++;}
					if(s.charAt(j)=='u'||s.charAt(j)=='U')
						{u++;u1++;}
					
				}
				System.out.println("Current Sentence Vowels:\na:"+a1+"\ne:"+e1+"\ni:"+i1+"\no:"+o1+"\nu:"+u1);
				s=sc.nextLine();
				
			}while(s.compareTo("quit")!=0);
			System.out.println("Total:");
			System.out.println("a:"+a);
			System.out.println("e:"+e);
			System.out.println("i:"+i);
			System.out.println("o:"+o);
			System.out.println("u:"+u);
			
		}

	}



