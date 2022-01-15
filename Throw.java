package first;

public class Throw {

	public static void voting(int age)
	{
		if (age>=18)
		{
			System.out.println("Welcome to voting");
		}
		else
		{
			throw new NullPointerException("Kindly go to home");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
voting(16);
	}

}
