class Animal {
  Animal() {
    System.out.println("Animal constructor called");
    
  }
  void walk() {
    
    System.out.println("Animal is eating");
  }
}

class Mammal extends Animal {
  Mammal(String name) {
    System.out.println("Mammal constructor called with name: " + name);
  }
  Mammal() {
    this("Mammal");
    System.out.println("Mamal constructor called");
  }
  void walk() {
    System.out.println("Mammal is walking");
  }
}

class Dog extends Mammal {
  Dog() {
    System.out.println("Dog constructor called");
  }
  void bark() {
    System.out.println("Dog is barking");
  }
}



public class Inheritance {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.walk();
    dog.bark();
  }
}