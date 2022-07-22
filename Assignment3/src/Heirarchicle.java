//Java program to illustrate the 
// concept of Multilevel inheritance

// base class
class Animalll
{
    void eat()
    {
       System.out.println("Eating...");
    }
}

// derived Dog class
class Doggg extends Animalll
{
    
    void bark()
    { 
       System.out.println("Barking...");
    }
    
}

// derived Cat class
class Cat extends Animalll
{
    
    void meow()
    { 
       System.out.println("Meowing...");
    }
    
}

// derived Cow class
class Cow extends Animalll
{
    
    void moo()
    { 
       System.out.println("Mooing...");
    }
    
}
// driver class
public class Heirarchicle
{
	public static void main(String[] args)
	{
		Dog tuffy = new Dog();
	    Cat anna = new Cat();
	    Cow molly = new Cow();
	    tuffy.bark();
	    tuffy.eat();
	    anna.meow();
	    anna.eat();
	    molly.moo();
	    molly.eat();
	 
	}
}
