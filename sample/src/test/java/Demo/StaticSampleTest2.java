package Demo;

import DemoPage.StaticSample2;

public class StaticSampleTest2 {

	public static void main(String[] args) 
	{
		//calling non static method using object of that class
		StaticSample2 obj =new StaticSample2();
		obj.method1();
		
		//calling static method by using correspinding class name
		StaticSample2.method2();
		
		
	}

}
