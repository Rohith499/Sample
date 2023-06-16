package Demo;

public class This2 
{
	int age;//instance Variable
    This2(int age) //parameter
    {
    	age=age;
        this.age = age;
    }

    public static void main(String[] args) {
        This2 obj = new This2(8);
        System.out.println("obj.age = " + obj.age);
    }
}
//Java compiler gets confused because of the 
//ambiguity in names between instance variable and the parameter.