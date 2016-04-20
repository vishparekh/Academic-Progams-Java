import java.util.*;
import java.io.*;
	public class Student implements Serializable {
		
		String name;
		int rollno;
		double submarks;
		
		Student(String n,int r,double m){		
			this.name=n;
			this.rollno=r;
			this.submarks=m;
		}
	}	

	 class StudentManager{
		
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			// TODO Auto-generated method stub
	List <Student> studList = new ArrayList<Student>();
	String name;
	int roll;
	double marks;
	char ans='y';

		FileOutputStream fs = new FileOutputStream("object.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		Scanner input = new Scanner(System.in);
		do{
		System.out.println("\nEnter Name of Student");
		name=input.next();
		System.out.println("\nEnter Roll Number of the Student");
		roll=input.nextInt();
		System.out.println("\nEnter Marks of THe Student: ");
		marks=input.nextDouble();
		
		Student s1 = new Student(name,roll,marks);
		os.writeObject(s1);
		os.flush();
		
		System.out.println("\n Do You Want to Continue?(y/n)");
		ans=input .next().charAt(0);
		
		}while(ans == 'y' || ans=='Y');
		os.close();
		try {
		FileInputStream fis = new FileInputStream("object.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		while(true)
		{
			
			Object obj = ois.readObject();
			
			if(obj instanceof Student)
				studList.add((Student)obj);
			else 
				break;
		}
		ois.close();
		}catch (Exception e) {}
		Iterator<Student> items = studList.iterator();
		
			while(items.hasNext()){
				
				Student sl = items.next();
				System.out.print(sl.name+" ");
				System.out.print(sl.rollno+" ");
				System.out.print(sl.submarks+" ");
				System.out.println();
				
			}

		}
	}


	


