
class Student{
    int instVariable; //store in object and object created in heap
    public static void main(String []args){
        int localVariable=0;      //local variable store in stack frame of method in stack area.
        Student st=new Student(); //st is reference variable store address of new Student() object
    }

    public int add(int num1,int num2){
        return num1+num2;
    }
}


public class StackVSHeap {
    public static void main(String[] args) {
        Student st=new Student();
        System.out.println(st.add(2,3));
    }
}


/*
 * Stack:
 * - The stack is used for the execution of a thread.
 * - It stores method-specific values that are short-lived, such as local variables and method call information.
 * - Memory allocation and deallocation in the stack are done automatically when a method is called and returns.
 * - It is faster but has limited size.
 * - Each thread has its own stack.

 * Heap:
 * - The heap is used for dynamic memory allocation.
 * - Objects and instance variables are stored in the heap.
 * - Memory in the heap is managed by the garbage collector, which frees memory that is no longer in use.
 * - It is slower compared to the stack but has a much larger size.
 * - The heap is shared among all threads.
 */