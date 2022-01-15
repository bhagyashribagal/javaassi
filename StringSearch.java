package first;
import java.util.regex.*;

public class StringSearch {

	public static void main(String[] args) {
		String pattern = "[A-Z]+";
		String cheak = "Hello";
		Pattern a = Pattern.compile(pattern);
		Matcher b = a.matcher(cheak);
		
		while (b.find())
	      	System.out.println( cheak.substring( b.start(), b.end() ) );

	}

}
