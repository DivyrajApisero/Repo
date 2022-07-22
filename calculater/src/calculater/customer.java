package calculater;

public class customer
{
    double id;
    String name;
    String account_no;
    String dob;
    String address;
    public customer()
    {
    	
    }
	public customer(double id, String name, String account_no, String dob, String address) {
		super();
		this.id = id;
		this.name = name;
		this.account_no = account_no;
		this.dob = dob;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", account_no=" + account_no + ", dob=" + dob + ", address="
				+ address + "]";
	}
	public static void main(String[] args)
	{
		customer c=new customer(1,"verma","11111","12/01/1998","sri nagar");
		System.out.print(c.toString());
		
	}
}
