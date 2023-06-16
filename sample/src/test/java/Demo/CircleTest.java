package Demo;

import DemoPage.Circle;

public class CircleTest {

	public static void main(String[] args) 
	{
		Circle c1= new Circle();
		c1.radius=7;
		Circle.pi=3.14;
		//c1.pi=3.14;
		System.out.println(c1.area());
		

	}

}
