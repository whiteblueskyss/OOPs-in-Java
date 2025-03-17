/**
// super()
class A
{
	public A() 
	{
		super();
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}
class B extends A
{
	public B()
	{
//		super();
		super(5);
		System.out.println("in B");
	}
	public B(int n)
	{
//		super();   //call default constructor of super class
		super(n);
		System.out.println("in B int");
	}
}
public class Demo {
	public static void main(String[] args) 
	{
		
		B obj=new B();
//		B obj=new B(5);
	}
}
**/


//this() 
class A
{
	public A() 
	{
		super();
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}

class B extends A
{
	public B()
	{
		// super();
		System.out.println("in B");
	}
	public B(int n)
	{ 
    // super();
		this();  //call constructor of same class
		System.out.println("in B int");
	}
}
public class ThisVSSuper {
	public static void main(String[] args) 
	{
		
//		B obj=new B();
		B obj=new B(5);
	}
}




// this() is used to call another constructor in the same class.
// super() is used to call a constructor in the parent class.
// Both must be the first statement in a constructor, so they cannot coexist.