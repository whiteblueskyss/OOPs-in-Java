class A
{
	public void show1()
	{
		System.out.println("in A show");
	}
}
class B extends A
{
	public void show2()
	{
		System.out.println("in show B");
	}
}

public class  UpcastingDowncasting{
    public static void main(String[] args) {

//    	double d=4.5;
//    	int i=(int)d;
//    	
//    	System.out.println(i);
    	
//    	A obj= new A();
//    	A obj=(A) new B();   //upcasting
//    	obj.show1();
    	
    	A obj=new B();
    	obj.show1(); // can't call show2() as it is not in A class
    	
    	B obj1=(B)obj;
    	obj1.show2();
    }
}


// class Animal {
//     void eat() { System.out.println("Animal eats"); }
// }
// class Dog extends Animal {
//     void bark() { System.out.println("Dog barks"); }
// }

// Animal a = new Dog(); // Upcasting
// a.eat(); // Works (eat() is in Animal)
// // a.bark(); // Error: bark() is not in Animal