//there should be only one public class and that class is saved. If the class is not public then we can save it with any name.
public class Inheritance{
	public static void main(String[] args){
		CurrentAccount ac=new CurrentAccount("as2324","divya",7.89,3.2);
		ac.display();
	}
}
class Account{
	String accountNumber;
	String name;
	
	public Account(String accountNumber, String name){
		this.accountNumber=accountNumber;
		this.name=name;
	}
	
	public void display(){
		System.out.println("Account Number: "+accountNumber+"\nName: "+name);
	}
}
class SavingAccount extends Account{
	double interest;
	
	public SavingAccount(String accountNumber, String name, double interest){
		super(accountNumber,name);
		this.interest=interest;
	}
	
	@Override
	public void display(){
		System.out.println("Account Number: "+accountNumber+"\nName: "+name+"\nInterest: "+interest);
	}
}
class CurrentAccount extends SavingAccount{
	double dailyWithdrawLimit;
	public CurrentAccount(String accountNumber, String name, double interest,double dailyWithdrawLimit){
		super(accountNumber,name,interest);
		this.dailyWithdrawLimit=dailyWithdrawLimit;
	}
	@Override
	public void display(){
		System.out.println("Account Number: "+accountNumber+"\nName: "+name+"\nInterest: "+interest+"\ndaily with draw limit"+dailyWithdrawLimit);
	}
	
}
		