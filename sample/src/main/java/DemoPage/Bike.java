package DemoPage;

public class Bike 
{
	int cc;
	String color;
	
	public Bike(int cc, String co)
	{
		this.cc=cc;
		this.color=co;
	}
	public void display()
	{
		System.out.println(cc+" "+color);
	}
}
