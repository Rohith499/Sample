package Demo;

public class Sample1 {

	public static void main(String[] args)
	{
		/*String x="Java";
		String y="java";
		
		if(x=="ava"&x!=y)
		{
			System.out.println("Statement is true");
		}
		else
		{
			System.out.println("Statement is Not true");
		}
		
		if (x.equals("ava") && !x.equals(y)) {
	        System.out.println("Statement is true");
	    } else {
	        System.out.println("Statement is not true");
	    }*/
		//Infinite While loop
		int count = 1;
		while(count == 1) {
		  System.out.println("Hi");
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} 
		

	}

}
