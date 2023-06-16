package Demo;

public class This3 
{
	int age;//instance Variable
    This3(int a) //parameter
    {
    	age=a;
    	//Or
        //this.age = a;
    }

    public static void main(String[] args) {
        This3 obj = new This3(8);
        System.out.println("obj.age = " + obj.age);
    }
}
