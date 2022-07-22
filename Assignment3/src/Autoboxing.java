
public class Autoboxing 
{
    public static void main(String[] args)
    { 
    	//Autoboxing
    	Integer inum = 3; //Assigning int to Integer: Autoboxing
    	Long lnum = 32L; //Assigning long to Long: Autoboxing
    	System.out.println(inum+" "+lnum);
    	//Unboxing
    	Integer num2 = new Integer(50);
    	int inumm = num2;
    	System.out.println(num2+" "+inumm);
    	// Autoboxing of character
        Character gfg = 'a';
       // Auto-unboxing of Character
        char ch = gfg;
        // Print statements
        System.out.println("Value of ch: " + ch);
        System.out.println(" Value of gfg: " + gfg);
    }
}
