package first;

public class Tryandcatch {

public static void B()
{
	int a=1;
	int b=0;
	int res=a/b;
	
}
public static void A() 
{
	try
	{
		B();
	}
	catch(NullPointerException e)
	{
		System.out.println("Handeld in A()");
	}
	
}
public static void C() 
{
	try
	{
		B();
	}
	catch(ArrayIndexOutOfBoundsException d)
	{
		System.out.println("Handeld in C()");
	}
	
}
public static void D() 
{
	try
	{
		B();
	}
	catch(StringIndexOutBoundException a)
	{
		System.out.println("Handeld in D()");
	}
	
}
	public static void main(String[] args) {
		try
		{
			A();
			
		}
		catch(ArithmeticException g)
		{
			System.out.println("Handeld in main method");
		}

	}

}
