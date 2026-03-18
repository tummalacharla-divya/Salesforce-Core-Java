//WAP to store username and password of 10 users in a map.
//Accept Username and Password and display any of the below messages accordingly
//Display Login Successful if Username and Password matches with any of the 10 users.
//Display Incorrect Password if Password doesn’t match
//Display User not registered if Username does not match.
import java.util.*;
class UsernamePassword1{
	public static void main(String[] args){
		List<Employee1> list=new ArrayList<>();
		Employee1 emp1=new Employee1("tdivya","divya@123");
		Employee1 emp2=new Employee1("sravani","sravani@123");
		Employee1 emp3=new Employee1("lavanya","lavanya@123");
		Employee1 emp4=new Employee1("mounika","mounika@123");
		Employee1 emp5=new Employee1("mounika","mounika@123");
		Employee1 emp6=new Employee1("shyam","shyam@123");
		Employee1 emp7=new Employee1("sravanti","sravanti@123");
		Employee1 emp8=new Employee1("lakshmi","lakshmi@123");
		Employee1 emp9=new Employee1("lav","lav@123");
		Employee1 emp10=new Employee1("riya","riya@123");
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		list.add(emp9);
		list.add(emp10);
		
		Scanner sc=new Scanner(System.in);
		String Username=sc.next();
		String Password=sc.next();
		
		System.out.print(passwordChecker(Username,Password,list));
		
	}
	public static String passwordChecker(String Username, String Password, List<Employee1> list){
		for(Employee1 user:list){
			if(user.getUsername().equals(Username)){
				if(user.getUsername().equals(Username)&&user.getPassword().equals(Password)){
					return "Login Successful";
				}
				else if(!user.getPassword().equals(Password)){
					return "Incorrect Password";
				}
			}
			else{
				return "User not registered. ";
			}
		}
		return " ";
	}
}