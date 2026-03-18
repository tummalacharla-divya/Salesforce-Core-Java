class Account{
	public static String bankName; //this value is initialized at the time object creation. beacause static members are class members.
	String accountNumber;
	String branch;
	public Account(){
		System.out.println("I am invoked Automatically");
	}
	
	public Account(String accountNumber,String branch, String bankName){
		this.accountNumber=accountNumber;
		this.branch=branch;
		this.bankName=bankName;
	}
	
	public void display(){
		System.out.println("Account Number: "+accountNumber+"\nBranch: "+branch+"\nbankName: "+bankName);
	}
}
class ParametrizedConstructorDemo{
	public static void main(String[] args){
		Account acc=new Account();
		Account accounts=new Account("12537283DFS","Noida","SBI");
		/*acc.display(); // it will not print the account number and branch names . beacause it only call default constructor.
		accounts.display();
		
		accounts.branch="G Noida";
		accounts.display();
		
		acc.accountNumber="27943gdh";
		acc.display();*/
		
		acc.display();
		/*output:
		I am invoked Automatically
		Account Number: null
		Branch: null
		bankName: SBI*/
		
		accounts.bankName="PKL";
		acc.display();
	}
}