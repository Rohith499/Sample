package Demo;

import DemoPage.StudentPage;

public class TestStudent {

	public static void main(String[] args)
	{
		StudentPage obj1=new StudentPage(101,"CSE");
		StudentPage obj2=new StudentPage(111,"ECE");
		obj1.display();
		obj2.display();

	}

}
