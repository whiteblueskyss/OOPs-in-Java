// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A
{
//	public abstract void show();
//	public abstract void config();
	int age=44;            // final and static 
	String area="Mumbai";
	
	void show();
	void config();
}

interface X
{
	void run();
}
interface Y extends X
{
	
}

class B implements A,Y
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofing");
	}
	public void run()
	{
		System.out.println("running...");
	}
}

public class Interface2 {
    public static void main(String[] args) {

    	A obj;
    	obj=new B();
    	
    	obj.show();
    	obj.config(); // can't access run() method using obj that is reference of A
    	
    	X obj1=new B();
    	obj1.run(); // can't access show() and config() method using obj1 that is reference of X
    	
 //   	A.area="Hyderabad";
    	
    	System.out.println(A.area);
        
    }
}
