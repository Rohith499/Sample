package DemoPage;

public class StudentPage 
{
	int id;
	String branch;
	
	public StudentPage(int i, String br)
	{
		id=i;
		branch=br;
	}
	
	public void display()
	{
		System.out.println(id+" "+branch);
	}
}
