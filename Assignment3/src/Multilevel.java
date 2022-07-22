//Java program to illustrate the 
// concept of Multilevel inheritance

// base class
class Animall
{
    void eat()
    {
       System.out.println("Eating...");
    }
}

// derived Dog class
class Dogg extends Animall
{
    
    void bark()
    { 
       System.out.println("Barking...");
    }
    
}

// derived BabyDog class
class BabyDog extends Dogg
{
    
    void weep()
    { 
       System.out.println("Weeping...");
    }
    
}
public class Multilevel 
{

	public static void main(String args[]) 
    {
        
        BabyDog tuffy = new BabyDog();
        tuffy.weep();
        tuffy.bark();
        tuffy.eat();
            
    }
	
}
