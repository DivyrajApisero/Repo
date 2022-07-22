//Java program to illustrate the 
// concept of single inheritance

// base class
class Animal
{
    void eat()
    {
       System.out.println("Eating...");
    }
}

// derived class
class Dog extends Animal
{
    
    void bark()
    { 
       System.out.println("Barking...");
    }
    
}

public class Single
{
	public static void main(String args[]) 
    {
        
        Dog tuffy = new Dog();
        tuffy.bark();
        tuffy.eat();
            
    }
}
