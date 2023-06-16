package DemoPage;

public class StaticSample2 
{
	public int id = 1001;
	public String cusname="Kohli";
	public static String country="india";
	public static int x=200;
	
	public void method1() //general methods to access Non static and Static Prop
	{
		System.out.println(id);
		System.out.println(x);
	}
	
	public static void method2() //Static method to access only static properties
	{
		//System.out.println(id);
		System.out.println(country);
	}
}
