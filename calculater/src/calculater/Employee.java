package calculater;

public class Employee
{
	    double id;
	    String name;
		String designation;
	    double Salary;
	    public Employee()
	    {
	    	
	    }
	    public Employee(double id, String name, String designation, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.designation = designation;
	    }
	    @Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", Salary=" + Salary + "]";
		}
		public static void main(String[] args)
	    {
	    	Employee e=new Employee(1,"Rahul","Software Enginner",40000);
	    	System.out.println(e.toString());
	    }
	
}
