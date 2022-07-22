
public class overloading 
{
  static int add(int a,int b)
  {
	  return a+b;
  }
  static int add(int a,int b,int c)
  {
	  return a+b+c;
  }
  static double add(double a,double b,double c)
  {
	  return a+b+c;
  }
  
  public static void main(String[] args)
  {
	  //Addition of Two Number
	  System.out.print("addition of two Integer"+add(3,4));
	  //Addition of Three Number 
	  System.out.println("addition of Three Integer"+add(3,4,5));
	  //Addition of the Double Values
	  System.out.println("addition of Three Integer"+add(3.1,4.5,5.4));
	  
	  
  }
	
}
