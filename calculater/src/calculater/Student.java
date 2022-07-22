package calculater;

public class Student
{
     String name;
     String roll_no;
     String class_;
     String section;
     public Student()
     {
    	 
     }
	 public Student(String name, String roll_no, String class_, String section) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.class_ = class_;
		this.section = section;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", class_=" + class_ + ", section=" + section + "]";
	}
	public static void main(String[] args)
	{
		Student s=new Student("vinay","mca/10032/19","mca","A");
		System.out.println(s.toString());
	}
}
