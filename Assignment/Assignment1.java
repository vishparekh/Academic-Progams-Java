
public class Assignment1 
{
	void show(double d)
	{
		System.out.println("double"+d);
	}
	void show(float f)
	{
		System.out.println("float"+f);
	}
	void show(byte b)
	{
		System.out.println("byte"+b);
	}
	void show(short s)
	{
		System.out.println("short"+s);
	}
	void show(int i)
	{
		System.out.println("int"+i);
	}
	void show(long l)
	{
		System.out.println("long"+l);
	}
	
	public static void main(String [] args)
	{
		Assignment1 a = new Assignment1();
		a.show(10.5f);
		a.show(1);
		
	}
}
