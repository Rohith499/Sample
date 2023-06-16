package Demo;

public class SSS {

	public static void main(String[] args) 
	{
		String str1 = " Learn   Java   ";
	    String result;

	    // replace all whitespace characters with empty string
	    result = str1.replaceAll("\\s", "");
	    result = str1.replaceAll("a", "");

	    System.out.println(result);   // LearnJava
		
	}
}
