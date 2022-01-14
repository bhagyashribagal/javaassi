package first;



import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation1{
    static String [] dataBase= {"neha123@gmail.com","surajraj@gmail.com","megha@outlook.net"};


	public static void main(String[] args) {
        System.out.println("Email Id Verfication");
        Scanner sc= new Scanner(System.in);
        String userID;
		while (true){
	     System.out.println("Please Enter your EMAIL ID");
	     userID = sc.next();
	     while(VerfiyFormate(userID))
	     {
		     System.out.println("Please Enter your User ID with valid formate ex: eamaple@domain.xcom  ");
		     userID = sc.next();
	     }
	     
	     VerfiyID(userID);
	     
	     
	     System.out.println("");

		}
		
	}
	
	private static void VerfiyID(String ID)
	{
		boolean accessFlag= false;
	     for(String id : dataBase)
	     {
	    	 if(ID.equalsIgnoreCase(id))
	    	 {
	    		 accessFlag=true;
		    	 System.out.println("access grant to "+ ID );
	    		 break;
	    	 }   	 
	    	 
	     }
	     
	     if(accessFlag==false)
	     {
	    	 System.out.println("access deined to "+ ID );
	    	 
	     }
			
		
	}
	
	private static boolean VerfiyFormate(String ID)
	{
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(ID);

		if(!matcher.matches())
		{
			return true;
			
		}else 
		{
			return false;
			
		}
		
	}
}