import java.util.*;
import java.io.*;

public class Program12 implements Serializable {
	
	String name;
	int rollno;
	double sb;
	
	Program12(String n,int r,double m){		
		this.name=n;
		this.rollno=r;
		this.sb=m;
	}

}

class StudentManager {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Program12> studList = new ArrayList<Program12>();
		String name;
		int roll;
		double marks;
		char ans='y';
		
		try{
			FileOutputStream fs = new FileOutputStream("object.txt");
			BufferedOutputStream bs = new BufferedOutputStream(fs);
			ObjectOutputStream os = new ObjectOutputStream(bs);
			Scanner input = new Scanner(System.in);
			
			do{
				System.out.println("\nEnter Name of The Student: ");
				name=input.next();
				System.out.println("\n ENter Roll Number of the Student: ");
				roll=input.nextInt();
				System.out.println("\n Enter Marks of The Student: ");
				marks=input.nextDouble();
				
				Program12 s1 = new Program12(name,roll,marks);
				os.writeObject(s1);
				os.flush();
				
				System.out.println("\nDo You Want TO Continue?(y/n)");
				ans=input.next().charAt(0);
			}while(ans=='y'||ans=='Y');
			os.close();
		}catch(Exception e){e.printStackTrace();}
		
		try{
			
			FileInputStream fis = new FileInputStream("object.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			while(true){
				Object obj = ois.readObject();
					if(obj instanceof Program12)
						studList.add((Program12)obj);
					else
						break;
			}
			ois.close();
		}catch(Exception e){}
		
		Iterator<Program12> items = studList.iterator();
		while(items.hasNext()){
			Program12 sl=items.next();
			System.out.print(sl.name+" ");
			System.out.print(sl.rollno+" ");
			System.out.print(sl.sb+" ");
			System.out.println();
	
			}
			
		}
		
	}


