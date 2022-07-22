package calculater;

public class Login
{
    String user;
    String password;
    public Login()
    {
    	
    }
	public Login(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [user=" + user + ", password=" + password + "]";
	};
    public static void main(String[] args)
    {
    	Login l=new Login("ram","1234");
    	System.out.println(l.toString());
    }
}
