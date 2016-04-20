package gtu13;
import java.util.*;
import java.io.*;

public class Program13 implements Serializable {
	
	String name;
	int rollno;
	double sb;
	
	Program13(String n,int r,double m){		
		this.name=n;
		this.rollno=r;
		this.sb=m;
	}

}

class StudentManager {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Program13> studList = new ArrayList<Program13>();
		String name;
		int roll;
		double marks;
		char ans='y';
		
		try{
			FileOutputStream fs = new FileOutputStream("object.txt");
			DataOutputStream bs = new DataOutputStream(fs);
			ObjectOutputStream os = new ObjectOutputStream(bs);
			Scanner input = new Scanner(System.in);
			
			do{
				System.out.println("\nEnter Name of The Student: ");
				name=input.next();
				System.out.println("\n ENter Roll Number of the Student: ");
				roll=input.nextInt();
				System.out.println("\n Enter Marks of The Student: ");
				marks=input.nextDouble();
				
				Program13 s1 = new Program13(name,roll,marks);
				os.writeObject(s1);
				os.flush();
				
				System.out.println("\nDo You Want TO Continue?(y/n)");
				ans=input.next().charAt(0);
			}while(ans=='y'||ans=='Y');
			os.close();
		}catch(Exception e){e.printStackTrace();}
		
		try{
			
			FileInputStream fis = new FileInputStream("object.txt");
			DataInputStream bis = new DataInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			while(true){
				Object obj = ois.readObject();
					if(obj instanceof Program13)
						studList.add((Program13)obj);
					else
						break;
			}
			ois.close();
		}catch(Exception e){}
		
		Iterator<Program13> items = studList.iterator();
		while(items.hasNext()){
			Program13 sl=items.next();
			System.out.print(sl.name+" ");
			System.out.print(sl.rollno+" ");
			System.out.print(sl.sb+" ");
			System.out.println();
	
			}
			
		}
		
	}


