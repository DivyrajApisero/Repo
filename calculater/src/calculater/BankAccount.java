package calculater;

public class BankAccount 
{
    String number;
    String holder_name;
    String type;
    String balance;
    String Status;
    public BankAccount()
    {
    	
    }
	public BankAccount(String number, String holder_name, String type, String balance, String status) {
		super();
		this.number = number;
		this.holder_name = holder_name;
		this.type = type;
		this.balance = balance;
		Status = status;
	}
	@Override
	public String toString() {
		return "BankAccount [number=" + number + ", holder_name=" + holder_name + ", type=" + type + ", balance="
				+ balance + ", Status=" + Status + "]";
	}
	public static void main(String [] args)
	{
		BankAccount a=new BankAccount("1111","Rajendra Singh","Saving","100000","running");
		System.out.print(a.toString());
	}
}
