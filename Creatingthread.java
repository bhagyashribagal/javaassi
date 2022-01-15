package first;

public class Creatingthread extends Thread

	{
	 	public void run()
	 	{
	  		System.out.println("hi");
	}
	 	public static void main( String args[] )
	 	{
	 		Creatingthread mt = new  Creatingthread();
	  		mt.start();
	 	}
	}


