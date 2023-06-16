package DemoPage;

public class This1 
{
	int Var;

    This1(int Var)
    {
        this.Var = Var;
        System.out.println("this reference = " + this);
    }
    
    public static void main(String[] args) {
        This1 obj = new This1(8);
        System.out.println("object reference = " + obj);
    }
}

//reference of both "obj" and "this" is the same. 
//It means "this" is nothing but the reference to the current object.


