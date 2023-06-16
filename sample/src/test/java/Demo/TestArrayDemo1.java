package Demo;

import DemoPage.ArrayDemo1;

public class TestArrayDemo1 {

	public static void main(String[] args) 
	{
		ArrayDemo1 ard=new ArrayDemo1();//Object Creation
		
		ard.printNumber(10); //Normal Method Calling/invoking/Accessing
		
		String[] empIdsArr=new String[5];//Array Creation
		
		//int[] empIdsArr1=new int[4.1];//Invalid size
		
		//Array Intialization
		
		empIdsArr[0]="101";
		empIdsArr[1]="Rakesh";
		empIdsArr[3]="JHarish420";
		
	//String [] empIdsArr= {"Rakesh","Dileep","Srikanth","104"};//Declaration,Creation and Initialization
												//of Array in single line
		
		ard.printArrayElements(empIdsArr);//Array Method Calling/invoking/Accessing
	}

}
