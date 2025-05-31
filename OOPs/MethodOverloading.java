class Calculator{
    public double average(int a, int b) {
        return (a + b) / 2.0;
    }

    public double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public double average(int a, int b, int c, int d) {
        return (a + b + c + d) / 4.0;
    }
}



public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("The average of 2 numbers is: " + calculator.average(2, 3));
        System.out.println("The average of 3 numbers is: " + calculator.average(2, 3, 4));
        System.out.println("The average of 4 numbers is: " + calculator.average(2, 3, 4, 5));
    }

    
}
 

// Return type of the method is not considered while overloading.
// The return type of the method can be different in method overloading.
// parameters should be different in method overloading.
// if same method name and parameters but thier order is different then it is also method overloading.
// Method overloading is also known as compile time polymorphism.