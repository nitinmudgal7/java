package nm.domain;

public class Customer {

	//declare three private instance variables, firstName ,lastName and account
	private String firstName;
	private String lastName;
	private Account account; // customer 'has-a' account
	
	//declare a public constructor that takes two parameters (f and l)
	public Customer(String f, String l) {
		firstName = f;
		lastName = l;
	}
	
	//declare two public accessors(getter) for the object instance variables
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account acct) {
		account = acct;
		//can i have a return statement ? yes
//		return ; there will be always implicit return statement
	}
}
