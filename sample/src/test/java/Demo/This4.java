package Demo;

public class This4
{
	String name;
	
	//Setter Method
	
	void setName(String name)
	{
		this.name=name;
	}
	
	//getter Method
	
	String getName()
	{
		return this.name;
	}
	
	public static void main(String[] args) {
        This4 obj = new This4();
        obj.setName("Dell");
        System.out.println("obj.name: "+obj.getName());
    }
}
